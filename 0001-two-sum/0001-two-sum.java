class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int i = 0;
         int need = 0;

        for(i=0; i<nums.length; i++){
            need = target - nums[i];

            if(map.containsKey(need))
            return new int[]{map.get(need),i};

            map.put(nums[i],i);
        }

        return new int[]{};

        /* int i = 0;
        int j = 0;
        boolean flag = false;

        for(i=0; i< nums.length; i++){
            for(j=i+1; j<nums.length; j++){
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
        return new int[]{i,j}; */

    }
}