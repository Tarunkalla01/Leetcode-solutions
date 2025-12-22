class Solution {
    public int[] productExceptSelf(int[] nums) {
       
        int pre[]=new int[nums.length];
         pre[0]=nums[0];
        int newarr[] = new int[nums.length];
        int ans[]= new int[nums.length];
        for(int i= 1;i<nums.length;i++){
            pre[i]=pre[i-1]*nums[i];
        }
        newarr[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            newarr[i]=newarr[i+1]*nums[i];
        }
        
        
        for(int i=0;i<nums.length;i++){
            if(i==0){
                ans[i]=newarr[i+1];
            }
            if(i>0 && i<nums.length-1){
            ans[i]=pre[i-1]*newarr[i+1];
            }
            if(i==nums.length-1){
                ans[i]=pre[nums.length-2];
            }
        }

        return ans;
    }
}