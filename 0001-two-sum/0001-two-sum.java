class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 0;
        boolean flag = false;

        for(i=0; i< nums.length; i++){
            for(j=0; j<nums.length; j++){
                if(i == j)
                continue;

                if((nums[i] + nums[j]) == target){
                    flag = true;
                    break;
                }
            }

            if(flag)
            break;
        }
        return new int[]{i,j};
    }
}