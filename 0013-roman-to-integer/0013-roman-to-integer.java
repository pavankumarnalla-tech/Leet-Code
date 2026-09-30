class Solution {
    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int ans = 0;

        for(int i=0; i<s.length(); i++){
            if(chars[i] == 'I')
            chars[i] = 1;

            if(chars[i] == 'V')
            chars[i] = 5;

            if(chars[i] == 'X')
            chars[i] = 10;

            if(chars[i] == 'L')
            chars[i] = 50;

            if(chars[i] == 'C')
            chars[i] = 100;

            if(chars[i] == 'D')
            chars[i] = 500;

            if(chars[i] == 'M')
            chars[i] = 1000;
        }

        for(int i=0; i<s.length()-1; i++){
            if((int)chars[i] < (int)chars[i+1])
            ans -= (int)chars[i];

            else ans += (int)chars[i];
        }

        ans += (int)chars[s.length()-1];

        return ans;
    }
}