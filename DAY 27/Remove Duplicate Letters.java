class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];     
        boolean[] visited = new boolean[26]; 
        

        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = c - 'a';
            
        
            if (visited[idx]) continue;
            
            
            while (!stack.isEmpty() &&
                    c < stack.peek() &&
                    lastIndex[stack.peek() - 'a'] > i) {
                visited[stack.pop() - 'a'] = false;
            }
            
            stack.push(c);
            visited[idx] = true;
        }
        
        
        StringBuilder result = new StringBuilder();
        for (char ch : stack) result.append(ch);
        
        return result.toString();
    }

}
