class Solution {
    public static boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i = 0 ; i < bills.length ; i++){
            if(bills[i]==5){
                mpp.put(bills[i], mpp.getOrDefault(bills[i], 0)+1);
            }
            else if(bills[i]==10){
                if(mpp.containsKey(5)){
                    mpp.put(5, mpp.get(5)-1);
                    if(mpp.get(5)==0){
                        mpp.remove(5);
                    }
                    mpp.put(bills[i], mpp.getOrDefault(bills[i], 0)+1);
                }
                else {
                    return false;
                }
            }
            else if(bills[i]==20){
                if(mpp.containsKey(10)&&mpp.containsKey(5)){
                    mpp.put(10, mpp.get(10)-1);
                    if(mpp.get(10)==0){
                        mpp.remove(10);
                    }
                    mpp.put(5, mpp.get(5)-1);
                    if(mpp.get(5)==0){
                        mpp.remove(5);
                    }
                    mpp.put(bills[i], mpp.getOrDefault(bills[i], 0)+1);
                }
                else if (mpp.containsKey(5) && mpp.get(5)>=3){
                    mpp.put(5, mpp.get(5)-3);
                    if(mpp.get(5)==0){
                        mpp.remove(5);
                    }
                    mpp.put(bills[i], mpp.getOrDefault(bills[i], 0)+1);
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}