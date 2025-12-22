class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        String s1[] = new String[numRows];
        for(int i=0;i<numRows;i++){
            s1[i]="";

        }
        int dir=1;
        int steps=0;
        
        
        for(int i=0; i<s.length();i++){
            
            s1[steps]+=s.charAt(i);
          
            if(dir==1){  
                steps++;
            }
            else{
                steps--;
            }
              if(steps==0 || steps==s1.length-1){
                dir*= -1;
            }
            
        }
        String ans="";
        for(String s2 : s1){
            ans+=s2;
        }
        return ans;
    }
}