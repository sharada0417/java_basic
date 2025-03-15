// Create a student class
// 	-create 5 student objects and store it in 
// 	a proper datastructure
// - find the average marks of the students
class Student {
    String name;
    int marks;

    // Constructor
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentAverage {
    public static void main(String[] args) {
        // Creating an array to store Student objects
        Student[] students = {
            new Student("Alice", 85),
            new Student("Bob", 78),
            new Student("Charlie", 92),
            new Student("David", 74),
            new Student("Emma", 88)
        };

        // Calculate average marks
        int totalMarks = 0;
        for (Student student : students) {
            totalMarks += student.marks;
        }
        double average = (double) totalMarks / students.length;

        // Print the average
        System.out.println("Average Marks: " + average);
    }
}
