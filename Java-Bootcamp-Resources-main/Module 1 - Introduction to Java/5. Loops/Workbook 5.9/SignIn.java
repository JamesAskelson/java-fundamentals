import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java <3";

        /* Task 1
            1. Pick up a username and password from the user.
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("- Username: ");
        String usernameAttempt = scan.nextLine();
        scan.nextLine();
        //pick up username
        System.out.print("- Password: ");
        String passwordAttempt = scan.nextLine();
        scan.nextLine();
        //pick up password

        // see Learn the Part for the remaining instructions.
        while(!usernameAttempt.equals(username) || !passwordAttempt.equals(password)){
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("- Username: ");
            usernameAttempt = scan.nextLine();
            System.out.print("- Password: ");
            passwordAttempt = scan.nextLine();
        }
        System.err.println("Login Successful.");
        /* will be useful for task 2




        */
        scan.close();

    }
}
