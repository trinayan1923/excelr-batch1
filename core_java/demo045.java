import java.util.Scanner;

public class demo045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Swap the numbers without using a third variable
        int sum = num1 + num2; 
        num1 = sum - num1;  
        num2 = sum - num2;  

        System.out.println("After swapping: ");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
    }
}


