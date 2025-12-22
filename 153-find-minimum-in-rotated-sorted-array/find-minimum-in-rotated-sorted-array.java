class Solution {
    public int findMin(int[] nums) {
        
        int i=0;
        int j=nums.length-1;
        int mid=0;

        while(i<j){
            mid=i-(i-j)/2;

            if(nums[mid]>nums[nums.length-1]){
                i=mid+1;
            }
            else{
                j=mid;
            }
            

        }
return nums[i];
    }
}