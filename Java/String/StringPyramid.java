// String Pyramid
class Main {
    public static void main(String[] args) {
        String str = "Hello";
        //Only 1st
        for(int i=0; i <= str.length()/2; i++){
            System.out.println(str.substring(i, str.length() - i));
        }
        //Both 
        for(int i =(str.length()/2)-1; i >= 0; i--){
             System.out.println(str.substring(i, str.length() - i));
        }
        System.out.println();
        //Only 2nd
        for(int i =(str.length()/2); i >= 0; i--){
             System.out.println(str.substring(i, str.length() - i));
        }
    }
}

/*
Hello
ell
l
ell
Hello

l
ell
Hello*/
