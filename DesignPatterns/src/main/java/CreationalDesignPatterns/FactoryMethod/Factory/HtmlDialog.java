package CreationalDesignPatterns.FactoryMethod.Factory;

import CreationalDesignPatterns.FactoryMethod.Buttons.Button;
import CreationalDesignPatterns.FactoryMethod.Buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
