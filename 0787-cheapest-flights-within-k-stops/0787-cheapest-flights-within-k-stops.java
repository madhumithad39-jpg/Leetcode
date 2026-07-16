class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] dist = new int [n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src]=0;
        for(int index=0;index<=k;index++){
            int [] copy =Arrays.copyOf(dist,n);
            for(int []each:flights){
                int cS=each[0],cD=each[1],cost=each[2];
                if(dist[cS]!=Integer.MAX_VALUE&&(dist[cS]+cost)<copy[cD]){
                    copy[cD]=dist[cS]+cost;
                }
            }
            dist = copy;
        }
        return dist[dst]!=Integer.MAX_VALUE?dist[dst]:-1;
    }
}