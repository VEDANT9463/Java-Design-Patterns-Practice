import Application.Application;
import abstractFactory.GUIFactory;
import concreateFactory.MacFactory;
import concreateFactory.WindowsFactory;

public class Main {
    public static void main(String[] args){
        GUIFactory factory;

        /* choose factory based on config/environment */

        String os = "mac"; //windows

        if(os.equalsIgnoreCase("mac")){
            factory = new MacFactory();
        }else{
            factory = new WindowsFactory();
        }

        Application app = new Application(factory);

        app.renderUi();

    }
}