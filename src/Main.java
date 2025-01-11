import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create a scanner object to read user input from the console.
        Scanner scanner = new Scanner(System.in);
        // boolean variable to control whether the user wants to continue testing.
        boolean continueTesting = true;

        while (continueTesting) {
            double gpa = 0.0;
            int gpaInt;
            boolean validInput;

            do {
                // prompt the user to enter their GPA.
                System.out.println("Enter your GPA:");
                try {
                    // attempt to read the GPA input as a double.
                    gpa = scanner.nextDouble();

                    // check if the GPA is within the valid range (0.0 to 4.0).
                    validInput = gpa >= 0.0 && gpa <= 4.0;
                    if (!validInput) {
                        // inform the user if the GPA is out of range.
                        System.out.println("Invalid GPA entered. Please enter a GPA between 0.0 and 4.0.");
                    }
                } catch (InputMismatchException e) {
                    // handle cases where the user enters non-numeric input (e.g., letters).
                    System.out.println("Invalid input. Please enter a numeric GPA between 0.0 and 4.0.");
                    // clear the invalid input from the scanner.
                    scanner.next();
                    validInput = false;
                }
            } while (!validInput);

            // convert GPA to an integer representation by multiplying by 10.
            gpaInt = (int) (gpa * 10);

            // use a switch statement to map the GPA to its corresponding percentage range.
            switch (gpaInt) {
                case 40 -> System.out.println("Percentage: 100% to 95.0%");
                case 39 -> System.out.println("Percentage: <95.0% to 94.0%");
                case 38 -> System.out.println("Percentage: <94.0% to 93.0%");
                case 37 -> System.out.println("Percentage: <93.0% to 92.0%");
                case 36 -> System.out.println("Percentage: <92.0% to 91.0%");
                case 35 -> System.out.println("Percentage: <91.0% to 90.0%");
                case 34 -> System.out.println("Percentage: <90.0% to 89.0%");
                case 33 -> System.out.println("Percentage: <89.0% to 88.0%");
                case 32 -> System.out.println("Percentage: <88.0% to 87.0%");
                case 31 -> System.out.println("Percentage: <87.0% to 86.0%");
                case 30 -> System.out.println("Percentage: <86.0% to 85.0%");
                case 29 -> System.out.println("Percentage: <85.0% to 84.0%");
                case 28 -> System.out.println("Percentage: <84.0% to 83.0%");
                case 27 -> System.out.println("Percentage: <83.0% to 82.0%");
                case 26 -> System.out.println("Percentage: <82.0% to 81.0%");
                case 25 -> System.out.println("Percentage: <81.0% to 80.0%");
                case 24 -> System.out.println("Percentage: <80.0% to 79.0%");
                case 23 -> System.out.println("Percentage: <79.0% to 78.0%");
                case 22 -> System.out.println("Percentage: <78.0% to 77.0%");
                case 21 -> System.out.println("Percentage: <77.0% to 76.0%");
                case 20 -> System.out.println("Percentage: <76.0% to 75.0%");
                case 19 -> System.out.println("Percentage: <75.0% to 74.0%");
                case 18 -> System.out.println("Percentage: <74.0% to 73.0%");
                case 17 -> System.out.println("Percentage: <73.0% to 72.0%");
                case 16 -> System.out.println("Percentage: <72.0% to 71.0%");
                case 15 -> System.out.println("Percentage: <71.0% to 70.0%");
                case 14 -> System.out.println("Percentage: <70.0% to 69.0%");
                case 13 -> System.out.println("Percentage: <69.0% to 68.0%");
                case 12 -> System.out.println("Percentage: <68.0% to 67.0%");
                case 11 -> System.out.println("Percentage: <67.0% to 66.0%");
                case 10 -> System.out.println("Percentage: <66.0% to 65.0%");
                case 0 -> System.out.println("Percentage: <65.0% to 0.0%");
                default -> System.out.println("Invalid GPA entered. Please enter a GPA between 0.0 and 4.0.");
            }

            // ask the user if they want to test another GPA.
            System.out.println("would you like to test another GPA? (y/n):");
            String userResponse = scanner.next();
            // check if the user response indicates they want to exit.
            if (userResponse.equalsIgnoreCase("n")) {
                continueTesting = false;
            }
        }

        // close the scanner to release resources after the program ends.
        scanner.close();
        // notify the user that the program has ended.
        System.out.println("program ended. Thanks for using the GPA converter!");
    }
}
