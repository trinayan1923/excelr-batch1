package problem_statement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PS002 {

    public static List<Integer> nextMultiplesOf100(int n, int count) {
        List<Integer> multiples = new ArrayList<>();
        
        int nextMultiple = ((n / 100) + 1) * 100;
        
        for (int i = 0; i < count; i++) {
            multiples.add(nextMultiple + i * 100);
        }
        
        return multiples;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); 
        
        System.out.print("Enter how many multiples of 100 you want: ");
        int count = scanner.nextInt(); 
        
        List<Integer> nextMultiples = nextMultiplesOf100(number, count);
        
        System.out.println("The next multiples of 100 after " + number + " are: " + nextMultiples);
        
        scanner.close(); 
    }
}

