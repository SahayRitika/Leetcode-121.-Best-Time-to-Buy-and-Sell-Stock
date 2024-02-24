class Solution {
    public int maxProfit(int[] prices) {
        int pro=0,totalPro=0,min=prices[0];
        for(int i=0;i<prices.length-1;i++){
        if(prices[i]>prices[i+1]){
            min=prices[i+1];
        }
        else{
            pro=prices[i+1]-prices[i];
            totalPro+=pro;
        }
        }
        return totalPro;
    }
}
