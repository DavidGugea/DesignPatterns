package CreationalDesignPatterns.AbstractFactory.factories;

import CreationalDesignPatterns.AbstractFactory.buttons.Button;
import CreationalDesignPatterns.AbstractFactory.buttons.WindowsButton;
import CreationalDesignPatterns.AbstractFactory.checkboxes.Checkbox;
import CreationalDesignPatterns.AbstractFactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WindowsCheckbox();
    }
}
