public class Enrollment{
    private int studentId;
    private int courseId;
    private boolean feePaid;

    public Enrollment(int studentId,int courseId,boolean feePaid){
         this.studentId = studentId;
        this.courseId = courseId;
        this.feePaid = feePaid;
    }

    public int getStudentId(){
        return studentId;
    }

    public int getCourseId(){
        return courseId;
    }

    public boolean getFeePaid(){
        return feePaid;
    }

    public void setStudentId(int studentId){
        this.studentId=studentId;
    }

    public void setCourseId(int courseId){
        this.courseId=courseId;
    }

    public void setFeePaid(boolean feePaid){
        this.feePaid=feePaid;
    }

    public void displayEnrollment(Student student, Course course){
        System.out.println("-----------------------------------------------------");
        System.out.println("Student ID :-"+studentId);
        System.out.println("Student Name :-"+student.getStudentName());
    
        System.out.println("Course ID :-"+courseId);
        System.out.println("Course Name :-"+course.getCourseName());
        
        System.out.println("Fee Paid :-"+(feePaid?"Yes":"No"));


    }

}