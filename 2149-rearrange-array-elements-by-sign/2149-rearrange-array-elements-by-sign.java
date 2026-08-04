class Solution {
    public int[] rearrangeArray(int[] nums) {
        int []positive = new int[nums.length/2];
        int []negative = new int[nums.length/2];

        int p = 0; 
        int n = 0;
        for(int num : nums){
            if(num > 0){
                positive[p] = num;
                p++;
            }

            else{
                negative[n] = num;
                n++;
            }
        }

        int i = 0;
        
        for(p = 0; p < positive.length; p++,i++){
            nums[i] = positive[p];
            nums[++i] = negative[p];
        }

        return nums;
    }
}