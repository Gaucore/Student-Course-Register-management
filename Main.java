
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
        // int choice ;

        // do { 

        //     System.out.println();
        //     System.out.println("==========================================");
        //     System.out.println("Student Course Registration");
        //     System.out.println("=========================================");

        //     System.out.println("----------------- Student -----------------");
        //     System.out.println("1.Add Student");
        //     System.out.println("2.View Student");
        //     System.out.println("3.Search Student");
        //     System.out.println("4.Update Student");
        //     System.out.println("5.Delete Student");
        //     System.out.println("6.Sort Students By ID");
        //     System.out.println("7.Sort Students By Name");



        //     System.out.println("------------------- Course -------------------");
        //     System.out.println("8.Add Course");
        //     System.out.println("9.View Course");   
        //     System.out.println("10.Search Course");
        //     System.out.println("11.Update Course");   
        //     System.out.println("12.Delete Course");
        //     System.out.println("13.Sort Course By Fees");
        //     System.out.println("14.Sort Course By Durations");



        //     System.out.println("---------------- Enrollment ----------------");  
        //     System.out.println("15.Add Enrollment"); 
        //     System.out.println("16.View Enrollment"); 
        //     System.out.println("17.Remove Enrollment"); 

        //     System.out.println("----------------- Reports ----------------");
        //     System.out.println("18.Total Students");
        //     System.out.println("19.Total Courses");
        //     System.out.println("20.Total Enrollments");
        //     System.out.println("21.Paid Students");
        //     System.out.println("22.Pending Fees Students");
        //     System.out.println("23.Total Paid Students");
        //     System.out.println("24.Total Pending Students");
        //     System.out.println("25.Students by Course");
        //     System.out.println("26.Course by Student");
        //     System.out.println("27.Institute Summary");

        //     System.out.println("28.Exit");
        //     System.out.println("Enter the your choice :-");
        //     choice = sc.nextInt();
        //     switch (choice) {
        //         case 1:
        //             studentService.addStuddent();;
        //             break;

        //         case 2:
        //             studentService.viewStudent();;
        //             break;

        //         case 3:
        //             studentService.searchStudent();
        //             break;
                
        //         case 4:
        //             studentService.updateStudent();
        //             break;

        //         case 5:
        //             studentService.deleteStudent();
        //             break;

        //         case 6:
        //             studentService.sortStudentById();
        //             break;
                
        //         case 7:
        //             studentService.sortStudentsByName();
        //             break;

        //         case 8:
        //             courseService.addCourse();
        //             break;

        //         case 9:
        //             courseService.viewCourse();
        //             break;

        //          case 10:
        //             courseService.searchCourse();
        //             break;

        //         case 11:
        //             courseService.updateCourse();
        //             break;

        //         case 12:
        //             courseService.deleteCourse();
        //             break;

        //         case 13:
        //             courseService.sortCourseByFees();
        //             break;

        //         case 14:
        //             courseService.sortCourseByDuration();
        //             break;

        //         case 15:
        //             enrollmentService.registerStudent();
        //             break;

        //          case 16:
        //             enrollmentService.viewEnrollment();
        //             break;

        //         case 17:
        //             enrollmentService.removeEnrollment();
        //             break;

        //         case 18:
        //             reportService.totalStudent();
        //             break;

        //         case 19:
        //             reportService.totalCourse();
        //             break;

        //         case 20:
        //             reportService.totalEnrollment();
        //             break;

        //         case 21:
        //             reportService.paidStudentReport();
        //             break;

        //         case 22:
        //             reportService.pendingFeeReport();
        //             break;

        //         case 23:
        //             reportService.totalPaidStudents();
        //             break;

        //         case 24:
        //             reportService.totalPendingStudent();
        //             break;

        //         case 25:
        //             reportService.studentByCourse();
        //             break;

        //         case 26:
        //             reportService.courseByStudent();
        //             break;

        //         case 27:
        //             reportService.instituteSummary();
        //             break;

        //         case 28:
        //             System.out.println("Thank you......");
        //             break;

        //         default:
        //             System.out.println("Invalid Input");
        //     }

            
        // } while (choice != 28);
    }
}