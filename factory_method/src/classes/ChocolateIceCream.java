package classes;

import factory_method.commonInterface.IceCream;

public class ChocolateIceCream implements IceCream {
    @Override
    public void eat() {
        System.out.println("Eating Chocolate IceCream");
    }
}
