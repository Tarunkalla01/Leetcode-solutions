class Solution {
    public int minDeletionSize(String[] strs) {
        
        String s = strs[0];
        int count =0;
        for(int i=0;i<s.length() ; i++){

            for(int j=0 ; j<strs.length-1; j++){
                if(strs[j].charAt(i)> strs[j+1].charAt(i)){
                    count++;
                    break;
                }
            }
            

        }
    return count ;
    }
}