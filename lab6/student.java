package lab6;

public class student extends person {

    private int numCourses;
    private String[] courses = new String[10];
    private int[] grades = new int[10];

    public student(String name, String address)
    {
      super(name, address);
    }

    public String ToString()
    {
        return "Student [numCourses=" + numCourses + "," + super.toString() + "]";
    }
    public void addCourseGrade(String course , int grade)
    {
        courses[numCourses] = course;
        grades[numCourses] = grade;
       numCourses++;
    }
    public void printGrades()
    {
    System.out.println("student grades");
    for (int i = 0; i < numCourses; i++)
    {
        System.out.println(courses[i] + ": " + grades[i]);
    }
    }
    public double getAverageGrade()
    {
        int total = 0;
        for(int i = 0; i < numCourses; i++)
        {
            total += grades[i];
        }
        double avg = total / numCourses;
        return avg;
    }
}
