class Solution {

    public int sq(int x) {
        int temp = x;
        int sum = 0;

        while (temp > 0) {
            int var = temp % 10;
            sum += var * var;
            temp /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        Set<Integer> hs = new HashSet<>();

        while (n != 1) {
            if (hs.contains(n)) {
                return false; 
            }
            hs.add(n);
            n = sq(n);
        }
        return true;
    }
}