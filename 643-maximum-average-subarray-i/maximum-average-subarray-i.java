class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int max = Integer.MIN_VALUE ; 
        int i = 0 ; int j=i+k-1;
        while(j<nums.length){
            int temp=0;
            int tempi=i;
            while(i<=j){
                 temp+=nums[i];
                i++;
            }
            if(temp>max){
                max=temp;
            }
            j++;
            i=tempi+1;

        }
        
        return (max*1.0)/k ;
    }
}