class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int xor = 0;
        boolean nonZeroExist = false;
        for(int element : nums) {
            if(element != 0)
                nonZeroExist = true;
            xor = xor ^ element;
        }
        if(xor != 0)
            return n;
        return nonZeroExist ? n - 1 : 0;
    }
}