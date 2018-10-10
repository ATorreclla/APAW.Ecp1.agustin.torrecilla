package es.upm.miw.patronstrategy;

public class Div implements Strategy {

    @Override
    public int calculate(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
}
