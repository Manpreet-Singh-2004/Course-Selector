import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    static void a()
    {

        System.out.print("Enter Course ID: ");
        String courseid = sc.nextLine().trim();

        boolean found = false;
        for (int i = 0; i < Data.CourseID.size(); i++) {

            String trimmedCourseID = Data.CourseID.get(i).trim();

            if (trimmedCourseID.equalsIgnoreCase(courseid)) {
                found = true;
                int index = i;

                System.out.println("Course ID: " + Data.CourseID.get(index));
                System.out.println("Course Name: " + Data.CourseName.get(index));
                System.out.println("Course Credit: " + Data.CourseCredit.get(index));
                System.out.println("Course Prerequisite: " + Data.CoursePrereq.get(index));
                System.out.println("Course Corequisite: " + Data.CourseCoreq.get(index));
                System.out.println("Course Details: " + Data.CourseDetails.get(index));
                System.out.println("Additional Notes: " + Data.AdditionalNotes.get(index));

                break;
            }
        }

        if (!found) {
            System.out.println("Invalid Course ID");
        }



    }
    static void b()
    {
//        System.out.print("Enter Year: ");
//        String year = sc.nextLine();
//        boolean found = false;
//
//        if (year.length() != 1 || !Character.isDigit(year.charAt(0))) {
//            System.out.println("Year is not valid");
//        } else {
//            char inputYear = year.charAt(0);
//
//            for (int i = 0; i < Data.CourseID.size(); i++) {
//                String course = Data.CourseID.get(i);
//                char courseYear = course.charAt(4);
//
//                if (courseYear == inputYear) {
//                    found = true;
//                    System.out.println("\nx------------x\n");
//                    System.out.println("Course ID: " + Data.CourseID.get(i));
//                    System.out.println("Course Name: " + Data.CourseName.get(i));
//                    System.out.println("\nx------------x\n");
//                }
//            }
//
//            if (!found) {
//                System.out.println("No courses found for the entered year");
//            }
//        }

        System.out.print("Enter Year: ");
        String year = sc.nextLine();
//        Filters
        System.out.println("Enter Course Prefix (CIS, CMNS, COMP, etc): ");
        boolean found = false;

        if (year.length() != 1 || !Character.isDigit(year.charAt(0))) {
            System.out.println("Year is not valid");
        } else {
            char inputYear = year.charAt(0);

            for (int i = 0; i < Data.CourseID.size(); i++) {
                String course = Data.CourseID.get(i);

                // Extract the prefix from the course ID
                String prefix = course.substring(0, course.indexOf(" ") + 1);

                // Check if the prefix is followed by a space and the input year
                if (prefix.length() == 4 && course.startsWith(prefix + inputYear) ||
                        prefix.length() == 5 && course.startsWith(prefix + inputYear)) {
                    found = true;
                    System.out.println("\nx------------x\n");
                    System.out.println("Course ID: " + Data.CourseID.get(i));
                    System.out.println("Course Name: " + Data.CourseName.get(i));
                    System.out.println("\nx------------x\n");
                }
            }

            if (!found) {
                System.out.println("No courses found for the entered year");
            }
        }


    }
    static void c()
    {
        CourseSelectionSystem a = new CourseSelectionSystem();
        a();
    }
    static boolean containsCourse(String[] courses, String targetCourse) {
        for (String course : courses) {
            if (course.trim().equalsIgnoreCase(targetCourse)) {
                return true;
            }
        }
        return false;
    }
    static void d()
    {
        System.out.println("Enter your Course to check for its Future Courses");
        String checkCourse = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < Data.CourseID.size(); i++) {
            String[] prereqs = Data.CoursePrereq.get(i).split(",\\s*"); // Split prerequisites by comma and optional space
            String[] preAndCo = Data.CoursePreandCo.get(i).split(",\\s*"); // Split preAndCo by comma and optional space

            if (containsCourse(prereqs, checkCourse) || containsCourse(preAndCo, checkCourse)) {
                found = true;
                int index = i;
                System.out.println("\nx-----------x\n");
                System.out.println("Course ID: " + Data.CourseID.get(index));
                System.out.println("Course Name: " + Data.CourseName.get(index));
                System.out.println("Prerequisite: " + Data.CoursePrereq.get(index));
                System.out.println("Prerequisite and Corequisite: " + Data.CoursePreandCo.get(index));
                System.out.println("\nx-----------x\n");
            }
        }

        if (!found) {
            System.out.println("There are no matching prerequisites or corequisites.");
        }


    }
}
