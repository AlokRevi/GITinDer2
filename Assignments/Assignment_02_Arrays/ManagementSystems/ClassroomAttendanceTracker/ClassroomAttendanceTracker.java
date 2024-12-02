package Assignments.Assignment_02_Arrays.ManagementSystems.ClassroomAttendanceTracker;/*
package ManagementSystems.ClassroomAttendanceTracker;
*/
/*
You are building a system for a school to track student attendance. Create a Java program that:
        •	Uses an array to store the names of students present in the class on a particular day.
        •	Allows the user to enter a student's productName and check if they attended the class.
*//*


import java.util.Arrays;
import java.util.Scanner;

public class ClassroomAttendanceTracker {

    public static String[] student;
    public boolean String[] attendance;
    public static String[][] studentAttendance;
    public static String input; // to accept all user inputs
    public static Double numInput; // to accept all numeric user inputs
    public static Scanner scanner = new Scanner(System.in);
    public static int index = -1;  // -1 indicates no valid index found initially

    public displayItemsCatalogue() {
        System.out.println("Updated Items Catalogue :");
        System.out.println(Arrays.deepToString(studentAttendance));
    }

    // Method to initialize arrays for fruits and pricePerKG
    public static void inputFruitsAndPrices() {
        System.out.println("Enter the number of Students :");
        int inputNum = scanner.nextInt();
        scanner.nextLine();  // Clear the newline character after nextInt()

        student= new String[inputNum];
        attendance = new Double[inputNum];
        studentAttendance = new String[inputNum][2];

        for (int i = 0; i < student.length; i++) {
            System.out.println("Enter Fruit " + (i + 1) + " Name:");
            student[i] = scanner.nextLine();

            System.out.println("Enter Price per kg of " + student[i] + ":");
            pricePerKG[i] = scanner.nextDouble();
            scanner.nextLine();  // Clear the newline character after nextDouble()

            studentAttendance[i][0] = student[i];
            studentAttendance[i][1] = String.valueOf(pricePerKG[i]);
        }
    }


}

*/
