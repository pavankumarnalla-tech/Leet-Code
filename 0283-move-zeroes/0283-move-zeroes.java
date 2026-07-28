class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;

        int i = 0;
        int j = 1;

        while(i<j && j<n){
            while(j<n-1 && nums[j] == 0){
                j++;
            }

            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
            else i++;

            while(j<=i){
                j++;
            }
        }
    }
}