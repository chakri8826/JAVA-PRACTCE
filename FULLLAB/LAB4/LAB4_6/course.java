public class course{
    private String courseName;
    private String courseId;
    private int courseDuration;
    course(String courseName, String courseId, int courseDuration)
    {
        this.courseName=courseName;
        this.courseId=courseId;
        this.courseDuration=courseDuration;
    }
    public void setCourseName(String courseName)
    {
        this.courseName=courseName;
    }
    public void setCourseId(String courseId)
    {
        this.courseId=courseId;
    }
    public void setCourseDuration(int courseDuration)
    {
        this.courseDuration=courseDuration;
    }
    public String getCourseName()
    {
        return this.courseName;
    }
    public String getCourseId()
    {
        return this.courseId;
    }
    public int getCourseDuration()
    {
        return this.courseDuration;
    }
    public String toString()
    {
        return "Course Name"+courseName+"  Course Id:"+courseId+"  course Duration:"+courseDuration;
    }
}