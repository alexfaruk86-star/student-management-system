# Student Management System

A Java-based console application demonstrating Object-Oriented Programming (OOP) principles, built as part of the Object-Oriented Programming coursework at City University Malaysia.

---

## 📌 Project Architecture & OOP Concepts

The application uses a modular multi-file architecture to manage academic records cleanly:

- **Encapsulation (`Course.java`, `Person.java`)**: Private attributes managed using getter and setter methods with validation.
- **Inheritance (`Student.java`, `Instructor.java`)**: `Student` and `Instructor` inherit core user fields (`id`, `name`, `email`) from the abstract `Person` class.
- **Abstraction (`Person.java`)**: Defines an abstract method `executeRoleAction()` that forces subclasses to implement role-specific behaviors.
- **Polymorphism (`Main.java`)**: Uses a uniform `List<Person>` collection to execute dynamic method dispatch (`displayInfo()` and `executeRoleAction()`).

---

## 🛠️ File Structure

| File | Description |
| :--- | :--- |
| `Person.java` | Abstract base class containing shared user attributes and behaviors. |
| `Student.java` | Subclass representing a student with GPA tracking and course enrollments. |
| `Instructor.java` | Subclass representing an instructor with department assignment. |
| `Course.java` | Class representing course details (code and title). |
| `Main.java` | Entry point containing the interactive CLI menu system. |

---

## 🚀 How to Compile & Run

### Prerequisites
- Java Development Kit (JDK 11 or higher)
- Terminal / Command Prompt

### Execution Commands

1. **Clone the repository:**
   ```bash
   git clone https://github.com/alexfaruk86-star/student-management-system.git
   cd student-management-system
