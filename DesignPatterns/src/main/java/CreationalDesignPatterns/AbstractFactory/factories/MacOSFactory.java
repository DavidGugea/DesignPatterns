package CreationalDesignPatterns.AbstractFactory.factories;

import CreationalDesignPatterns.AbstractFactory.buttons.Button;
import CreationalDesignPatterns.AbstractFactory.buttons.MacOSButton;
import CreationalDesignPatterns.AbstractFactory.checkboxes.Checkbox;
import CreationalDesignPatterns.AbstractFactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacOSCheckbox();
    }
}
