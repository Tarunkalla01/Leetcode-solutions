class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        
        int temp[] = new int[n];

        for(int i =0;i<bookings.length ;i++){
            int x =bookings[i][0];
            int y =bookings[i][1];
            while(x<=y){
                 temp[x-1] = temp[x-1]+bookings[i][2];
                 x++;
            }
        }
    return temp;
    }
}