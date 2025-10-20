// find even and odd using method
public class EvenOdd{
    public static void main(String[] args) {
        String ans = EvenOdd(10); 
        System.out.println(ans);
    }
    public static String EvenOdd(int num){
        String val = num%2 == 0 ? "Even": "Odd";
        return val;
    }
}

//Output: Even
