class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> temp = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0] <= end){
                end = Math.max(end, intervals[i][1]);
            }

            else{
                temp.add(new int[]{start,end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        temp.add(new int[]{start, end});

        int[][] ans = temp.toArray(new int[temp.size()][]);

        return ans;
    }
}