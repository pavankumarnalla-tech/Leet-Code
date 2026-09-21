class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> str = new HashSet<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {

            while (str.contains(s.charAt(right))) {
                str.remove(s.charAt(left));
                left++;
            }

            str.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}