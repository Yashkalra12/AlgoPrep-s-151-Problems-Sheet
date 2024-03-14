//Optimal Code via Hashmap

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean findPair(int arr[], int size, int n) {
        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < size; i++) {
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);

            if (n == 0 && m.get(arr[i]) > 1) {
                return true;
            }
        }

        if (n == 0) {
            return false;
        }

        for (int i = 0; i < size; i++) {
            int sum = n + arr[i];
            if (m.containsKey(sum)) {
                return true;
            }
        }

        return false;
    }
}
