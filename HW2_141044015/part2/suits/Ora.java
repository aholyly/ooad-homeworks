package part2.suits;

import part2.Suit;

public class Ora extends Suit {

    public Ora() {
        type = "Ora";
    }

    @Override
    public double weight() {
        return 30;
    }

    @Override
    public double cost() {
        return 1500;
    }
}
