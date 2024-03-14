//Time Complexity O(nlogn) as expected in GFG Compiler
class Solution {
    boolean checkIsAP(int arr[], int n) {
        boolean ans = true; // Initialize ans to true
        Arrays.sort(arr);
        int d = arr[1] - arr[0];
        for (int i = 1; i < n - 1; i++) { // Iterate till the second last element
            if (arr[i + 1] - arr[i] != d) { // If the difference between consecutive elements is not equal to d
                ans = false; // Set ans to false
                break; // Break out of the loop as the array is not an AP
            }
        }
        return ans;
    }
}