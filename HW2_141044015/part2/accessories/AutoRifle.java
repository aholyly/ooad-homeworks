package part2.accessories;

import part2.AccessoryDecorator;
import part2.Suit;

public class AutoRifle extends AccessoryDecorator {

    Suit suit;

    public AutoRifle(Suit suit) {
        this.suit = suit;
    }

    @Override
    public String getType() {
        return suit.getType() + ",AutoRifle";
    }

    @Override
    public double weight() {
        return 1.5 + suit.weight();
    }

    @Override
    public double cost() {
        return 30 + suit.cost();
    }
}
