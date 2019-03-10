package part3;

public class Main {



    public static void main(String[] Args) {

        PlaneFactory factory = new PlaneFactory();

        Plane plane1 = factory.choosePlane("TPX100");
        Plane plane2 = factory.choosePlane("TPX200");
        Plane plane3 = factory.choosePlane("TPX300");

        System.out.println("TEST TPX100");
        System.out.println("-----------");
        System.out.println(plane1.getModel());
        plane1.constructSkeleton();
        plane1.placeEngines();
        plane1.placeSeats();
        System.out.println("--------------------------\n");

        System.out.println("TEST TPX200");
        System.out.println("-----------");
        System.out.println(plane2.getModel());
        plane2.constructSkeleton();
        plane2.placeEngines();
        plane2.placeSeats();
        System.out.println("--------------------------\n");

        System.out.println("TEST TPX300");
        System.out.println("-----------");
        System.out.println(plane3.getModel());
        plane3.constructSkeleton();
        plane3.placeEngines();
        plane3.placeSeats();
        System.out.println("--------------------------");

    }
}
