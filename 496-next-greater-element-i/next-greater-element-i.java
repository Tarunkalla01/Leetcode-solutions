class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       Stack<Integer> st = new Stack<>();
    HashMap<Integer , Integer> nextg = new HashMap<>();
    HashMap<Integer , Integer> mapping = new HashMap<>();
     int ans[] = new int[nums1.length];
    // store the value , indexes in map 
    for(int i=0;i<nums2.length ; i++){
        mapping.put(nums2[i] , i);
    }

    // store indexes of next greater
    for(int i=0;i<nums2.length ; i++){

      

        while(!st.isEmpty() && nums2[i]>nums2[st.peek()]){
            int temp = st.peek();
            st.pop();
            nextg.put(temp ,i);
        }
        st.push(i);
    } 

    // remaining stack element
    while(!st.isEmpty()){
        int t = st.peek();
        st.pop();
        nextg.put(t,-1);
    }

    //
   
    for(int i = 0 ; i<nums1.length ; i++){
        int index = mapping.get(nums1[i]); 
        int ng = nextg.get(index);
        if(ng==-1){
            ans[i]=-1;
        }
        else{
            ans[i] = nums2[ng];
        }
    }
    return ans;
    }
}