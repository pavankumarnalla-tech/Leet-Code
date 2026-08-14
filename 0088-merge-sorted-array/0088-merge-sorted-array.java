class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];

            else nums1[k--] = nums2[j--];
        }

        while(j >= 0)
        nums1[k--] = nums2[j--];


        /*
        for(int i = m, j=0; i < m+n; i++, j++){
            nums1[i] = nums2[j];
        }

        for(int i = 0; i<nums1.length-1; i++){
            int min = i;
            for(int j = i+1; j<nums1.length; j++){
                if(nums1[j] < nums1[min])
                    min = j;
            }

            int temp = nums1[min];
            nums1[min] = nums1[i];
            nums1[i] = temp;
        }
        */
    }
}