class Solution {
    public static int findContentChildren(int[] g, int[] s) {
        int count = 0 ;
        TreeMap<Integer,Integer> mpp = new TreeMap<>();
        for(int i = 0 ; i < s.length ; i++){
            mpp.put(s[i], mpp.getOrDefault(s[i], 0)+1);
        }

        for(int i = 0 ; i < g.length ; i++){
            for(int key : mpp.keySet()){
                if(key>=g[i]){
                    count++;
                    mpp.put(key, mpp.get(key)-1);
                    if(mpp.get(key)==0){
                        mpp.remove(key);
                    }
                    break;
                }
            }
        }
        return count;
    }
}