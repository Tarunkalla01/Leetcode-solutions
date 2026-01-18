class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int start = 0 ; 
        int end = 0 ; 
        int prod = 1 ; 
        int ans=0;
       while(end<nums.length){

        prod*=nums[end];
        while(start<=end  && k<=prod){
            prod/=nums[start];
            start++;
        }
        ans+=(end-start+1);
        end++;
       }
       return ans;
    }
}