class Solution {
    public int reverseBits(int n) {
        StringBuilder num = new StringBuilder();

        for (int i = 0; i < 32; i++) {
            num.append(n & 1);
            n >>>= 1;
        }

        int ans = 0;

        for (int i = 0; i < 32; i++) {
            ans = (ans << 1) | (num.charAt(i) - '0');
        }

        return ans;
    }
}