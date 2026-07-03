class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totTank =0,carTank=0,iSta=0;
        for(int index =0;index<gas.length;index++){
            totTank += gas[index]-cost[index];
            carTank += gas[index]-cost[index];
            if(carTank<0){
                carTank=0;
                iSta=index+1;
            }
        }
        return totTank>=0?iSta:-1;
    }
    public static void main(String[] args){
        Solution obj = new Solution();
        System.out.println(obj.canCompleteCircuit(new int[]{1,2,3,4,5},new int[]{3,4,5,1,2}));
    }
}