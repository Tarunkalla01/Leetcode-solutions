class Solution {
    public void rotate(int[][] matrix) {
        int inner= matrix[0].length;
        int outer=matrix.length;

        for(int i=0 ;i<outer ;i++){
            for(int j=i ; j<inner ;j++){

                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        for(int i=0;i<outer;i++){

            int start=0;
            int end=inner-1;
            while(start<=end){
                int temp = matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                start++;
                end--;
            }

        }

    }
}