

public class Student implements Comparable<Student> {
    private int studentId;
    private String studentName;
    private int age;
    private String email;
    private String mobile;

    public Student(int studentId,String studentName,int age,String email,String mobile){
        this.studentId = studentId;
        this.studentName=studentName;
        this.age=age;
        this.email=email;
        this.mobile=mobile;
    }

    public int getStudentId(){
        return studentId;
    }

    public String getStudentName(){
        return studentName;
    }

    public int getAge(){
        return age;
    }

    public String getEmail(){
        return email;
    }

    public String getMobile(){
        return mobile;
    }


    public void setStudentId(int studentId){
        this.studentId=studentId;
    }

    public void setStudentName(String studentName){
        this.studentName=studentName;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public void setMobile(String mobile){
        this.mobile=mobile;
    }


    public void displayStudent(){
        System.out.println("-------------------------------------------------");
        System.out.println("Student ID :-"+studentId);
        System.out.println("Student Name :-"+studentName);
        System.out.println("Age :-"+age);
        System.out.println("Email :-"+email);
        System.out.println("Mobile :-"+mobile);
    }


    @Override
    public int compareTo(Student other){
        return this.studentId - other.studentId;
    }
}