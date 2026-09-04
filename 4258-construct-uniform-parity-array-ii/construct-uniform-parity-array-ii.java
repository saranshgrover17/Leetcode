class Solution {
    public static boolean uniformArray(int[] arr) {
        int even = 0;
        int odd = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]%2==0){
                even++;
            }
            else if(arr[i]%2!=0){
                odd++;
            }
        }

        if(even==0 || odd == 0){
            return true;
        }

        int minodd = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]%2!=0){
                minodd = Math.min(minodd, arr[i]);
            }
        }

        if(even>0 && odd>0){
            odd = 0;
            even = 0;

            for(int i = 0 ; i < arr.length ; i++){
                if(arr[i]%2!=0){
                    odd++;
                }
                else if(arr[i]%2==0){
                    boolean check = false;
                    if((arr[i]-minodd)>=1 &&(arr[i]-minodd)%2!=0 ){
                        check = true;
                    }
                    if(check == false){
                        return false;
                    }
                }
            }
        }
        if(even==0 || odd == 0){
            return true;
        }
        return false;
    }
}