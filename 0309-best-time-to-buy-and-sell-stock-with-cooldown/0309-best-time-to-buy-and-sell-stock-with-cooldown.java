class Solution {
    public int maxProfit(int[] stocks) {
        if(stocks==null||stocks.length==0)return 0;
        int size = stocks.length;
        int hold = -stocks[0], sold=0, rest =0;
        int pHold=0,pSold=0,pRest=0;
        for(int i = 1;i<size;i++){
            pHold=hold;
            pSold=sold;
            pRest = rest;
            hold=Math.max(pHold,pRest-stocks[i]);
            sold=pHold+stocks[i];
            rest=Math.max(pRest,pSold);
        } 
        return Math.max(sold, rest);
    }
}