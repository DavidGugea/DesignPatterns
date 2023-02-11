package CreationalDesignPatterns.FactoryMethod.Factory;

import CreationalDesignPatterns.FactoryMethod.Buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
