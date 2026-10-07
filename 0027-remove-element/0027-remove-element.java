class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length-1;
        int ans = 0;

        while(left <= right){
            if(nums[right] == val){
                right--;
            }

            else if(nums[left] == val){
                nums[left] = nums[right];
                nums[right] = val;
                left++;
                right--;
            }
            
            else left++;
        }

        return left;
    }
}