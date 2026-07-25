import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private double gpa;
    private List<Course> enrolledCourses;

    public Student(String id, String name, String email, double gpa) {
        super(id, name, email);
        this.gpa = gpa;
        this.enrolledCourses = new ArrayList<>();
    }

    public double getGpa() { return gpa; }
    
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA value! Must be between 0.0 and 4.0.");
        }
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role  : Student");
        System.out.println("GPA   : " + gpa);
        System.out.println("Enrolled Courses:");
        if (enrolledCourses.isEmpty()) {
            System.out.println("   - No enrolled courses.");
        } else {
            for (Course course : enrolledCourses) {
                course.displayCourseDetails();
            }
        }
    }

    @Override
    public void executeRoleAction() {
        System.out.println("Action: Checking academic standing for student " + getName() + "...");
        if (gpa >= 3.5) {
            System.out.println("Status: Dean's List Honor Student.");
        } else if (gpa >= 2.0) {
            System.out.println("Status: Good Academic Standing.");
        } else {
            System.out.println("Status: Academic Probation Warning.");
        }
    }
}