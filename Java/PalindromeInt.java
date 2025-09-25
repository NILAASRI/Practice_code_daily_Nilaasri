import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n value:");
        int n = in.nextInt();
        
        int temp1 = n;  // keep original number
        int digit;
        int temp2 = 0;  // will hold the reversed number
        
        while(n != 0){
            digit = n % 10;
            temp2 = temp2 * 10 + digit;
            n = n / 10; // reduce n step by step
        }
        
        if(temp2 == temp1){
            System.out.println(temp1 + " is Palindrome.");
        }
        else{
            System.out.println(temp1 + " is not Palindrome.");
        }
    }
}
