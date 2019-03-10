package part4.factories;

import part4.injections.Injection;
import part4.markets.Domestic;
import part4.markets.Eurasia;
import part4.markets.Market;
import part4.markets.Other;
import part4.planes.Plane;
import part4.seatings.Seating;

public class MarketFactory extends AbstractFactory {

    @Override
    Plane getPlane(String model) {
        return null;
    }

    @Override
    Market getMarket(String marketName) {
        Market market = null;

        if (market.equals("Domestic"))
            market = new Domestic();
        else if (market.equals("Eurasia"))
            market = new Eurasia();
        else if (market.equals("Other"))
            market = new Other();

        return market;
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
