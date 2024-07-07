package org.lld.decorator;

public class ExtraVeggies extends  ToppingDecorator{
    Pizza pz;
    public ExtraVeggies(Pizza pizza) {
        this.pz = pizza;
    }
    @Override
    public Integer cost() {
        return pz.cost()+30;
    }
}
