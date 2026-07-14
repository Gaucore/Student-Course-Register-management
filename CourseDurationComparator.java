
import java.util.Comparator;

public class CourseDurationComparator implements Comparator<Course>{
    @Override
    public  int compare(Course c1 , Course c2){
        return  Integer.compare(c1.getDuration(),c2.getDuration());
    }

}