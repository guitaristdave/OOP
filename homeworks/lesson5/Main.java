
public class Main {

    public static void main(String[] args) {
        CalculatorView view = new ConsoleCalculatorView();
        CalculatorPresenter presenter = new CalculatorPresenterImpl(view);
        view.setPresenter(presenter);
        view.start();
    }
}