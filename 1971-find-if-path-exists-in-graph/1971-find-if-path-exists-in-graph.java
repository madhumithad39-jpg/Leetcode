class Solution {
    List<List<Integer>> adj;
    boolean[] isvisit;
    private void buildadj(int n,int[][] edges){
        adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] each:edges){
            adj.get(each[0]).add(each[1]);
            adj.get(each[1]).add(each[0]);
        }
    }
    public boolean bfs(int source,int destination){
        Queue<Integer> que=new LinkedList<>();
        que.offer(source);
        isvisit[source]=true;
        while(!que.isEmpty()){
            int node=que.poll();
            if(node==destination)return true;
            for(int nei:adj.get(node)){
                if(!isvisit[nei]){
                    isvisit[nei]=true;
                    que.offer(nei);

                }
            }
        }return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        isvisit = new boolean[n];
        buildadj(n,edges);
        return bfs(source,destination);
    }
}