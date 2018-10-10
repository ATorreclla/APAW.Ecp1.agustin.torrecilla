package es.upm.miw.patronstrategy;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int firstNumber, int secondNumber){
        return strategy.calculate(firstNumber, secondNumber);
    }
}
