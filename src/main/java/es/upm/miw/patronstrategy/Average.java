package es.upm.miw.patronstrategy;

public class Average implements Strategy {

    @Override
    public int calculate(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber) / 2;
    }
}