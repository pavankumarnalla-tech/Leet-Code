class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0;
        int r = 0;

        for(int weight : weights){
            l = Math.max(l,weight);
            r += weight;
        }

        while(l < r){
            int mid = l + (r-l) / 2;

            int reqDays = 1;
            int currWeight = 0;

            for(int weight : weights){
                if(currWeight + weight > mid){
                    reqDays++;
                    currWeight = 0;
                }

                currWeight += weight;
            }

            if(reqDays <= days)
            r= mid;
            else l = mid + 1;
        }

        return l;
    }
}