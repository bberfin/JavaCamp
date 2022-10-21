package entities;

public class Course {
    
    private int courseId;
    private String courseName;
    private String courseDescription;
    private double coursePrice;

    public Course(int courseId, String courseName, String courseDescription, double coursePrice) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.coursePrice = coursePrice;
    }

    public int getCourseId() {
        return courseId;
    }
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseDescription() {
        return courseDescription;
    }
    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
    public double getCoursePrice() {
        return coursePrice;
    }
    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;

    }    
}
