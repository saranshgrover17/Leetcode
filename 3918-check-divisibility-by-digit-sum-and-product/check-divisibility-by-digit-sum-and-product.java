class Solution {
    public static int sum(int n ){
        int sum = 0;

        while(n!=0){
            int ld = n%10;
            sum = sum + ld;
            n = n/10;
        }
        return sum;
    }
    public static int product(int n ){
        int product = 1;

        while(n!=0){
            int ld = n%10;
            product = product * ld;
            n = n/10;
        }
        return product;
    }
    public static boolean checkDivisibility(int n) {
        if(n%(sum(n)+product(n))==0){
            return true;
        }
        return false;
    }
}