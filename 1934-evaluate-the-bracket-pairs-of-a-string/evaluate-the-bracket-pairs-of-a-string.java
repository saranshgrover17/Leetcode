class Solution {
    public static String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> mpp = new HashMap<>();
        for (int i = 0; i < knowledge.size(); i++) {
            mpp.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                int j = i + 1;

                while (s.charAt(j) != ')') {
                    j++;
                }
                String check = s.substring(i+1,j);
                if (mpp.get(check) == null) {
                    sb.append('?');
                } else {
                    sb.append(mpp.get(check));
                }
                i = j + 1;
            } else {
                sb.append(s.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
}