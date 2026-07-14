
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EnrollmentService{
    Scanner sc=new Scanner(System.in);
    
    ArrayList<Enrollment> enrollments = new ArrayList<>();

    private  StudentService studentService;
    private CourseService courseService;

    public EnrollmentService(StudentService studentService,CourseService courseService){
        this.studentService = studentService;
        this.courseService = courseService;
    }



    // Relation between student and course

    public void registerStudent(){
        try {
            System.out.println("Enter Student ID :-");
            int sid = sc.nextInt();
            Student student = studentService.getStudentById(sid);
            
            // if(student == null){
            //     System.out.println("Student not found");
            //     return;
            // }

            System.out.println("Enter Coourse ID :-");
            int cid =sc.nextInt();
            // Course course = courseService.findCourseById(cid);
            Course course = courseService.getCourseById(cid);

            // if(course == null){
            //     System.out.println("Course not found");
            //     return;
            // }

            for(Enrollment enrollment : enrollments){
                if(enrollment.getStudentId()==sid &&
                enrollment.getCourseId()==cid){
                    System.out.println("Student already enrolled in this course.");
                    return;
                }
            }

            
            System.out.print("Fee Paid (true/false): ");
            boolean feePaid = sc.nextBoolean();




            Enrollment enrollment = new Enrollment(sid, cid, feePaid);
            enrollments.add(enrollment);

            System.out.println("Enrollment added Successfully.");


        } catch (StudentNotFoundException | CourseNotFoundException   e) {
            System.out.println(e.getMessage());
            // sc.nextLine();
            // return;
        }
    }


    public ArrayList<Enrollment> getEnrollments(){
        return enrollments;
    }


    public void viewEnrollment(){
        try {
            if(enrollments.isEmpty()){
                System.out.println("Enrollment is not Found");
                return;
            }
            System.out.println("================ Enrollment List ===================");
            for(Enrollment enrollment :enrollments){
                Student student =studentService.findStudentById(enrollment.getStudentId());
                Course course =courseService.findCourseById(enrollment.getCourseId());

                enrollment.displayEnrollment(student, course);
            }

        } catch (Exception e) {
            System.out.println("Invalid Input");
            sc.nextLine();
        }
    }

    public void removeEnrollment(){
        try {
            System.out.println("Enter Student ID :-");
            int sid = sc.nextInt();

            System.out.println("Enter Course ID :-");
            int cid = sc.nextInt();

            Iterator<Enrollment> iterator = enrollments.iterator();
            while (iterator.hasNext()) {
                    Enrollment enrollment =iterator.next();
                    if(enrollment.getStudentId() == sid && enrollment.getCourseId() == cid){
                        iterator.remove();
                        System.out.println("Enrollment Removed succesfully");
                        return;
                    }                
            }
            System.out.println("Enrollment is not Found");  
        } catch (Exception e) {
            System.out.println("Invalid Input");
            sc.nextLine();
        }
    }


}