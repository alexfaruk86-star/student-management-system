import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        Student s1 = new Student("ST101", "Alice Tan", "alice@cityu.edu.my", 3.85);
        s1.enrollCourse(new Course("BIT1123", "Object Oriented Programming"));
        s1.enrollCourse(new Course("BIT1104", "Database Systems"));

        Instructor i1 = new Instructor("INS201", "Sir Nazmirul", "nazmirul@cityu.edu.my", "Faculty of IT");

        people.add(s1);
        people.add(i1);

        boolean running = true;

        while (running) {
            System.out.println("\n=============================================");
            System.out.println("   CITY UNIVERSITY STUDENT MANAGEMENT SYSTEM  ");
            System.out.println("=============================================");
            System.out.println("1. Display All System Records (Polymorphism)");
            System.out.println("2. Execute Role-Specific Actions (Abstraction)");
            System.out.println("3. Register New Student");
            System.out.println("4. Exit Application");
            System.out.print("Select an option (1-4): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\n--- ALL RECORDS IN SYSTEM ---");
                    for (Person person : people) {
                        person.displayInfo();
                        System.out.println("---------------------------------------------");
                    }
                    break;

                case 2:
                    System.out.println("\n--- EXECUTING ROLE ACTIONS ---");
                    for (Person person : people) {
                        person.executeRoleAction();
                        System.out.println("---------------------------------------------");
                    }
                    break;

                case 3:
                    System.out.println("\n--- REGISTER NEW STUDENT ---");
                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine();

                    System.out.print("Enter Full Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Enter GPA (0.0 - 4.0): ");
                    double gpa = 0.0;
                    if (scanner.hasNextDouble()) {
                        gpa = scanner.nextDouble();
                        scanner.nextLine();
                    } else {
                        System.out.println("Invalid GPA input. Defaulting to 0.0.");
                        scanner.nextLine();
                    }

                    Student newStudent = new Student(id, name, email, gpa);

                    System.out.print("Enter Course Code (e.g., BIT1123): ");
                    String cCode = scanner.nextLine();
                    System.out.print("Enter Course Title: ");
                    String cTitle = scanner.nextLine();
                    
                    if (!cCode.trim().isEmpty() && !cTitle.trim().isEmpty()) {
                        newStudent.enrollCourse(new Course(cCode, cTitle));
                    }

                    people.add(newStudent);
                    System.out.println(">> Student " + name + " successfully registered!");
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting Student Management System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid selection. Please choose an option between 1 and 4.");
            }
        }

        scanner.close();
    }
}