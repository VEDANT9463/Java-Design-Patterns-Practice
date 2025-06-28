package factory_method;

import factory_method.Factory.IceCreamFactory;
import factory_method.commonInterface.IceCream;

public class Main {
    public static void main(String[] args) {
        IceCream ice1 = IceCreamFactory.getIceCream("vanilla");
        ice1.eat();

        IceCream ice2 = IceCreamFactory.getIceCream("chocolate");
        ice2.eat();
    }
}