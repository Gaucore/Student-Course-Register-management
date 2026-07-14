
import java.util.Comparator;

public class CourseFeeComparator implements Comparator<Course> {
    @Override
    public int compare(Course c1,Course c2){
        return Double.compare(c1.getFees(), c2.getFees());
    }

}