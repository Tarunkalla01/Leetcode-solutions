class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        
        int cost = 0;
        int count=0;
        int j=0;

        for(int i = 0 ; i<s.length() ; i++){
           char ch1=s.charAt(i);
           char ch2=t.charAt(i);
            cost+=Math.abs(ch1-ch2);

            while(cost>maxCost){
                cost=cost-Math.abs(s.charAt(j)-t.charAt(j));
                j++;
            }
            count=Math.max(count,i-j+1);
        }
        return count;
    }
}