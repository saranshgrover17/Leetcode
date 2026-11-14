class Solution {
    public static int[] assignTasks(int[] servers, int[] tasks) {
        int ans[] = new int[tasks.length];
        int[][] server = new int[servers.length][2];
        for(int i = 0 ; i < servers.length ; i++){
            server[i][0] = servers[i];
            server[i][1] = i;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b)->{
                if(a[0]!=b[0]){
                    return Integer.compare(a[0], b[0]);
                }
                return Integer.compare(a[1], b[1]);
            }
        );

        for(int i = 0 ; i < server.length ; i++){
            pq.offer(server[i]);
        }

        PriorityQueue<long[]> busy = new PriorityQueue<>(
            (a,b)->{
                if(a[0]!=b[0]){
                    return Long.compare(a[0], b[0]);
                }
                else if(a[0]==b[0] && a[1]!=b[1]){
                    return Long.compare(a[1], b[1]);
                }
                return Long.compare(a[2], b[2]);
            }
        );

        long time = 0 ;

        for(int i = 0 ; i < tasks.length ; i++){
            time = Math.max(time, i);
            if (pq.isEmpty()) {
                time = Math.max(time, busy.peek()[0]);
            }
            while(!busy.isEmpty() && time >= busy.peek()[0]){
                int[] transfer = new int[]{(int)busy.peek()[1],(int)busy.peek()[2]};
                busy.poll();
                pq.offer(transfer);
            }
            if(!pq.isEmpty()){
                int[] topp = pq.poll();
                ans[i] = topp[1];
                busy.offer(new long[]{time+tasks[i] , topp[0] , topp[1]});
            }
        }
        return ans;
    }
}