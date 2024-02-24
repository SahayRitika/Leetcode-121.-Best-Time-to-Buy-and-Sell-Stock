class Solution {
    public int maxProfit(int[] prices) {
        int maxPro=0;
        int minPri=Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){
            maxPro=Math.max(maxPro,prices[i]-minPri);
            minPri=Math.min(minPri,prices[i]);
        }
        return maxPro;
    }
}
