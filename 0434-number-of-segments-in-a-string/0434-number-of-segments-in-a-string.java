class Solution {
    public int countSegments(String s) {
        if(s.trim().isEmpty())
            return 0;

        String ans[] = s.trim().split("\\s+");

        for(String a : ans)
        System.out.println(a);

        return ans.length;
    }
}