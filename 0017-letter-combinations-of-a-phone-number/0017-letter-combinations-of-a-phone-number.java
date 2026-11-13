class Solution {

    String[] map = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    List<String> ans = new ArrayList<>();

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0) {
            return ans;
        }

        backtrack(digits, 0, "");

        return ans;
    }

    public void backtrack(String digits, int index, String current) {

        if (index == digits.length()) {
            ans.add(current);
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (char c : letters.toCharArray()) {
            backtrack(digits, index + 1, current + c);
        }
    }
}