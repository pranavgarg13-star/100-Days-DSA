class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
           int n = arr.length;

        int totalSum = 0;
        for (int num : arr)
            totalSum += num;

        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum -= arr[i]; // totalSum now acts as rightSum

            if (leftSum == totalSum)
                return i; // 0-based index as asked

            leftSum += arr[i];
        }

        return -1; // no equilibrium found
        
    }
}
