package part3;

import part3.planes.TPX100;
import part3.planes.TPX200;
import part3.planes.TPX300;

public class PlaneFactory {

    public Plane choosePlane(String model){
        Plane plane = null;

        if(model.equals("TPX100"))
            plane = new TPX100();
        else if(model.equals("TPX200"))
            plane = new TPX200();
        else if(model.equals("TPX300"))
            plane = new TPX300();

        return plane;
    }
}
