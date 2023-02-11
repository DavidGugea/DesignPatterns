package CreationalDesignPatterns.FactoryMethod.Factory;

import CreationalDesignPatterns.FactoryMethod.Buttons.Button;
import CreationalDesignPatterns.FactoryMethod.Buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
