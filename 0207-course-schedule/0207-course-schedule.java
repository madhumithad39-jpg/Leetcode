class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<numCourses;i++)
            graph.add(new ArrayList<>());
        int[] in=new int[numCourses];
        for(int[] p:prerequisites){
            graph.get(p[1]).add(p[0]);in[p[0]]++;
        }
        Queue<Integer> que = new LinkedList<>();
        for(int i=0;i<numCourses;i++)
            if(in[i]==0) que.offer(i);
        int count =0;
        while(!que.isEmpty()){
            int course = que.poll();
            count++;
            for(int nei:graph.get(course)){
                in[nei]--;
                if(in[nei]==0) que.offer(nei);
            }

        }
        return count ==numCourses;

    }
}