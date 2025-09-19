// Palindrome Number
class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        int n = x;
        int n1;
        int n2=0;
        while(x!=0){
            n1 = x % 10;
            n2 = n2*10 + n1;
            x = x / 10;
        }
        if(n==n2){
            return true;
        }
        else{
            return false;
        }
    }
}

//Input 1: x = 121
//Output 1: true
//Input 2: x = -121
//Output 2: false
