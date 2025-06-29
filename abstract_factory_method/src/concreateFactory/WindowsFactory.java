package concreateFactory;

import abstractFactory.GUIFactory;
import commonInterfaces.Button;
import commonInterfaces.Checkbox;
import concreateImplementation.windows.WindowsButton;
import concreateImplementation.windows.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
