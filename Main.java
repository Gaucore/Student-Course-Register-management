
import java.util.Scanner;

public class  Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StudentService studentService  = new StudentService();
        CourseService courseService = new CourseService();
        EnrollmentService enrollmentService =new EnrollmentService(studentService, courseService);
        ReportService reportService  = new ReportService(studentService, courseService, enrollmentService);
        Menu menu = new Menu(studentService,courseService,enrollmentService,reportService);

        menu.start();
        
    }
}