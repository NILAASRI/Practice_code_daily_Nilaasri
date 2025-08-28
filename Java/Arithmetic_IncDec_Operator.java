
class Main {
    public static void main(String[] args) {
        int a=10, b= 5;
        //Increment , Decrement Operator
        System.out.println("Increment , Decrement Operator");
        System.out.println("Initial a value:" + a);
        System.out.println("Pre: " + (++a));
        System.out.println("a:" + a);
        System.out.println("Post: " + (a++));
        System.out.println("a:" + a);
        
        System.out.println("Pre: " + (--a));
        System.out.println("a:" + a);
        System.out.println("Post: " + (a--));
        System.out.println("a:" + a);
        
        //Arithmetic Operator
        System.out.println("Arithmetic Operator");
        System.out.println("Add:" + (a+b));
        System.out.println("Sub:" + (a-b));
        System.out.println("Mul:" + (a*b));
        System.out.println("Div:" + (a/b));
        System.out.println((++a) + (a*b) + (++b) + (a-b)); //77
        System.out.println(++a+a*b+++b+a-b);//77
        
    }
}
