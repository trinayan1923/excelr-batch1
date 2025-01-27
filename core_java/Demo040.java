package core_java;
import java.util.Scanner;

public class Demo040 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character or digit: ");
        char ch = sc.next().charAt(0);
        if(Character.isUpperCase(ch)){
            System.out.println("The Entered character is uppercase.");
        }else if(Character.isLowerCase(ch)){
            System.out.println("The Entered Character is Lowercase.");
        }else if(Character.isDigit(ch)){
            System.out.println("The Entered Character is Digit.");
        }else{
            System.out.println("The Entered Character is Special Character.");
        }sc.close();//remove before use
    }
}
