public class Course {
    private int courseId;
    private String courseName;
    private int duration;
    private double fees;
    public Course(int courseId,String courseName,int duration,double fees){
        this.courseId=courseId;
        this.courseName=courseName;
        this.duration=duration;
        this.fees=fees;
    }

    public int getCourseId(){
        return courseId;
    }

    public String getCourseName(){
        return courseName;
    }

    public int getDuration(){
        return duration;
    }
    
    public double getFees(){
        return fees;
    }

    public void setCourseId(int courseId){
        this.courseId=courseId;
    }

    public void setCourseName(String courseName){
        this.courseName=courseName;
    }

    public void setDuration(int duration){
        this.duration=duration;
    }

    public void setFees(double fees){
        this.fees=fees;
    }

    public void displayCourse(){
        System.out.println("--------------------------------------------------");
        System.out.println("Course ID :-"+courseId);
        System.out.println("Course Name :-"+courseName);
        System.out.println("Duration :-"+duration+ "Month");
        System.out.println("Fees :-"+fees);

    }

}