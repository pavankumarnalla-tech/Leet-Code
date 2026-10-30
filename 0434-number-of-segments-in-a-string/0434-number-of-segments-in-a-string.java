class Solution {
    public int countSegments(String s) {
        s = s.trim();
        if(s.equals(""))
            return 0;

        String ans[] = s.trim().split("\\s+");
        return ans.length;
    }
}