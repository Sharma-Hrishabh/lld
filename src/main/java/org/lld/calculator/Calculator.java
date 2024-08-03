package org.lld.calculator;

public class Calculator {
    public void Calculate() {


    }

    public void demo(){
        System.out.println("executing Calculator");

        ArithmeticExpression two = new Number(2);

        ArithmeticExpression one = new Number(1);
        ArithmeticExpression seven = new Number(7);

        ArithmeticExpression child = new Expression(one,seven,Operation.ADD);

        ArithmeticExpression root = new Expression(two,child,Operation.MULTIPLY);
        System.out.println(root.evaluate());
    }
}
