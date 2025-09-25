import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of elements:");
        int n = in.nextInt();
        System.out.println("Enter " + n + " values: ");
        //Storing Array
        int a[] = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = in.nextInt();
        }
        //Retrieving Array
        System.out.println("The Array values are retrieved : ");
        for(int i = 0; i<a.length; i++){
            //Here Array is sorted
            Arrays.sort(a);
            System.out.println(a[i]); 
        }
        //Sum of values
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum = sum + a[i];
        }
        System.out.println("Sum of Array: " + sum);
        
        //Average of values
        System.out.println("Average of Array values: " + sum/a.length);
    }
}
