class Solution {
    public static String shortestBeautifulSubstring(String s, int k) {
        int len = Integer.MAX_VALUE;
        String sb = "";

        for (int i = 0; i < s.length(); i++) {

            int count = 0;
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    count++;
                }
                if (count == k) {

                    if(j-i+1==len){
                        len = j-i+1;
                        if(s.substring(i,j+1).compareTo(sb)<0){
                            sb = s.substring(i,j+1);
                        }
                    }

                    else if (j - i + 1 < len) {
                        len = j - i + 1;
                        sb = s.substring(i, j + 1);
                    }
                    break;
                }
            }
        }
        return sb;
    }
}