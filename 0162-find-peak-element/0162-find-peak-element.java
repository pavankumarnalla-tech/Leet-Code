class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length - 1;

        int l = 0;
        int r = n;

        if(n == 0)
        return n;

        if(n == 1){
            if(nums[0] > nums[1])
            return 0;

            else return 1;
        }

        while(l < r){
            int mid = (l+r) / 2;

            //if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1])
            //return mid;

            if(nums[mid] < nums[mid+1])
            l = mid + 1;
            else r = mid;
        }

        return l;
    }
}