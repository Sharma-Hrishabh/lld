package org.lld;


import org.lld.abstractFactory.AbstractFactoryPattern;
import org.lld.calculator.Calculator;
import org.lld.decorator.DecoratorPattern;
import org.lld.logger.LoggingClient;
import org.lld.observerpattern.ObserverPattern;
import org.lld.strategypattern.*;
import org.lld.tictactoe.Game;

public class Main {
    public static void main(String[] args) {
       // StrategyPattern strategyPattern = new StrategyPattern();
       // ObserverPattern observerPattern = new ObserverPattern();
       // DecoratorPattern decoratorPattern = new DecoratorPattern();
       // AbstractFactoryPattern abstractFactoryPattern  = new AbstractFactoryPattern();
        //Game game = new Game();
        //LoggingClient loggingClient = new LoggingClient();
        Calculator calculator = new Calculator();
        calculator.demo();
    }
}