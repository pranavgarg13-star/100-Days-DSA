class Solution {
    public static int firstRepeated(int[] arr) {
        // code here
       int n = arr.length;

    
        boolean[] seen = new boolean[1000001]; 
        int minIndex = -1;

        for (int i = n - 1; i >= 0; i--) {
            if (seen[arr[i]]) {
                minIndex = i;
            } else {
                seen[arr[i]] = true;
            }
        }

        return (minIndex == -1) ? -1 : (minIndex + 1);
    }
}
