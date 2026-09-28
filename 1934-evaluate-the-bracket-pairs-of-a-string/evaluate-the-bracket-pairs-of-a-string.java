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
                StringBuilder sbb = new StringBuilder();
                i++;
                while (s.charAt(i) != ')') {
                    sbb.append(s.charAt(i));
                    i++;
                }
                if (mpp.get(sbb.toString()) == null) {
                    sb.append('?');
                } else {
                    sb.append(mpp.get(sbb.toString()));

                }
                i++;
            } else {
                sb.append(s.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
}