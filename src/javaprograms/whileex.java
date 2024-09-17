package javaprograms;
import java.util.Scanner;

public class whileex {

    public static void main(String[] args) {
        int rev = 0;
        
        // Taking input
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scn.nextInt();
        
        // Store original number to compare later
        int originalNum = num;
        
        // Reversing the number
        while(num != 0) {
            int r = num % 10;
            rev = rev * 10 + r;
            num = num / 10;
        }
        
        System.out.println("Reversed number is: " + rev);
    
        // Compare reversed number with original number
        if(rev == originalNum) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
        
    }
}
