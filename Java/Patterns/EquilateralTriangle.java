class Main {
    public static void main(String[] args) {
        int n = 5;
        //Equilateral triangle
        System.out.println("Equilateral:");
        for (int i = 1; i <= n; i++) {
            for (int s = n - i; s > 0; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println();

        //Reverse Equilateral triangle
        System.out.println("Reverse Equilateral:");
        for (int i = n; i >= 1; i--) {
            for (int s = n - i; s > 0; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("Equilateral with different numbers");
        int n1 = 4;  
        int num = 1; 

        for (int i = 1; i <= n1; i++) {
            // Print spaces
            for (int s = n1 - i; s > 0; s--) {
                System.out.print(" ");
            }

            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}

Output:
Equilateral:
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 

Reverse Equilateral:
5 5 5 5 5 
 4 4 4 4 
  3 3 3 
   2 2 
    1 

Equilateral with different numbers
   1 
  2 3 
 4 5 6 
7 8 9 10 
