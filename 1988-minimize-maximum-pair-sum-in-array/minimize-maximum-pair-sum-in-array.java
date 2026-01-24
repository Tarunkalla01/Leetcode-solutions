class Solution {
    public int minPairSum(int[] nums) {
        
        Arrays.sort(nums);

        int start = 0 ;
        int end = nums.length-1;
        int maximum = Integer.MIN_VALUE;

        while(start<end){

            int x = nums[start]+nums[end];
            maximum=Math.max(x,maximum);
            start++;
            end--;

        }

        return maximum;
    }
}