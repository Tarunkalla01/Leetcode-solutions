class Solution {
    public String reverseWords(String s) {
        int vowel = 0;
        String arr[] = s.split(" ");
        String ans = arr[0] + " ";
        for (int j = 0; j < arr[0].length(); j++) {
            if (s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o'
                    || s.charAt(j) == 'u') {
                vowel++;
            }
        }

        for (int i = 1; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr[i].length(); j++) {

                if (arr[i].charAt(j) == 'a' || arr[i].charAt(j) == 'e' || arr[i].charAt(j) == 'i' || arr[i].charAt(j) == 'o'
                        || arr[i].charAt(j) == 'u') {
                    count++;
                }
            }
            if (count == vowel) {
                String s1 = "";
                for (int k = arr[i].length() - 1; k >= 0; k--) {
                    s1 = s1 + arr[i].charAt(k);
                }
                ans = ans + s1 + " ";
            } else {
                ans = ans + arr[i]+" ";
                count = 0;
            }

        }
        return ans.trim();
    }
}