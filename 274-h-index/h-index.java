class Solution {
    public int hIndex(int[] citations) {
        
        Arrays.sort(citations);

        int Start = citations[0];
        int end = citations[citations.length-1];
        
        for(int i =end ; i>= 0 ; i--){
            int cnt=0;
            for(int j=0;j<citations.length;j++){
                if(citations[j]>=i){
                    cnt++;
                }
            }
            if(cnt>=i){
                return i;
            }
        }
        return 0;
  
    }
}