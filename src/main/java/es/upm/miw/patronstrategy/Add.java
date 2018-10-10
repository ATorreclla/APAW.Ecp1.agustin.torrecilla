package es.upm.miw.patronstrategy;

public class Add implements Strategy {
    @Override
    public int calculate(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
}
