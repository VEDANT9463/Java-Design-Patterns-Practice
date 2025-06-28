package Factory;

import factory_method.classes.ChocolateIceCream;
import factory_method.classes.VanillaIceCream;
import factory_method.commonInterface.IceCream;

public class IceCreamFactory {
    public static IceCream getIceCream(String type){
        if(type.equalsIgnoreCase("vanilla")){
            return new VanillaIceCream();
        }
        if(type.equalsIgnoreCase("chocolate")){
            return new ChocolateIceCream();
        }
        else{
            throw new IllegalArgumentException("Unsupported IceCream Type");
        }
    }
}
