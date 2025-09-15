// Reverse the String without using in-built function
import java.util.Scanner;
public class ReverseString{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s1 = in.nextLine();
        String result = "";
        for(int i = s1.length()-1; i >= 0; i--){
            result += s1.charAt(i);
        }
        System.out.println("Reversed String: "+ result);
    }
}

//Output:
// Enter a string: 
// Hello, World!
// Reversed String: !dlroW ,olleH
