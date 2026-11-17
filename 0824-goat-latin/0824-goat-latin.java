import java.util.StringTokenizer;

class Solution {
    public String toGoatLatin(String sentence) {

        if(sentence == "")
        return sentence;

        StringTokenizer str = new StringTokenizer(sentence);
        StringBuilder ans = new StringBuilder("");
        int count = 1;

        while(str.hasMoreTokens()){
            String word = str.nextToken();
            char c = word.charAt(0);
            int flag = 0;
            if(!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')){
                word = word.substring(1);
                flag = 1;
            }

            ans.append(" ");
            ans.append(word);
            
            if(flag == 1)
            ans.append(c);

            ans.append("ma");

            for(int i=0; i<count; i++)
                ans.append("a");

            count++;
        }

        sentence = ans.toString().trim();
        return sentence;
    }
}