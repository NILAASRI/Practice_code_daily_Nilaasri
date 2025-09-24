import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n value:");
        int n = in.nextInt();
        int a=0;
        int b=1;
        int c;
        int count = 0;
        System.out.println("Fibonacci Series: ");
        while(count <= n){
            System.out.print(a+" ");
            c = a+b;
            a = b;
            b = c;
            count++;
        }
    }
}

/*
Enter n value:
5
Fibonacci Series: 
0 1 1 2 3 5 
*/
