class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
    //     int max= 0;
    //     int count  =0 
    //     int temp=0;
    //    while(k>0){
        
    //     for(int i = 0;i<happiness.length ; i++){
    //             if(happiness[i]>max){
    //                 max=happiness[i];
    //                 temp = i;
    //             }
    //     }

    //     for(int j=0 ;j<happiness.length ; j++){
    //         nums[j]=nums[j]-1;
    //         nums[temp]=0;
    //     }
    //    }

    Arrays.sort(happiness);
    
    int count =1;
    int n = happiness.length-1;
    long sum =happiness[n] ;
    k--;
    for(int i=n-1;i>=0 && k>0 ; i--){
        
        if((happiness[i]-count)>0){
            sum+=happiness[i]-count;
        }
        count++;
        k--;
    }
    return sum;
    }
}