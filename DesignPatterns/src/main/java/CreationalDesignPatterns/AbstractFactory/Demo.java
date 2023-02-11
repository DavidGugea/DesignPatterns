package CreationalDesignPatterns.AbstractFactory;

import CreationalDesignPatterns.AbstractFactory.app.Application;
import CreationalDesignPatterns.AbstractFactory.factories.GUIFactory;
import CreationalDesignPatterns.AbstractFactory.factories.MacOSFactory;
import CreationalDesignPatterns.AbstractFactory.factories.WindowsFactory;
import CreationalDesignPatterns.FactoryMethod.Factory.WindowsDialog;
import org.jetbrains.annotations.NotNull;

import java.util.Locale;

public class Demo {
    public static @NotNull Application configureApplication() {
        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase(Locale.ROOT);
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }

        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
