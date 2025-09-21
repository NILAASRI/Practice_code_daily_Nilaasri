
//2D Array Transpose
class Main {
    public static void main(String[] args) {
        int [][] arr  = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        int rows = arr.length;
        int cols = arr[0].length;
        int [][] transpose = new int[cols][rows];
            for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        System.out.println("Transpose of 2D Array:");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}

//Output:
//Transpose of 2D Array:
//1 4 7 
//2 5 8 
//3 6 9 
