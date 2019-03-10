package part2;

public abstract class Suit {
    protected String type = "unknown";

    public String getType() {
        return type;
    }

    public abstract double weight();
    public abstract double cost();
}
