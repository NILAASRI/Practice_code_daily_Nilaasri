// Java String Problems with 3 set of concepts
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();

        // 1. Sum of lengths
        System.out.println(A.length() + B.length());

        // 2. Lexicographical comparison
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        /*
        int lexi = A.compareTo(B);
        if(lexi<=0){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }*/
        // 3. Capitalize first letter
        String capitalizedA = A.substring(0,1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);
    }
}

/*
Sample Input 0
hello
java

Sample Output
9
No
Hello Java
*/
