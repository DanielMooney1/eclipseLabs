package lab6;
public class Teacher extends person{
    
    private int numCourses;
    private String[] courses = new String[10];

    public Teacher(String name, String address)
    {
        super(name, address);
    }
    public String ToString()
    {
        return "teacher [numCourses=" + numCourses + "," + super.toString() + "]";
    }
    public boolean addCourse(String course)
    {
        if(numCourses == 10)
        {
            return false;
        }
        else{
        courses[numCourses] = course;
        numCourses++;
        return true;
        }
    }
    public boolean removeCourse(String course)
    {
        return true;
    }
   
}
