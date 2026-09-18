class Solution {
    public boolean isAnagram(String s, String t) {
        TreeMap<Character,Integer> map1 = new TreeMap<>();
        TreeMap<Character,Integer> map2 = new TreeMap<>();

        if(s.length() == t.length()){
            for(int i=0; i < s.length(); i++){
                char ch = s.charAt(i);
                char c = t.charAt(i);

                if(map1.containsKey(ch))
                map1.put(ch,map1.get(ch)+1);

                else map1.put(ch,1);


                if(map2.containsKey(c))
                map2.put(c,map2.get(c)+1);

                else map2.put(c,1);
            }

            if(map1.equals(map2))
            return true;

            else return false;
        }

        return false;


    }
}