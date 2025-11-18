class Solution {
    public int maxSumIS(int arr[]) {
        int n = arr.length;
        int[] dp = new int[n];

        // Initialize dp with the values of array elements
        for (int i = 0; i < n; i++) {
            dp[i] = arr[i];
        }

        // Build dp[] based on previous smaller elements
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + arr[i]);
                }
            }
        }

        // Find maximum value in dp[]
        int ans = 0;
        for (int x : dp) {
            ans = Math.max(ans, x);
        }

        return ans;
    }
}