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
//    Hehe Boi UwU (👉ﾟヮﾟ)👉NOICE 👈(ﾟヮﾟ👈)

//    static void callDataMethod() {
//    int i;
//    for (i = 1; i<= 25; i++)
//    {
//        switch (i) {
//            case 1:
//                Data.d1();
//                break;
//            case 2:
//                Data.d2();
//                break;
//            case 3:
//                Data.d3();
//                break;
//            case 4:
//                Data.d4();
//                break;
//            case 5:
//                Data.d5();
//                break;
//            case 6:
//                Data.d6();
//                break;
//            case 7:
//                Data.d7();
//                break;
//            case 8:
//                Data.d8();
//                break;
//            case 9:
//                Data.d9();
//                break;
//            case 10:
//                Data.d10();
//                break;
//            case 11:
//                Data.d11();
//                break;
//            case 12:
//                Data.d12();
//                break;
//            case 13:
//                Data.d13();
//                break;
//            case 14:
//                Data.d14();
//                break;
//            case 15:
//                Data.d15();
//                break;
//            case 16:
//                Data.d16();
//                break;
//            case 17:
//                Data.d17();
//                break;
//            case 18:
//                Data.d18();
//                break;
//            case 19:
//                Data.d19();
//                break;
//            case 20:
//                Data.d20();
//                break;
//            case 21:
//                Data.d21();
//                break;
//            case 22:
//                Data.d22();
//                break;
//            case 23:
//                Data.d23();
//                break;
//            case 24:
//                Data.d24();
//                break;
//            case 25:
//                Data.d25();
//                break;
//            case 26:
//                Data.d26();
//                break;
//            case 27:
//                Data.d27();
//                break;
//            case 28:
//                Data.d28();
//                break;
//            case 29:
//                Data.d29();
//                break;
//            case 30:
//                Data.d30();
//                break;
//            case 31:
//                Data.d31();
//                break;
//            case 32:
//                Data.d32();
//                break;
//            case 33:
//                Data.d33();
//                break;
//            case 34:
//                Data.d34();
//                break;
//            case 35:
//                Data.d35();
//                break;
//            case 36:
//                Data.d36();
//                break;
//            case 37:
//                Data.d37();
//                break;
//            case 38:
//                Data.d38();
//                break;
//            case 39:
//                Data.d39();
//                break;
//            case 40:
//                Data.d40();
//                break;
//            case 41:
//                Data.d41();
//                break;
//            case 42:
//                Data.d42();
//                break;
//            case 43:
//                Data.d43();
//                break;
//            case 44:
//                Data.d44();
//                break;
//            case 45:
//                Data.d45();
//                break;
//            case 46:
//                Data.d46();
//                break;
//            case 47:
//                Data.d47();
//                break;
//            case 48:
//                Data.d48();
//                break;
//            case 49:
//                Data.d49();
//                break;
//            case 50:
//                Data.d50();
//                break;
//            case 51:
//                Data.d51();
//                break;
//            case 52:
//                Data.d52();
//                break;
//            case 53:
//                Data.d53();
//                break;
//            case 54:
//                Data.d54();
//                break;
//            case 55:
//                Data.d55();
//                break;
//            case 56:
//                Data.d56();
//                break;
//            case 57:
//                Data.d57();
//                break;
//            case 58:
//                Data.d58();
//                break;
//            case 59:
//                Data.d59();
//                break;
//            case 60:
//                Data.d60();
//                break;
//            case 61:
//                Data.d61();
//                break;
//            case 62:
//                Data.d62();
//                break;
//            default:
//                // Handle the case when index is out of range
//                System.out.println("Invalid index: " + i);
//        }
//    }

//    }
static void callDataMethod() {
    int numberOfMethods = 62; // Update this based on the actual number of methods in the Data class

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