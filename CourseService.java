
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CourseService {
        Scanner sc=new Scanner(System.in);
        ArrayList<Course> courses = new ArrayList<>();   

        public void addCourse(){
            try {
                System.out.println("Enter Course ID :-");
                int courseId = sc.nextInt();
                sc.nextLine();

                for(Course course :courses){
                    if(course.getCourseId() == courseId){
                        System.out.println("Course ID is already exist");
                        return;
                    }
                }

                System.out.println("Enter Course Name :-");
                String courseName = sc.nextLine();

                System.out.println("Enter Course duration :-");
                int duration = sc.nextInt();

                System.out.println("Enter Course Fees :-");
                double fees = sc.nextDouble();

                Course course  = new Course(courseId, courseName, duration, fees);
                courses.add(course);
                System.out.println("Course Added Successfully.");


            } catch (Exception e) {
                System.out.println("Invalid Input");
                sc.nextLine();
            }
        }

        public ArrayList<Course> getCourses(){
            return courses;
        }

        public void viewCourse(){
            try {
                if(courses.isEmpty()){
                    System.out.println("Sorry Course is not available");
                    return;
                }
                System.out.println();
                System.out.println("==================== Course List =======================");
                for(Course course : courses){
                    course.displayCourse();
                }
            } catch (Exception e) {
                System.out.println("Invalid Input");
                sc.nextLine();
            }
        }

        public void searchCourse(){
            try {
                System.out.println("Enter Course ID :-");
                int id =sc.nextInt();
                sc.nextLine();
                for(Course course :courses){
                    if(course.getCourseId() == id){
                        course.displayCourse();
                        return;
                    }
                }
                System.out.println("Course Not found");

            } catch (Exception e) {
                System.out.println("Invalid Input");
                sc.nextLine();
            }
        }

        public Course findCourseById(int id){
            for(Course course :courses){
                if(course.getCourseId() == id){
                    return course;
                }
            }
            return null;
        }

        public Course getCourseById(int id) throws CourseNotFoundException{
                Course course = findCourseById(id);
                if(course == null){
                    throw new CourseNotFoundException("Course ID " + id + " Not Found.");
                }
                return course;
        }

        public void updateCourse(){
            try {
                System.out.println("Enter Course ID :-");
                int id = sc.nextInt();
                sc.nextLine();
                for(Course course :courses){
                    if(course.getCourseId() == id){
                        System.out.println("Enter the update Course Name :-");
                        String courseName = sc.nextLine();
                        course.setCourseName(courseName);

                        System.out.println("Enter the update Course Duration :-");
                        int duration = sc.nextInt();
                        course.setDuration(duration);

                        System.out.println("Enter the update Course Fees :-");
                        double fees= sc.nextDouble();
                        course.setFees(fees);

                        System.out.println("Course update Successfully.");
                        return;
                        
                    }
                }
                System.out.println("Course Not Found");
            } catch (Exception e) {

                System.out.println("Invalid Input");
                sc.nextLine();
            }
        }

        public void deleteCourse(){
            try {
                System.out.println("Enter Course ID :-");
                int id = sc.nextInt();
                sc.nextLine();

                for(Course course :courses){
                    if(course.getCourseId() == id){
                        courses.remove(course);
                        System.out.println("Course delete successfully.");
                        return;
                    }
                }
                System.out.println("Course Not Found");

            } catch (Exception e) {
                System.out.println("Invlid Input");
                sc.nextLine();
            }
        }


        public void sortCourseByFees(){
            if(courses.isEmpty()){
                System.out.println("No Course Found.");
                return;
            }

            Collections.sort(courses,new CourseFeeComparator());
            System.out.println("\n=================== Courses Sorted By Fees =====================");
            viewCourse();

        }

        public void sortCourseByDuration(){
            if(courses.isEmpty()){
                System.out.println("No Course Found.");
                return;
            }

            Collections.sort(courses,new CourseDurationComparator());
            System.out.println("\n ========================== Course Sorted By Duration =======================");
            viewCourse();
        }

}