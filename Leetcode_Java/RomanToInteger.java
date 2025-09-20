// Given a roman numeral, convert it to an integer.
class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int prev = 0;
        for(int i = s.length() - 1; i >= 0 ; i--){
            int val = value(s.charAt(i));
            
            if(val<prev){
                total -= val;
            }
            else{
                total += val;
            }

            prev = val;
        }
        return total;
    }

    private int value(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}


/*Example 1:
Input: s = "III"
Output: 3
Explanation: III = 3.

Example 2:
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.*/
