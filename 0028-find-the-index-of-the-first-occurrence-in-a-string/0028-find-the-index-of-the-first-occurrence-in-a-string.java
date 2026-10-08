class Solution {
    public int strStr(String haystack, String needle) {

        for(int i=0; i<=haystack.length()-needle.length(); i++){

            String s = haystack.substring(i,i+needle.length());

            if(needle.equals(s))
                return i;
        }

        return -1;
    }
}