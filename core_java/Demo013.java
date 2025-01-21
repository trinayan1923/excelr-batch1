package core_java;
import java.util.Scanner;

public class Demo013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        int r = sc.nextInt();

        double area = (3.14*r);
        System.out.println("Area of the circle: " + area);
    }
}
