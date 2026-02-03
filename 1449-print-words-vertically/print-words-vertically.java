class Solution {
    public List<String> printVertically(String s) {
        List<String> l = new ArrayList<>();
        String arr[]=s.split(" ");
        int maxlen =0;
        for(int x=0 ; x<arr.length ; x++){
        
            if(maxlen<arr[x].length()){
                maxlen=arr[x].length();
            }
        }

        int i=0;
        while(i<maxlen){
            String s1="";
            int j=0;
            while(j<arr.length){
               if(i<arr[j].length()){
                 s1+=arr[j].charAt(i);
               }
               else{
                s1+=" ";
               }

                j++;
            }
              String result = s1.stripTrailing();
        l.add(result);
        i++;
        }
      return l;
    }
}