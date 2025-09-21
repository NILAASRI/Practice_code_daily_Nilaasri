
//2D Array 
class Main {
    public static void main(String[] args) {
        int [][] arr  = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        //1) Print original array
        System.out.println("1) Original 2D Array:");
            for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(); // This is for 1row space 
        //2) Calculate sum of all elements in array
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("2) Sum of all elements:" + sum); 
        System.out.println();
        //3) Calculate sum of each row
        System.out.println("3) Sum of Each row:");
        for (int i = 0; i < arr.length; i++) {
            int rowsum = 0;
            for (int j = 0; j < arr[i].length; j++) {
              rowsum += arr[i][j];  
            }
            System.out.println("Row " + (i+1) + " Sum:" + rowsum);
        }
    }
}

/*
1) Original 2D Array:
1 2 3 
4 5 6 
7 8 9 

2) Sum of all elements:45

3) Sum of Each row:
Row 1 Sum:6
Row 2 Sum:15
Row 3 Sum:24

*/
