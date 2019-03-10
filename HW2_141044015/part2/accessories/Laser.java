package part2.accessories;

import part2.AccessoryDecorator;
import part2.Suit;

public class Laser extends AccessoryDecorator {

    Suit suit;

    public Laser(Suit suit) {
        this.suit = suit;
    }

    @Override
    public String getType() {
        return suit.getType() + ",Laser";
    }

    @Override
    public double weight() {
        return 5.5 + suit.weight();
    }

    @Override
    public double cost() {
        return 200 + suit.cost();
    }
}
