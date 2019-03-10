package part2.accessories;

import part2.AccessoryDecorator;
import part2.Suit;

public class Flamethrower extends AccessoryDecorator {

    private Suit suit;

    public Flamethrower(Suit suit) {
        this.suit = suit;
    }

    @Override
    public String getType() {
        return suit.getType() + ",Flamethrower";
    }

    @Override
    public double weight() {
        return 2 + suit.weight();
    }

    @Override
    public double cost() {
        return 50 + suit.cost();
    }
}
