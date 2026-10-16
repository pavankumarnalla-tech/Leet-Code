class Solution {
    public String addBinary(String a, String b) {
        StringBuilder s = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        char temp = '0';

        while (i >= 0 || j >= 0) {
            char x = (i >= 0) ? a.charAt(i) : '0';
            char y = (j >= 0) ? b.charAt(j) : '0';

            if (temp == '0' && x == '0' && y == '0') {
                s.append('0');
                temp = '0';
            } else if (temp == '0' && x == '0' && y == '1' ||
                       temp == '0' && x == '1' && y == '0' ||
                       temp == '1' && x == '0' && y == '0') {
                s.append('1');
                temp = '0';
            } else if (temp == '0' && x == '1' && y == '1' ||
                       temp == '1' && x == '0' && y == '1' ||
                       temp == '1' && x == '1' && y == '0') {
                s.append('0');
                temp = '1';
            } else {
                s.append('1');
                temp = '1';
            }

            i--;
            j--;
        }

        if (temp == '1') {
            s.append('1');
        }

        return s.reverse().toString();
    }
}


/*
class Solution {
    public String addBinary(String a, String b) {

        StringBuilder s = new StringBuilder("");

        int n = Math.min(a.length(), b.length());
        int m = Math.max(a.length(),b.length());
        char temp = '0';

        for(int i=m-1; i>m-n-1; i--){

            if(temp == '0' && a.charAt(i) == '0' && b.charAt(i) == '0'){
                s.append("0");
                temp = '0';
            }

            else if(temp == '0' && a.charAt(i) == '0' && b.charAt(i) == '1'){
                s.append("1");
                temp = '0';
            }

            else if(temp == '0' && a.charAt(i) == '1' && b.charAt(i) == '0'){
                s.append("1");
                temp = '0';
            }

            else if(temp == '0' && a.charAt(i) == '1' && b.charAt(i) == '1'){
                s.append("0");
                temp = '1';
            }


            else if(temp == '1' && a.charAt(i) == '0' && b.charAt(i) == '0'){
                s.append("1");
                temp = '0';
            }

            else if(temp == '1' && a.charAt(i) == '0' && b.charAt(i) == '1'){
                s.append("0");
                temp = '1';
            }

            else if(temp == '1' && a.charAt(i) == '1' && b.charAt(i) == '0'){
                s.append("0");
                temp = '1';
            }

            else if(temp == '1' && a.charAt(i) == '1' && b.charAt(i) == '1'){
                s.append("1");
                temp = '1';
            }
            
        }


        if(a.length() > b.length()){
            for(int i=m-n-1; i >= 0; i--){
                if(temp == '1' && a.charAt(i) == '1'){
                    s.append("0");
                    temp = '1';
                }

                else if(temp == '1' && a.charAt(i) == '0'){
                    s.append("1");
                    temp = '0';
                }

                else if(temp == '0'){
                    char x = a.charAt(i);
                    s.append(x);
                }
            }
        }

        else{
            for(int i=m-n-1; i >= 0; i--){
                if(temp == '1' && b.charAt(i) == '1'){
                    s.append("0");
                    temp = '1';
                }

                else if(temp == '1' && b.charAt(i) == '0'){
                    s.append("1");
                    temp = '0';
                }

                else if(temp == '0'){
                    char x = b.charAt(i);
                    s.append(x);
                }
            }

        }

        if(temp == '1');
        s.append(temp);

        s = s.reverse();
        String ans = s.toString();

        return ans;
    }
}

*/