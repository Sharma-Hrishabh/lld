package org.lld.decorator;

public class ExtraCheese extends ToppingDecorator{
    Pizza pz;
    public ExtraCheese(Pizza pz){
        this.pz = pz;
    }
    @Override
    public Integer cost() {
        return pz.cost()+10;
    }
}
