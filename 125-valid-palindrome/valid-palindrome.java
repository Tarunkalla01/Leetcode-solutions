class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();   // FIX 1

        String s1 = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) { // FIX 2
                s1 = s1 + ch;
            }
        }

        int left = 0;
        int right = s1.length() - 1;

        while (left < right) {
            if (s1.charAt(left) != s1.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}