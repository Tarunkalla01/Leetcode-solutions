class Solution {

         boolean check(int[] nums, int mid, int k) {
        int i = 0;

        while (i < nums.length) {
            if (nums[i] <= mid) {
                k--;
                i += 2; 
            } else {
                i++;
            }

            if (k == 0) {
                return true;
            }
        
               
            }
         return false;
         }

    public int minCapability(int[] nums, int k) {
        
         int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        for (int num : nums) {
            minimum = Math.min(minimum, num);
            maximum = Math.max(maximum, num);
        }

        int start = minimum;
        int end = maximum;
        int ans = maximum;
        while(start<=end ){
            int mid = (start+end)/2;

            if(check(nums, mid, k)){
                ans = mid ;
                end = mid -1 ;

            }
            else {
                start = mid+1;
            }


        }
return ans;
    }
}