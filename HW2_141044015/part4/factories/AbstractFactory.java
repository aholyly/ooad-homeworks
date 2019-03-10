package part4.factories;

import part4.injections.Injection;
import part4.markets.Market;
import part4.planes.Plane;
import part4.seatings.Seating;

public abstract class AbstractFactory {
    abstract Plane getPlane(String model);
    abstract Market getMarket(String marketName);
    abstract Injection getInjection(String type);
    abstract Seating getSeatingType(String type);
}
