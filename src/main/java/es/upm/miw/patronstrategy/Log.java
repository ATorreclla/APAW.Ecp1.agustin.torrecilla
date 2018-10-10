package es.upm.miw.patronstrategy;

public class Log implements Strategy{

    @Override
    public int calculate(int firstNumber, int secondNumber) {
        return (int) Math.log10(firstNumber + secondNumber);
    }
}
