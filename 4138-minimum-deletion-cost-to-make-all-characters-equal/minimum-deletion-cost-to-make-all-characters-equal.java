class Solution {
    public long minCost(String s, int[] cost) {
        
       long minimum = Long.MAX_VALUE;
       
        for(char c = 'a' ; c <='z';c++){
             long Cost =0;
            for(int i=0;i<s.length(); i++){

                if(c != s.charAt(i)){
                    Cost=Cost+cost[i];
                }
                
            }
            minimum=Math.min(Cost,minimum);

        }
        return minimum;
    }
}