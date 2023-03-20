interface CalculatorView {
    void setPresenter(CalculatorPresenter presenter);
    void showResult(double result);
    void start();
}