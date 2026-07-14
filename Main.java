
import java.util.Scanner;

public class  Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StudentService studentService  = new StudentService();
        CourseService courseService = new CourseService();
        EnrollmentService enrollmentService =new EnrollmentService(studentService, courseService);
        ReportService reportService  = new ReportService(studentService, courseService, enrollmentService);
        int choice ;

        do { 

            System.out.println();
            System.out.println("==========================================");
            System.out.println("Student Course Registration");
            System.out.println("=========================================");

            System.out.println("----------------- Student -----------------");
            System.out.println("1.Add Student");
            System.out.println("2.View Student");
            System.out.println("3.Search Student");
            System.out.println("4.Update Student");
            System.out.println("5.Delete Student");

            System.out.println("------------------- Course -------------------");
            System.out.println("6.Add Course");
            System.out.println("7.View Course");   
            System.out.println("8.Search Course");
            System.out.println("9.Update Course");   
            System.out.println("10.Delete Course");

            System.out.println("---------------- Enrollment ----------------");  
            System.out.println("11.Add Enrollment"); 
            System.out.println("12.View Enrollment"); 
            System.out.println("13.Remove Enrollment"); 

            System.out.println("----------------- Reports ----------------");
            System.out.println("14.Total Students");
            System.out.println("15.Total Courses");
            System.out.println("16.Total Enrollments");
            System.out.println("17.Paid Students");
            System.out.println("18.Pending Fees Students");
            System.out.println("19.Total Paid Students");
            System.out.println("20.Total Pending Students");
            System.out.println("21.Students by Course");
            System.out.println("22.Course by Student");
            System.out.println("23.Institute Summary");

            System.out.println("24.Exit");
            System.out.println("Enter the your choice :-");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    studentService.addStuddent();;
                    break;

                case 2:
                    studentService.viewStudent();;
                    break;

                case 3:
                    studentService.searchStudent();
                    break;
                
                case 4:
                    studentService.updateStudent();
                    break;

                case 5:
                    studentService.deleteStudent();
                    break;

                case 6:
                    courseService.addCourse();
                    break;

                case 7:
                    courseService.viewCourse();
                    break;

                 case 8:
                    courseService.searchCourse();
                    break;

                case 9:
                    courseService.updateCourse();
                    break;

                case 10:
                    courseService.deleteCourse();
                    break;

                case 11:
                    enrollmentService.registerStudent();
                    break;

                 case 12:
                    enrollmentService.viewEnrollment();
                    break;

                case 13:
                    enrollmentService.removeEnrollment();
                    break;

                case 14:
                    reportService.totalStudent();
                    break;

                case 15:
                    reportService.totalCourse();
                    break;

                case 16:
                    reportService.totalEnrollment();
                    break;

                case 17:
                    reportService.paidStudentReport();
                    break;

                case 18:
                    reportService.pendingFeeReport();
                    break;

                case 19:
                    reportService.totalPaidStudents();
                    break;

                case 20:
                    reportService.totalPendingStudent();
                    break;

                case 21:
                    reportService.studentByCourse();
                    break;

                case 22:
                    reportService.courseByStudent();
                    break;

                case 23:
                    reportService.instituteSummary();
                    break;

                case 24:
                    System.out.println("Thank you......");
                    break;

                default:
                    System.out.println("Invalid Input");
            }

            
        } while (choice != 24);
    }
}