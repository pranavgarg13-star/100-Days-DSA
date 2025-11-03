class Solution {

    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
         HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr) {
            if (!seen.contains(num)) {
                seen.add(num);
                result.add(num);
            }
        }

        return result;
    }
}
