class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
   
        for(int i = 0 ; i<nums1.length ; i++){

            int x=nums1[i];
            ans[i]=-1;

            for(int j=0 ; j<nums2.length ; j++){

                if(x==nums2[j]){
                    for(int temp = j+1; temp<nums2.length;temp++){
                    if(nums2[temp]>x){

                        ans[i]=nums2[temp];
                        break;
                        
                    }
                    
                }
            }
        }
    }   
    return ans;
    }
}