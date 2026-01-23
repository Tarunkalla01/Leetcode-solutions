class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        int i=0;
       
        
        String s="";
        String first = strs[0];
        String last = strs[strs.length-1];
        int x = Math.min(first.length(),last.length()) ;
        while(i< x ){

            if(first.charAt(i)==last.charAt(i)){
                s+=first.charAt(i);
                i++;
            }
            else{
                break;
            }


           
        }

return s;
    }
}