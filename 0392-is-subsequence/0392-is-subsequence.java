class Solution {
    public boolean isSubsequence(String s, String t) {

        if(s.length() == 0)
            return true;

        if(s.length() == 0 && t.length() == 0)
            return true;
            
        char c1[] = s.toCharArray();
        char c2[] = t.toCharArray();

        int i=0, j=0;

        while(j < c2.length){

            if(c1[i]==c2[j])
                i++;

            if(i == c1.length)
                return true;

            j++;
        }

        return false;
    }
}