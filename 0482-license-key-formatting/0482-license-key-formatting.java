class Solution {
    public String licenseKeyFormatting(String s, int k) {

        StringBuilder str = new StringBuilder();

        // Remove dashes and convert to uppercase
        for (char c : s.toCharArray()) {
            if (c != '-') {
                str.append(Character.toUpperCase(c));
            }
        }

        StringBuilder ans = new StringBuilder();

        int count = 0;

        // Build groups from right to left
        for (int i = str.length() - 1; i >= 0; i--) {

            ans.append(str.charAt(i));
            count++;

            if (count == k && i != 0) {
                ans.append('-');
                count = 0;
            }
        }

        return ans.reverse().toString();
    }
}