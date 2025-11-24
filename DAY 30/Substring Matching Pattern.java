class Solution {
    public boolean hasMatch(String s, String p) {
   int star = p.indexOf('*');

        String left = p.substring(0, star);
        String right = p.substring(star + 1);

        int i = s.indexOf(left);
        int j = s.lastIndexOf(right);

        return i != -1 && j != -1 && i + left.length() <= j;
    }
}
