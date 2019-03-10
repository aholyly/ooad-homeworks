package part2.accessories;

import part2.AccessoryDecorator;
import part2.Suit;

public class RocketLauncher extends AccessoryDecorator {

    Suit suit;

    public RocketLauncher(Suit suit) {
        this.suit = suit;
    }

    @Override
    public String getType() {
        return suit.getType() + ",RocketLauncher";
    }

    @Override
    public double weight() {
        return 7.5 + suit.weight();
    }

    @Override
    public double cost() {
        return 150 + suit.cost();
    }
}
