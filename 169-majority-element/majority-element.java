class Solution {
    public int majorityElement(int[] nums) {
        // Boyle moore voting Algo 
        int count=0;
        int cand = nums[0];
        for(int i=0;i<nums.length;i++){
           
            if(nums[i]==cand){
                count++;
            }
           else{
            count--;
           }
             if(count==0){
                cand = nums[i];
                count=1;
            }
           
        }
        return cand; 
    }
}