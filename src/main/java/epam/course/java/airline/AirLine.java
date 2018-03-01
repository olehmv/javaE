package epam.course.java.airline;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AirLine {

    private List<AirPlane>planes=new ArrayList<>();
    private Comparator<AirPlane>comparator=(AirPlane plane1,AirPlane plane2)->{
        if(plane1.flingthDistance()>plane2.flingthDistance())return 1;
        if(plane1.flingthDistance()<plane2.flingthDistance())return -1;
        return 0;
    };
    public long passagerCapccity() {
        int cap=0;
        for(AirPlane p:planes){
            cap+=p.capacity();
        }
    return cap;
    }

    public long cargoCapacity() {
        int cap=0;
        for(AirPlane p:planes){
            cap+=p.capacity();
        }
        return cap;
    }
    public void sortByDistance(){
        planes.sort(comparator);

    }

}
