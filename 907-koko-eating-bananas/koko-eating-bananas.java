class Solution {

    private boolean check(int[] piles ,int mid,int h){
        int n= piles.length;
        long hrs=0;
        for(int i=0 ; i<n ; i++){
            hrs+=(piles[i]+mid-1)/mid;
        }
        if(hrs<=h){
            return true;
        }
        return false;
    }


    public int minEatingSpeed(int[] piles, int h) {
        
    int low = 1;
    int high = piles[0];
    
    int count =0;
    for(int i=0 ;i<piles.length;i++ ){
        if(piles[i]>high){
            high=piles[i];
        }
    }

    while(low<=high){

        int mid = low+(high-low)/2;

        if(check(piles,mid,h)){
            count =mid ;
            high =mid-1;
        }
        else{
            low=mid+1;
        }
    }
    return count ;
    }


}