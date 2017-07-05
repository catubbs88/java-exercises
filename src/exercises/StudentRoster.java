package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by catub on 6/27/2017.
 */
public class StudentRoster {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int newStudentID;
        String newStudentName;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student name: ");
            newStudentName = in.nextLine();

            if (!newStudentName.equals("")) {
                System.out.print("What is their student number? ");
                newStudentID = in.nextInt();
                students.put(newStudentID, newStudentName);

                // Read in the newline before looping back
                in.nextLine();
            }

        } while(!newStudentName.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }

    }

}