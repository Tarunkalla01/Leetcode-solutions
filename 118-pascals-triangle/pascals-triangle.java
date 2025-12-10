class Solution {
    public List<List<Integer>> generate(int numRows) {
        // List<List<Integer>> l = new ArrayList();
        // List<Integer> temp = new ArrayList();
        //  List<Integer> temp2 = new ArrayList();
        // temp.add(1);
        // l.add(temp);
        // if(numRows==1){
        //     return l;
        // }
        
        // temp2.add(1);
        // l.add(temp2);
        // if(numRows==2){
        //     return l;
        // }
        // for(int i=3;i<=numRows;i++){
        //    List<Integer> curr = new ArrayList();
        //    curr.add(1);
        //    int sz=temp.size();

        //    for(int j=1;j<=sz-1;j++){
        //     curr.add(temp.get(j)+temp.get(j-1));
        //    }
        //    curr.add(1);
        //    l.add(curr);
        //    temp=curr;
        // }
        // return l;

            List<List<Integer>> ans = new ArrayList<>();

        if (numRows == 0) return ans;

        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        ans.add(prev);

        for (int i = 2; i <= numRows; i++) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            int sz = prev.size();
            for (int j = 1; j < sz; j++) {
                curr.add(prev.get(j - 1) + prev.get(j));
            }

            curr.add(1); 

            ans.add(curr);
            prev = curr;
        }

        return ans;
    }
}