class Solution {
    public int largestRectangleArea(int[] heights) {
        int mA=0,temp=0;
        Stack<Integer> pos=new Stack<>();
        for(int index=0;index<=heights.length;index++){
            int cValue= (index==heights.length)?0: heights[index];
            while(!pos.isEmpty()&&cValue<heights[pos.peek()]){
                int len = heights[pos.pop()];
                int brd = pos.isEmpty()?index:index-pos.peek()-1;
                temp = len*brd;
                mA=Math.max(mA,temp);
            }
            pos.push(index);
        }
        return mA;
    }
}