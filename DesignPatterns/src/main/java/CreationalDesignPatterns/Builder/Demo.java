package CreationalDesignPatterns.Builder;

import CreationalDesignPatterns.Builder.builders.CarBuilder;
import CreationalDesignPatterns.Builder.builders.CarManualBuilder;
import CreationalDesignPatterns.Builder.cars.Car;
import CreationalDesignPatterns.Builder.cars.Manual;
import CreationalDesignPatterns.Builder.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client (application code).
        // That's because application knows better which builder to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since Director is not aware and not dependent on concrete builder and products.
        Car car = builder.getResult();
        System.out.println("Car built:\n " + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
