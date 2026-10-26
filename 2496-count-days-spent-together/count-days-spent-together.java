class Solution {
    public static int Dayofyear(String s) {
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] sum = new int[13];
        sum[1] = 31;
        for (int i = 2; i < sum.length; i++) {
            sum[i] = sum[i - 1] + months[i - 1];
        }
        int mm = Integer.parseInt(s.substring(0, 2));
        int dd = Integer.parseInt(s.substring(3, 5));

        return sum[mm - 1] + dd;
    }

    public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int alicearrive = Dayofyear(arriveAlice);
        int aliceleave = Dayofyear(leaveAlice);
        int bobarrive = Dayofyear(arriveBob);
        int bobleave = Dayofyear(leaveBob);

        int commarrive = Math.max(alicearrive, bobarrive);
        int commleave = Math.min(aliceleave, bobleave);

        int ans = 0;

        if (commleave - commarrive >= 0) {
            ans = (commleave - commarrive)+1;
        } else {
            ans = 0;
        }
        return ans;
    }
}