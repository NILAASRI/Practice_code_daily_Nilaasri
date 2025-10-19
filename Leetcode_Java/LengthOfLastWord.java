// Return the length of Last Word in a String
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String [] words = s.split(" ");
        return words[words.length - 1].length();

    }
}

/*
Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.  */
