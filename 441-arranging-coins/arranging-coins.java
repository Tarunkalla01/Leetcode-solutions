class Solution {
    public int arrangeCoins(int n) {
        long max= n;
        long min = 0;
        long mid =0;
        long ans=0;
        while(min<=max){
            mid=min-(min-max)/2;
            if(  n>=(mid*(mid+1))/2){
               ans=mid;
               min=mid+1;
            }
            else{
                max=mid-1;
            }
        
        }
         return (int)ans;
    }
}