class Solution {
    public int minimumPrefixLength(int[] nums) {
        int length = 0 ;
        int current=0;
        for(int i =0 ; i<nums.length-1 ; i++ ){

            if(nums[i]>=nums[i+1]){
                current++;
                if(current>length){
                    length=current;
                }
               
            }
            else{
                current++;
            }

        }
        return length;
    }
}