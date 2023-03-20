import java.util.Stack;

class CalculatorPresenterImpl implements CalculatorPresenter {
    private CalculatorView view;

    public CalculatorPresenterImpl(CalculatorView view) {
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void calculateExpression(String expression) {
        expression = expression.replaceAll("\\s+", "");
        try {
            double result = evaluate(expression);
            view.showResult(result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private double evaluate(String expression) {
        Stack<Double> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                int j = i;
                while (j < expression.length() && (Character.isDigit(expression.charAt(j)) || expression.charAt(j) == '.')) {
                    j++;
                }
                double operand = Double.parseDouble(expression.substring(i, j));
                operands.push(operand);
                i = j - 1;
            } else if (isOperator(c)) {
                while (!operators.empty() && hasHigherPrecedence(operators.peek(), c)) {
                    double b = operands.pop();
                    double a = operands.pop();
                    char operator = operators.pop();
                    double result = applyOperator(operator, a, b);
                    operands.push(result);
                }
                operators.push(c);
            } else {
                throw new IllegalArgumentException("Invalid character: " + c);
            }
        }

        while (!operators.empty()) {
            double b = operands.pop();
            double a = operands.pop();
            char operator = operators.pop();
            double result = applyOperator(operator, a, b);
            operands.push(result);
        }

        return operands.pop();
    }

    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private boolean hasHigherPrecedence(char a, char b) {
        return (a == '*' || a == '/') && (b == '+' || b == '-');
    }

    private double applyOperator(char operator, double a, double b) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}