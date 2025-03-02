package view;

import working.Student;
import java.util.Scanner;

public class louncher {  // Corrected class name (Java convention: use PascalCase)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numberOfStudents = sc.nextInt();
        sc.nextLine();  // Consume newline left by nextInt()

        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter student " + (i + 1) + " name:");
            String name = sc.nextLine();  // Using nextLine() to capture full name

            String uid;
            do {
                System.out.println("Enter UID (7 characters):");
                uid = sc.next();
            } while (uid.length() != 7);

            students[i] = new Student(name, uid);  // Assuming Student has a constructor
            sc.nextLine(); // Consume newline left by next()
        }

        // Displaying Student Information (Optional)
        System.out.println("\nStudent Details:");
        for (Student s : students) {
            System.out.println(s);
        }

        sc.close();
    }
}
