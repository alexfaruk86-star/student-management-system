public class Instructor extends Person {
    private String department;

    public Instructor(String id, String name, String email, String department) {
        super(id, name, email);
        this.department = department;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role  : Instructor");
        System.out.println("Dept  : " + department);
    }

    @Override
    public void executeRoleAction() {
        System.out.println("Action: Assigning course workload and syllabus for " + getName() + " in " + department + ".");
    }
}