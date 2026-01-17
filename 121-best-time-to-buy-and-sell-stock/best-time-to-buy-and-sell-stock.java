class Solution {
    public int maxProfit(int[] prices) {
        int maximum=0;
         int min =Integer.MAX_VALUE;
        for(int i = 0 ; i<prices.length ;i++){
           
            if(prices[i]<min){
                min=prices[i];
            }
            else {

                maximum=Math.max(maximum,prices[i]-min);
            }
        }
        return maximum;
    }
}