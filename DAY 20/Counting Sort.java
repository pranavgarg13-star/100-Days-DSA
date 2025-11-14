class Solution {
    public static String countSort(String s) {
        // code here
        int[] count = new int[26];

        
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

       
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            while (count[i] > 0) {
                sb.append((char)(i + 'a'));
                count[i]--;
            }
        }

        return sb.toString();
    }
}
