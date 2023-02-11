package CreationalDesignPatterns.AbstractFactory.buttons;

/**
 * Abstract Factory assumes that you have several families of products,
 * structured into separate class hierarchies (Button/Checkbox). All products
 * of the same family have the same common interface.
 *
 * This is the common interface for the buttons family.
 */
public interface Button {
    void paint();
}
