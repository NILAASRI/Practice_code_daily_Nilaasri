import java.util.*;
class Main {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,2,4,5};
        
        //Duplicates only
        System.out.println("Duplicate values in array");
        for(int i = 0; i< arr.length-1; i++){
            for (int j = i+1; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
        System.out.println();
        //Without duplicates 
        Arrays.sort(arr);
        System.out.println("Array values without duplicates");
        System.out.print(arr[0] + " ");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        } 
    }
}
//Duplicate values in array
//2 4 
//Values without duplicates
//1 2 3 4 5 
