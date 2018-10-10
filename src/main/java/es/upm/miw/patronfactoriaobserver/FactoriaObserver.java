package es.upm.miw.patronfactoriaobserver;

import java.util.Observable;

import java.util.Observer;

public class FactoriaObserver implements Observer {

    public FactoriaObservable factoriaObservable;

    public FactoriaObserver(FactoriaObservable factoriaObservable){
        this.factoriaObservable = factoriaObservable;
        this.factoriaObservable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg){
        System.out.println(arg);
    }
}