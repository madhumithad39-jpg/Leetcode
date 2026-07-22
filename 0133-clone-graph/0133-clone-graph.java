/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    static Map<Node,Node> visisted = new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        if(visisted.containsKey(node))
            return visisted.get(node);
        Node mirror = new Node(node.val);
        visisted.put(node,mirror);
        for(Node nei:node.neighbors)
            mirror.neighbors.add(cloneGraph(nei));
        return mirror;
    }
    public static void bfs(Node root){
        Queue<Node> que = new LinkedList<>();
        boolean[] isVisited = new boolean[visisted.size()];
        que.offer(root);
        while (!que.isEmpty()) {
            Node node = que.poll();
            if(isVisited[node.val]) continue;
            for(Node nei:node.neighbors){
                if(!isVisited[nei.val]) 
                {isVisited[nei.val]=true;que.offer(nei);}
            }
        }
    }
}