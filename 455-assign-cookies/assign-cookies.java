class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int j=0;
        if(s.length==0 || g.length==0){
            return count;
        }
        for(int i=0;i<g.length ; ){
            int temp = g[i];
                if(s[j]>=g[i]){
                    count++;
                    i++;
                }
                j++;
                
                if(j==s.length){
                    break;
                }
            
        }
        return count ;
    }
}