class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int i =0;
        int j=0;
        int count = s.length();
        if(s.length()==0){
            return true;
        }
        while(j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                count--;
                if(count<=0){
                    return true;
                }
            }
           
                j++;
            

        }
        return false;
    }
}