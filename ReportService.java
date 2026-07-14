
import java.util.Scanner;

public class ReportService {
    private StudentService studentService;
    private CourseService courseService;
    private EnrollmentService enrollmentService;

    Scanner sc=new Scanner(System.in);

    public ReportService(StudentService studentService,CourseService courseService,EnrollmentService enrollmentService){
        this.studentService = studentService;
        this.courseService=courseService;
        this.enrollmentService=enrollmentService;
    }


    public void totalStudent(){
        System.out.println();
        System.out.println("======================== Reports =======================");
        System.out.println("Total Students :-"+studentService.getStudents().size());
    }

    public void totalCourse(){
        System.out.println();
        System.out.println("Total Courses :-"+courseService.getCourses().size());
    }

    public void totalEnrollment(){
        System.out.println();
        System.out.println("Total Enrollments :-"+enrollmentService.getEnrollments().size());

    }

    public void paidStudentReport(){
        System.out.println("\n================ Paid Students =================");
        boolean found =false;
        for(Enrollment enrollment : enrollmentService.getEnrollments()){
            if(enrollment.getFeePaid()){
                Student student = studentService.findStudentById(enrollment.getStudentId());
                Course course = courseService.findCourseById(enrollment.getCourseId());
                System.out.println("-----------------------------------------");
                System.out.println("Student ID :-"+student.getStudentId());
                System.out.println("Student Name :-"+student.getStudentName());
                System.out.println("Course ID :-"+course.getCourseId());
                System.out.println("Course Name :-"+course.getCourseName());
                System.out.println("Fees paid : Yes");
                found=true;
            }
        }
        if(!found){
            System.out.println("No Paid Student");
        }

    
    }

    public void pendingFeeReport(){
            System.out.println("\n========= Pending Fee Students ===========");
            boolean found = false;
            for(Enrollment enrollment :enrollmentService.getEnrollments()){
                if(!enrollment.getFeePaid()){
                    Student student = studentService.findStudentById(enrollment.getStudentId());
                    Course course = courseService.findCourseById(enrollment.getCourseId());
                    System.out.println("----------------------------------");
                    System.out.println("Student ID :-"+student.getStudentId());
                    System.out.println("Student Name :-"+student.getStudentName());
                    System.out.println("Course ID :-"+course.getCourseId());
                    System.out.println("Course Name :-"+course.getCourseName());
                    System.out.println("Fee Paid : No");
                    found=true;
                }

            }
            if(!found){
                System.out.println("No Pending Fees");
            }


    }


    public void totalPaidStudents(){
        int count = 0;
        for(Enrollment enrollment :enrollmentService.getEnrollments()){
            if(enrollment.getFeePaid()){
                count++;
            }
        }
        System.out.println("Total Paid Students :-"+count);

    }

    public void totalPendingStudent(){
        int count =0;
        for(Enrollment enrollment:enrollmentService.getEnrollments()){
            if(enrollment.getFeePaid()){
                count++;
            }
        }
         System.out.println("Total Pending Students :- " + count);
    }

    public void studentByCourse(){
        System.out.println("Enter Course ID :-");
        int courseId = sc.nextInt();
        Course course = courseService.findCourseById(courseId);
        if(course == null){
            System.out.println("Course Not Found.");
            return;
        }
        System.out.println("\nCourse :-"+course.getCourseName());
        boolean found = false;
        for(Enrollment enrollment :enrollmentService.getEnrollments()){
            if(enrollment.getCourseId() == courseId){
                Student student =studentService.findStudentById(enrollment.getStudentId());
                System.out.println(student.getStudentId()+" - "+student.getStudentName());
                found=true;
            }
        }
        if(!found){
            System.out.println("No Students Enrolled.");
        }
    }

    public void courseByStudent(){
        System.out.println("Enter Student ID :-");
        int studentId =sc.nextInt();
        Student student = studentService.findStudentById(studentId);
        if(student == null){
            System.out.println("Student Not Found .");
            return;
        }

        System.out.println("\nStudent :-"+student.getStudentName());
        boolean found = false;
        for(Enrollment enrollment : enrollmentService.getEnrollments()){
            if(enrollment.getStudentId() == studentId){
                Course course = courseService.findCourseById(enrollment.getCourseId());
                System.out.println(course.getCourseId()+" - "+course.getCourseName());
                found=true;
            }
        }
        if(!found){
            System.out.println("No Course Enrolled.");
        }

    }

    public void instituteSummary(){
        int totalStudents = studentService.getStudents().size();
        int totalCourses = courseService.getCourses().size();
        int totalEnrollments = enrollmentService.getEnrollments().size();
        int paid =0;
        int pending =0;
        for(Enrollment enrollment :enrollmentService.getEnrollments()){
            if(enrollment.getFeePaid()){
                paid++;
            }
            else{
                pending++;
            }
        }

        System.out.println();
        System.out.println("=====================================================");
        System.out.println("         Institute Summary Report         ");
        System.out.println("======================================================");
        System.out.println("Total Students :-"+totalStudents);
        System.out.println("Total Courses :-"+totalCourses);
        System.out.println("Total Enrollments :-"+totalEnrollments);
        System.out.println("Paid Students :-"+paid);
        System.out.println("Pending Students :-"+pending);
        System.out.println("=====================================================");


    }


}