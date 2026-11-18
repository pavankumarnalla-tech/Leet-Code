class Solution {
    public String convertToBase7(int num) {

        if(num == 0)
            return "0";

        boolean negative = num < 0;

        long n = Math.abs((long) num);

        String ans = "";

        while(n > 0) {
            int rem = (int)(n % 7);

            ans = rem + ans;

            n = n / 7;
        }

        if(negative)
            ans = "-" + ans;

        return ans;
    }
}