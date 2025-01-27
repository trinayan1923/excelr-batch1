package core_java;
import java.util.Scanner;

public class Demo041 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a vowel or consonant:");
        char ch = sc.next().charAt(0);
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || 
        ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch+" is an vowel.");
        }else{
            System.out.println("The Entered Character is consonent.");
        }sc.close();//remove before use
    }
}
