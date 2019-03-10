package part4;

import part4.factories.AbstractFactory;

public class Main {

    public static void main(String[] args) {

        AbstractFactory injectionFactory = FactoryChooser.getFactory("Injection");
        AbstractFactory planeFactory = FactoryChooser.getFactory("Plane");
        AbstractFactory seatingFactory = FactoryChooser.getFactory("Seating");



    }
}
