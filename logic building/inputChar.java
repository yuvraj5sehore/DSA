//how to take a character as an input from the user and print it 

import java.util.*;

class inputCharA {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Character: ");

        char ch = sc.next().charAt(0);

        System.out.println("Your Entered Character is: "+ch);
    }
}