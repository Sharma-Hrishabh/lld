package org.lld.decorator;

public class DecoratorPattern {
    public DecoratorPattern(){
        Pizza pz1 = new ExtraCheese(new Margherita());
        Pizza pz2 = new ExtraVeggies(new FarmHouse());

        System.out.println("Cost of Margherita with cheese:"+pz1.cost());
        System.out.println("Cost of Farmhouse with Veggies:"+pz2.cost());

    }
}
