package core_java;

public class Demo029 {
    public static void main(String[] args) {
        String[] friendNames = new String[10];// you can add the details of your frds acc to int, string 

        // Hardcoded values for 10 friends
        friendNames[0] = "Tarak";

        friendNames[1] = "Bob";
        
        friendNames[2] = "boosa";

        friendNames[3] = "brand";

        friendNames[4] = "candy";
    
        friendNames[5] = "Alice";

        friendNames[6] = "Charliechamp";

        friendNames[7] = "David";
       
        friendNames[8] = "tava";

        friendNames[9] = "Frank";
        
        System.out.println("Friends details:");
        for (int i = 0; i < friendNames.length; i++) {
            System.out.printf("Name: %s%n", friendNames[i]);// if add more details add here also
        }
    }
}
