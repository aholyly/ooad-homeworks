package part4.planes;

public abstract class Plane {

    protected String model;
    protected String purpose;
    protected String skeleton;
    protected String engine;
    protected int seats;
    protected String injection = "None";
    protected String seating = "None";

    public String getModel() {
        return model;
    }

    public void constructSkeleton(){
        System.out.println("Skeleton: " + skeleton);
    }

    public void placeEngines(){
        System.out.println("Engine: " + engine);
    }

    public void placeSeats(){
        System.out.println("Seats: " + seats);
    }

}
