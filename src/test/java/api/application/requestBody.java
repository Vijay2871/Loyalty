package api.application;

import com.segments.pojo.Segment;
import com.segments.pojo.Segments;

import java.util.ArrayList;
import java.util.List;

public class requestBody {

    public  static Segments negativeCustomerIdRequest(String segment){
        Segments fs=new Segments();
Segment s1 = new Segment();
       List<Segment> jsonArray=new ArrayList<>();
     jsonArray.add(s1);
     return fs.setSegments(jsonArray);

    }
}
