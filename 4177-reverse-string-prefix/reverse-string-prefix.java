class Solution {
    public String reversePrefix(String s, int k) {
        
        String s1 ="";
        for(int i =0;i<k;i++){
            s1=s.charAt(i)+s1;
        }
        for(int j=k;j<s.length();j++){
            s1=s1+s.charAt(j);
        }
        return s1;
    }
}