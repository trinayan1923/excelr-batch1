package core_java;

import java.util.Scanner;

public class Demo025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name :");
        String input = sc.nextLine();
        String reverse = new StringBuilder(input).reverse().toString();
        System.out.println("Reverse of the input is:"+reverse);
        
    } 
}
