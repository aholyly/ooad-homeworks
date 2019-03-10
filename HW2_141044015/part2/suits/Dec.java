package part2.suits;

import part2.Suit;

public class Dec extends Suit {

    public Dec() {
        type = "Dec";
    }

    @Override
    public double weight() {
        return 25;
    }

    @Override
    public double cost() {
        return 500;
    }
}
