class Solution {
    public int[] shortestToChar(String s, char c) {
        int temp =-1;
        int left[] = new int[s.length()];
        for(int i=0 ; i<s.length();i++){

            if(s.charAt(i)==c){
                temp=i;
            }
               if(temp!=-1){
                 left[i]=i-temp;
               }
               else{
                left[i]=Integer.MAX_VALUE;
               }
        }

        int n =s.length();
        int temp1=n;
        int right[] = new int[s.length()];
        for(int j =s.length()-1; j>=0 ;j--){
            if(s.charAt(j)==c){
                temp1=j;
            }
            if(temp1!=n){
                 right[j]=temp1-j;
                 
               }
               else{
                right[j]=Integer.MAX_VALUE;

               }
            right[j]= Math.min(right[j],left[j]);
            
        }
    return right;
    }
}