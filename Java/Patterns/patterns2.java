class Main {
    public static void main(String[] args) {
        int n = 5;

        // Increasing left triangle
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i +" "); 
            }
            System.out.println();
        }
        
        System.out.println();
        
        // Increasing right triangle
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int s = n - i; s > 0; s--) {
                System.out.print("  ");
            }
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println();
        
        // Decreasing left triangle (FIXED)
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(i +" "); 
            }
            System.out.println();
        }

        System.out.println();
      
        // Decreasing right triangle
        for (int i = n; i >= 1; i--) {
            // Print spaces
            for (int s = n - i; s > 0; s--) {
                System.out.print("  ");
            }
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

Output:
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 

        1 
      2 2 
    3 3 3 
  4 4 4 4 
5 5 5 5 5 

5 5 5 5 5 
4 4 4 4 
3 3 3 
2 2 
1 

5 5 5 5 5 
  4 4 4 4 
    3 3 3 
      2 2 
        1 
