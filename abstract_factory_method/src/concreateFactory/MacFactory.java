package concreateFactory;

import abstractFactory.GUIFactory;
import commonInterfaces.Button;
import commonInterfaces.Checkbox;
import concreateImplementation.mac.MacButton;
import concreateImplementation.mac.MacCheckbox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
