class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        
        Arrays.sort(towers ,(a,b)->{
            if(a[0]!=b[0]){
                return a[0]-b[0];
            }
            return a[1]-b[1];
        });

        int x1=-1; int y1=-1; int q=-1;
        int c1=center[0];
            int c2=center[1];
        for(int i =0; i<towers.length ; i++){
           

                int x = Math.abs(c1 - towers[i][0]) + Math.abs(c2 - towers[i][1]) ;
                if(x<=radius && towers[i][2]>q  ){
                    x1=towers[i][0];
                    y1=towers[i][1];
                    q=towers[i][2];
                }
        }
         int temp[] ={x1,y1};
         return temp;
    }
}

