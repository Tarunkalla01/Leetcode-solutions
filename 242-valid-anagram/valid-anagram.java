class Solution {
    public boolean isAnagram(String s, String t) {
        // char[] sarr = s.toCharArray();
        // Arrays.sort(sarr);

        //  char[] tarr = t.toCharArray();
        // Arrays.sort(tarr);


        // if(Arrays.equals(tarr,sarr)){
        //     return true;
        // }
        // return false;
        if(s.length()!=t.length()){
            return false;
        }

       int [] freq = new int [26];
       for(int i = 0; i<s.length();i++){
            freq[s.charAt(i)-'a']++;
       }
       for(int i = 0; i<t.length();i++){
            freq[t.charAt(i)-'a']--;
       }
       for(int i=0;i<freq.length;i++){
        if(freq[i]!=0){
            return false;
        }

       }
       return true;
    }
}