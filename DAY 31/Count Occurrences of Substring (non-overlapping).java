class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
          Map<String, Integer> countMap = new HashMap<>();
        int n = s.length();

        for (int i = 0; i + minSize <= n; i++) {
            String sub = s.substring(i, i + minSize);

            if (isValid(sub, maxLetters)) {
                countMap.put(sub, countMap.getOrDefault(sub, 0) + 1);
            }
        }

        int max = 0;
        for (int val : countMap.values()) {
            max = Math.max(max, val);
        }

        return max;
    }

    private boolean isValid(String sub, int maxLetters) {
        int[] freq = new int[26];
        int unique = 0;

        for (char c : sub.toCharArray()) {
            if (freq[c - 'a'] == 0) unique++;
            freq[c - 'a']++;
        }

        return unique <= maxLetters;
    }
}
