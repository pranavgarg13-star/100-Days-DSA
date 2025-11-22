class Solution {
    public int countValidWords(String sentence) {
        String[] tokens = sentence.trim().split("\\s+");
        int count = 0;

        for (String token : tokens) {
            if (isValid(token)) {
                count++;
            }
        }
        return count;
    }

    private boolean isValid(String s) {
        int hyphens = 0, punct = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            
            if (Character.isDigit(c)) return false;

            if (c == '-') {
                hyphens++;

                
                if (hyphens > 1) return false;

            
                if (i == 0 || i == s.length() - 1) return false;
                if (!Character.isLowerCase(s.charAt(i - 1)) || !Character.isLowerCase(s.charAt(i + 1)))
                    return false;
            }
            else if (c == '!' || c == '.' || c == ',') {
                punct++;

                
                if (punct > 1) return false;

                
                if (i != s.length() - 1) return false;
            }
            else if (!Character.isLowerCase(c)) {

                return false;
            }
        }

        return true;
        
    }
}
