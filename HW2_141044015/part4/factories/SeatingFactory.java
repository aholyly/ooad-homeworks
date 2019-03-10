package part4.factories;

import part4.injections.Injection;
import part4.markets.Market;
import part4.planes.Plane;
import part4.seatings.Leather;
import part4.seatings.Linen;
import part4.seatings.Seating;
import part4.seatings.Velvet;

public class SeatingFactory extends AbstractFactory {

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
        return null;
    }

    @Override
    Seating getSeatingType(String type) {
        Seating seating = null;

        if (seating.equals("Leather"))
            seating = new Leather();
        else if (seating.equals("Linen"))
            seating = new Linen();
        else if (seating.equals("Velvet"))
            seating = new Velvet();

        return seating;
    }
}
