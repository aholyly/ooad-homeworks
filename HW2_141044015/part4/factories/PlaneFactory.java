package part4.factories;

import part4.injections.Injection;
import part4.markets.Market;
import part4.seatings.Seating;
import part4.planes.*;

public class PlaneFactory extends AbstractFactory {

    @Override
    Plane getPlane(String model) {
        Plane plane = null;

        if(model.equals("TPX100"))
            plane = new TPX100();
        else if(model.equals("TPX200"))
            plane = new TPX200();
        else if(model.equals("TPX300"))
            plane = new TPX300();

        return plane;
    }

    @Override
    Market getMarket(String marketName) {
        return null;
    }

    @Override
    Injection getInjection(String type) {
        return null;
    }

    @Override
    Seating getSeatingType(String type) {
        return null;
    }
}
