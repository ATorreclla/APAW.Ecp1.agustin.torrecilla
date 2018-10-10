package es.upm.miw.patronstrategy;

public class Mod implements Strategy{

    @Override
    public int calculate(int firstNumber, int secondNumber) {
        return firstNumber % secondNumber;
    }
}