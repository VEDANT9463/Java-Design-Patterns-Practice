package classes;

import factory_method.commonInterface.IceCream;

public class VanillaIceCream implements IceCream {
    @Override
    public void eat() {
        System.out.println("Eating Vanilla IceCream");
    }
}
