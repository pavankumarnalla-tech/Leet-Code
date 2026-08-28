class Solution {
    public int findKthPositive(int[] arr, int k) {
        int ans[] = new int[k];

        for(int i=0,j=1,m=0; m<k; j++){

            if(i < arr.length && arr[i] == j){
                i++;
            }

            else{
                ans[m] = j;
                m++;
            }


        }

        return ans[ans.length-1];
    }
}