class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
         int[] freq = new int[26];

        
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int maxFreq = 0;
        char result = 'z';

        
        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                result = (char)(i + 'a');
            } 
            else if (freq[i] == maxFreq && maxFreq > 0) {
                char curr = (char)(i + 'a');
                if (curr < result) {
                    result = curr;
                }
            }
        }

        return result;
    }
}
