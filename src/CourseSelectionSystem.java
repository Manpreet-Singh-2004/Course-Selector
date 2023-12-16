import java.util.ArrayList;
import java.util.Scanner;

public class CourseSelectionSystem {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> selectedCourses = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Total Length of your Degree in Years: ");
        int len = sc.nextInt();
        if (len > 5) {
            System.out.println("Invalid!");
            return;
        }

        for (int semester = 1; semester <= 2 * len; semester++) {
            System.out.println("x---- Semester " + semester + " ----x");
            int semCourses = getNumberOfCourses();
            displayAvailableCourses(semester, semCourses);
            selectCourses();
            // Check prerequisites and corequisites after completing each semester
            checkNextSemesterCourses();
        }

        System.out.println("Congratulations! You've completed your degree.");
    }

    static int getNumberOfCourses() {
        System.out.println("Total number of courses in this semester: ");
        int totalCourses = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        return totalCourses;
    }

    static void displayAvailableCourses(int semester, int totalCourses) {
        System.out.println("Available Courses for Semester " + semester + ":");

        // Assuming there are 25 methods in Data class (Data.d1(), Data.d2(), ..., Data.d25())
        for (int courseNumber = 1; courseNumber <= totalCourses; courseNumber++) {
            String courseID = "CIS " + (courseNumber * 100); // Example course code
            System.out.println(courseNumber + ". " + getCourseDetails(courseID));
        }
    }

    static String getCourseDetails(String courseID) {
        // Retrieve course details from Data class based on the courseID
        switch (courseID) {
            case "CIS 100":
//                return Data.d1();
//            case "CIS 200":
//                return Data.d2();
            // Add more cases for other courses...

            default:
                return "Invalid Course ID";
        }
    }

    static void selectCourses() {
        System.out.print("Enter the numbers of the courses you want to take (separated by commas): ");
        String userInput = sc.nextLine();
        String[] selectedNumbers = userInput.split(",\\s*");

        for (String number : selectedNumbers) {
            int courseNumber = Integer.parseInt(number);
            String courseID = "CIS " + (courseNumber * 100); // Example course code
            selectedCourses.add(courseID);
        }
    }

    static void checkNextSemesterCourses() {
        System.out.println("\nCourses you can take in the next semester:");

        for (String selectedCourse : selectedCourses) {
            System.out.println(getCourseDetails(selectedCourse));
            // Implement logic to check prerequisites and corequisites for each selected course
            // and display available courses for the next semester accordingly.
        }

        System.out.println("------------------------------");
    }
}
