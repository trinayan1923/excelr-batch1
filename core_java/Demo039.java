package core_java;
import java.util.Scanner;
public class Demo039 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character or digit: ");
        char ch = sc.next().charAt(0);
        if(Character.isUpperCase(ch)){
            System.out.println("The Entered character is uppercase.");
        }else if(Character.isLowerCase(ch)){
            System.out.println("The Entered Character is Lowercase.");
        }else {
            System.out.println("The Entered Character is Digit.");
        }sc.close();//remove before use
    }
}
