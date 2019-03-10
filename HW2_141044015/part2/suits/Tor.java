package part2.suits;

import part2.Suit;

public class Tor extends Suit {

    public Tor() {
        type = "Tor";
    }

    @Override
    public double weight() {
        return 50;
    }

    @Override
    public double cost() {
        return 5000;
    }
}
