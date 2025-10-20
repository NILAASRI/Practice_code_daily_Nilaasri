class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int [] arr = new int[n+1];
        arr[0] = 1;
        return arr;   
    }
}

/* Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
123 + 1 = 124.
Thus, the result should be [1,2,4].

Example 3:
Input: digits = [9]
Output: [1,0]
9 + 1 = 10.
Thus, the result should be [1,0]. */
