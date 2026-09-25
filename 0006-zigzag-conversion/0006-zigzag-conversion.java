class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1 || numRows >= s.length())
            return s;

        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++)
            rows[i] = new StringBuilder();

        int row = 0;
        int d = 1;

        for (char ch : s.toCharArray()) {

            rows[row].append(ch);

            if (row == 0)
                d = 1;

            if (row == numRows - 1)
                d = -1;

            row += d;
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < numRows; i++)
            ans.append(rows[i]);

        return ans.toString();
    }
}