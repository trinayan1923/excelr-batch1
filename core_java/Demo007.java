package core_java;
import java.util.*;
public class Demo007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Predefined username and password
        String correctUsername = "user";
        String correctPassword = "pass";
        
        String username;
        String password;
        
        // Loop until the correct username and password are entered
        while (true) {
            System.out.print("Enter username: ");
            username = scanner.nextLine();
            
            System.out.print("Enter password: ");
            password = scanner.nextLine();
            
            // Check if the entered credentials are correct
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful!");
                break; // Exit the loop
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }
        scanner.close();
    }
}
