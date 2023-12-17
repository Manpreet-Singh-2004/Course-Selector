import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

//Terminal Based!
static class CourseInformation {

        public static Scanner scan = new Scanner(System.in);

        void home(){
            System.out.println("Coded by Manpreet Singh");
            System.out.println("Linked in -: https://www.linkedin.com/in/manpreetsingh18-ufv/");
            System.out.println("Website -: https://manpreet-singh-portfolio.netlify.app/");
            System.out.println("Last extracted: May 05, 2023 04:47:49 PM");

            System.out.println("Welcome to terminal based Course Selector!");

            System.out.println("Please enter your desired Choice!");


            boolean validChoice;
            boolean continueLoop = true;

            do {
                System.out.println("\nx---- Menu ----x");
                System.out.println("1. Details About a course");
                System.out.println("2. Courses in your desired year of study");
                System.out.println("3. Course Selector");
                System.out.println("4. Check Prerequisites");
                System.out.println("5. Exit");

                int choice = scan.nextInt();
                validChoice = true;
                switch (choice) {
                    case 1:
                        Menu.a();
                        validChoice = false;
                        break;
                    case 2:
                        Menu.b();
                        validChoice = false;
                        break;
                    case 3:
                        Menu.c();
                        validChoice = false;
                        break;
                    case 4:
                        Menu.d();
                        validChoice = false;
                        break;
                    case 5:
                        System.out.println("Exiting Program...\nThankyou!");
                        continueLoop = false;
                        validChoice = true;
                        break;

                    default:
                        System.out.println("Invalid Choice!");
                        validChoice = false;
                        break;
                }
            }
            while (!validChoice);
        }

    }
//    Hehe Boi UwU (👉ﾟヮﾟ)👉 NOICE 👈(ﾟヮﾟ👈)

static void callDataMethod() {
//    Update this during work
    int numberOfMethods = 99;

    for (int i = 1; i <= numberOfMethods; i++) {
        try {
            // Dynamically call the methods in the Data class
            Data.class.getMethod("d" + i).invoke(null);
        } catch (Exception e) {
            // Handle any exceptions that may occur during method invocation
            e.printStackTrace();
        }
    }
}

    public static void main(String[] args) {
        callDataMethod();

        CourseInformation a = new CourseInformation();
        a.home();
    }
}