class Solution {
    public int hammingWeight(int n) {
        long num = Integer.toUnsignedLong(n);
        int count = 0;

        while (num != 0) {
            count += num % 2;
            num /= 2;
        }

        return count;
    }
}