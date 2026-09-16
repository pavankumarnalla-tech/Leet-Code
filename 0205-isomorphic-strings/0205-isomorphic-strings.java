class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length())
            return false;

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char x = s.charAt(i);
            char y = t.charAt(i);

            if (map1.containsKey(x) && map1.get(x) != y)
                return false;

            if (map2.containsKey(y) && map2.get(y) != x)
                return false;

            map1.put(x, y);
            map2.put(y, x);
        }

        return true;
    }
}