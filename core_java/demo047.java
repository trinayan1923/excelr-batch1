package core_java;
import java.util.Scanner;

public class demo047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int count = 0;
        
        // Count the number of digits
        while (number != 0) {
            number /= 10;  
            count++;       
        }
        
        System.out.println("Number of digits: " + count);
    }
}


