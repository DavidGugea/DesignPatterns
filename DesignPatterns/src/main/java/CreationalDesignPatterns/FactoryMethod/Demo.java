package CreationalDesignPatterns.FactoryMethod;

import CreationalDesignPatterns.FactoryMethod.Factory.Dialog;
import CreationalDesignPatterns.FactoryMethod.Factory.HtmlDialog;
import CreationalDesignPatterns.FactoryMethod.Factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if(System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
