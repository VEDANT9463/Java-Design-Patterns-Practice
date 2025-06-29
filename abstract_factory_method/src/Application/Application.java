package Application;
import abstractFactory.GUIFactory;
import commonInterfaces.Button;
import commonInterfaces.Checkbox;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void renderUi(){
        button.render();
        checkbox.render();
    }
}
