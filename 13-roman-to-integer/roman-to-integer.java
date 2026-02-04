class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        int i =0;
        
        int sum=0;
        for(;i<s.length()-1 ;i++){
            int val1=mp.get(s.charAt(i));
            int val2=mp.get(s.charAt(i+1));
            if(val1>=val2){
               sum=sum+val1;
            }
            else{
                sum=sum-val1;
            }

        }
        sum+=mp.get(s.charAt(i));
        return sum;
    }
}