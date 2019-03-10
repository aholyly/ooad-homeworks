package part4;

import part4.factories.*;

public class FactoryChooser {

    public static AbstractFactory getFactory(String factoryName) {
        AbstractFactory factory = null;

        if (factoryName.equals("Injection"))
            factory = new InjectionFactory();
        else  if (factoryName.equals("Market"))
            factory = new MarketFactory();
        else if (factoryName.equals("Plane"))
            factory = new PlaneFactory();
        else if (factoryName.equals("Seating"))
            factory = new SeatingFactory();

        return factory;
    }
}
