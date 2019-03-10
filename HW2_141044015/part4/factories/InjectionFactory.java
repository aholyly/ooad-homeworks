package part4.factories;

import part4.injections.GearedTurbofan;
import part4.injections.Injection;
import part4.injections.Turbofan;
import part4.injections.Turbojet;
import part4.markets.Market;
import part4.planes.Plane;
import part4.seatings.Seating;

public class InjectionFactory extends AbstractFactory {

    @Override
    Plane getPlane(String model) {
        return null;
    }

    @Override
    Market getMarket(String marketName) {
        return null;
    }

    @Override
    Injection getInjection(String type) {
        Injection injection = null;

        if (type.equals("GearedTurbofan"))
            injection = new GearedTurbofan();
        else if (type.equals("Turbofan"))
            injection = new Turbofan();
        else if (type.equals("Turbojet"))
            injection = new Turbojet();

        return injection;
    }

    @Override
    Seating getSeatingType(String type) {
        return null;
    }
}
