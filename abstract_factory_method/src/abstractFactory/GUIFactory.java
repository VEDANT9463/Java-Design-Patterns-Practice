package abstractFactory;

import commonInterfaces.Button;
import commonInterfaces.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

