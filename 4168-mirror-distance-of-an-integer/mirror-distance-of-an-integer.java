class Solution {
    public int mirrorDistance(int n) {
        int a=n;
        int rev=0;
        while(a>0){
          int temp=  a%10;
    rev=rev*10+temp;
    a=a/10;
        }
        return Math.abs(n-rev);
    }
}