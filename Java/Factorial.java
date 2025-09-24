//Factorial Problem
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n value:");
        int n = in.nextInt();
        int fact = 1;
        for(int i = n; i >= 1; i--){
            fact = fact*i;
        }
        
        System.out.println("Factorial of " + n + " is " + fact);
    }
}

/*
Enter n value:
5
Factorial of 5 is 120
*/
