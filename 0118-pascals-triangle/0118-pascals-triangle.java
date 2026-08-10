class Solution {
    public List<List<Integer>> generate(int numRows) {
    
        List<List<Integer>> outerList = new ArrayList<>();

        int n = numRows;

        for(int i=0; i<n; i++){

            List<Integer> innerList = new ArrayList<>();

            if(i == 0)
            innerList.add(1);

            else if(i == 1){
                innerList.add(1);
                innerList.add(1);
            }

            else
            for(int j=0; j<=i; j++){
                if(j == 0 || j == i)
                innerList.add(1);

                else innerList.add(outerList.get(i-1).get(j-1) + outerList.get(i-1).get(j));
            }

            outerList.add(innerList);
        }

        return outerList;
    }
}