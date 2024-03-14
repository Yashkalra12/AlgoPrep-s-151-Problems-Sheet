// Description
// Assume you have an array of length n initialized with all 0's and are given k update operations.

// Each operation is represented as a triplet: [startIndex, endIndex, inc] which increments each element of subarray A[startIndex ... endIndex] (startIndex and endIndex inclusive) with inc.

// Return the modified array after all k operations were executed.

// Example
// Given:
// length = 5,
// updates = 
// [
// [1,  3,  2],
// [2,  4,  3],
// [0,  2, -2]
// ]
// return [-2, 0, 3, 5, 3]

// Explanation:
// Initial state:
// [ 0, 0, 0, 0, 0 ]
// After applying operation [1, 3, 2]:
// [ 0, 2, 2, 2, 0 ]
// After applying operation [2, 4, 3]:
// [ 0, 2, 5, 5, 3 ]
// After applying operation [0, 2, -2]:
// [-2, 0, 3, 5, 3 ]



class Solution {
    // Method to compute the modified array after a sequence of updates
    public int[] getModifiedArray(int length, int[][] updates) {
        // Create an array 'difference' initialized to zero, with the given length
        int[] difference = new int[length];

        // Apply each update in the updates array
        for (int[] update : updates) {
            int startIndex = update[0]; // Start index for the update
            int endIndex = update[1];   // End index for the update
            int increment = update[2];  // Value to add to the subarray

            // Apply increment to the start index
            difference[startIndex] += increment;

            // If the end index is not the last element,
            // apply the negation of increment to the element after the end index
            if (endIndex + 1 < length) {
                difference[endIndex + 1] -= increment;
            }
        }

        // Convert the 'difference' array into the actual array 'result'
        // where each element is the cumulative sum from start to that index
        for (int i = 1; i < length; i++) {
            difference[i] += difference[i - 1];
        }

        // Return the resultant modified array
        return difference;
    }
}