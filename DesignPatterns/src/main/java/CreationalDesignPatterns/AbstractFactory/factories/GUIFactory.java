package CreationalDesignPatterns.AbstractFactory.factories;

import CreationalDesignPatterns.AbstractFactory.buttons.Button;
import CreationalDesignPatterns.AbstractFactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckBox();
}
