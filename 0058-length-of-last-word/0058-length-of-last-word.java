class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int flag = 0;

        for(int i = s.length()-1; i>=0; i--){

            if(s.charAt(i) == ' ' && flag == 0)
                continue;

            if(s.charAt(i) != ' '){
                count++;
                flag = 1;
            }
            
            else break;
        }

        return count;
    }
}