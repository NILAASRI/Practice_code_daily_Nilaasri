//The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.
//Hint: Java's Scanner.hasNext() method is helpful for this problem.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        while(in.hasNext()){
            System.out.println(i+ " "+ in.nextLine());
            i++;
        }
       
        in.close();
    }
}

//Sample Input
Hello world
I am a file
Read me until end-of-file.
  
//Sample Output
1 Hello world
2 I am a file
3 Read me until end-of-file.
