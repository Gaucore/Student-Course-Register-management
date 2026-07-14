
import java.util.ArrayList;
import java.util.Scanner;

public class StudentService{
    Scanner sc=new Scanner(System.in);
    ArrayList<Student> students = new ArrayList<>();

    public void addStuddent(){
        try {
            
            System.out.println("Enter Student ID:-");
            int studentId = sc.nextInt();
            sc.nextLine();

            
            for(Student student : students){
                if(student.getStudentId() == studentId){
                    System.out.println("Student ID already exists");
                    return;
                }
            }
            
            System.out.println("Enter Student Name :-");
            String studentName = sc.nextLine();

            System.out.println("Enter Age :-");
            int age= sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Email :-");
            String email= sc.nextLine();

            System.out.println("Enter Mobile no :-");
            String mobile =sc.nextLine();

            Student student = new Student(studentId,studentName,age,email,mobile);
            students.add(student);

            System.out.println("Student Added Successfully");
            
        } catch (Exception e) {
            System.out.println("Invalid Input");
            sc.nextLine();
        }
    }

    public ArrayList<Student> getStudents(){
        return students;
    }

    public void viewStudent(){
        try {
            if(students.isEmpty()){
                System.out.println("No Student Available");
                return;
            }

            System.out.println();
            System.out.println("========================= Student List =========================");
            for(Student student : students){
                student.displayStudent();
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
            sc.nextLine();
        }
    }

    public void searchStudent(){
        try {
            System.out.println("Enter Student ID :-");
            int id=sc.nextInt();
            for(Student student :students){
                if(student.getStudentId() == id){
                    student.displayStudent();
                    return;
                }
            }
            System.out.println("No Student Available");
        } catch (Exception e) {
            System.out.println("Invalid Input");
            sc.nextLine();
        }
    }

    public Student findStudentById(int id){
        for(Student student :students){
            if(student.getStudentId() == id){
                return student;
            }
        }
        return null;
    }

    public void updateStudent(){
        try {
            System.out.println("Enter Student ID :-");
            int id = sc.nextInt();
            sc.nextLine();

            for(Student student : students){
                if(student.getStudentId() == id){
                    System.out.println("Enter the update Student Name :-");
                    String studentName = sc.nextLine();
                    student.setStudentName(studentName);

                    System.out.println("Enter the update Student Age :-");
                    int age = sc.nextInt();
                    student.setAge(age);
                    sc.nextLine();

                    System.out.println("Enter the update Student Email :-");
                    String email = sc.nextLine();
                    student.setEmail(email);

                    System.out.println("Enter the update Student Mobile :-");
                    String mobile = sc.nextLine();
                    student.setMobile(mobile);

                    System.out.println("Student updated Successfully");

                    return;
                }

            }
            System.out.println("Student Not found");

        } catch (Exception e) {
            System.out.println("Invalid input");
            sc.nextLine();
        }
    }

    public void deleteStudent(){
        try {
            System.out.println("Enter student ID :-");
            int id = sc.nextInt();
            sc.nextLine();
            for(Student student :students){
                if(student.getStudentId() == id){
                    students.remove(student);
                    System.out.println("Student Delete Successfully.");
                    return;
                }
            }
            System.out.println("Student Not found");
            
        } catch (Exception e) {
            System.out.println("Invalid Input");
            sc.nextLine();
        }
    }
    

}