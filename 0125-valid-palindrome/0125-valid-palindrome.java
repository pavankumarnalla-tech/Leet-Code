class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder("");
        char ch;

        for(int i=0; i<s.length(); i++){
            ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            str.append(Character.toLowerCase(ch));
        }

        if(str.toString().equals(str.reverse().toString()))
        return true;

        return false;
    }
}