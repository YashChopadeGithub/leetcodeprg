public class Solution {
    public int uniquePaths(int m, int n) {
        // Base case: If either row or column is 1, there's only one possible path
        if (m == 1 || n == 1) return 1;
        
        // Ensure m is always the larger number for fewer iterations
        if (m < n) {
            int temp = m;
            m = n;
            n = temp;
        }
        
        // Calculate the number of unique paths using combinatorics (m + n - 2 choose n - 1)
        long res = 1;
        for (int i = 1; i < n; i++) {
            res = res * (m + i - 1) / i;
        }
        
        return (int) res;
    }
}
