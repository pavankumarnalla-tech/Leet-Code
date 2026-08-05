class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int max = 0;

        for (int num : set) {

            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                max = Math.max(max, count);
            }
        }

        return max;
        
        /*
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i],i);
        }

        int count = 0;
        int max = 0;
        boolean flag = true;
        Integer temp = null;
        for(Integer key : map.keySet()){
            if(flag){
                count = 1;
                max = 1;
                flag = false;
            }

            if(temp != null){
                if(key == temp+1){
                    count++;

                    if(count > max)
                    max = count;
                }

                else count = 1;
            }

            temp = key;
        }

        return max;
        */
    }
}