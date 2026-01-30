class Solution {
    public int minSetSize(int[] arr) {
        int n=arr.length;
       int f[] = new int[100000+1];

       for(int i:arr){
        f[i]++;
       }

       Arrays.sort(f);
       int count=0;
       int sum=0;
       for(int i=f.length-1;i>=0;i--){
           sum+=f[i];
           count++;
            if(sum>=n/2)
                return count;
        }
        return count;

        
        
    }
}