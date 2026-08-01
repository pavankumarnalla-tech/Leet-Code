class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0; i<nums.length; i++){
            int num = nums[i];

            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }

            else map.put(num,1);
        }

        Integer max = Integer.MIN_VALUE;
        int ans = 0;

        for(Integer key : map.keySet()){
            if(map.get(key) > max){
                max = map.get(key);
                ans = key;
            }
        }
        
        return ans;
    }
}