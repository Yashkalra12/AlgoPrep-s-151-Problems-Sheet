//Time Complexity O(n)
// class Solution {
//     public List<Integer> findAnagrams(String s, String p) {
//         List<Integer> list = new ArrayList<>();
//         if(s.length() < p.length()) {
//             return list;
//         }

//         int[] freqS = new int[26];
//         int[] freqP = new int[26];


//         for(int i=0; i<p.length(); i++) {
//             freqS[s.charAt(i)-'a']++;
//             freqP[p.charAt(i)-'a']++;
//         }

//         if(Arrays.equals(freqS, freqP)) {
//             list.add(0);
//         }

//         int start = 0;
//         int end = p.length();

//         while(end < s.length()) {

//             freqS[s.charAt(start)-'a']--;
//             freqS[s.charAt(end)-'a']++;

//             if(Arrays.equals(freqS, freqP)) {
//                 list.add(start+1);
//             }
//             end++;
//             start++;
//         }
//         return list;
//     }
// }

//Implementing HashMap

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if(s.length() < p.length()) {
            return list;
        }

        // HashMaps to store frequencies of characters
        HashMap<Character, Integer> freqS = new HashMap<>();
        HashMap<Character, Integer> freqP = new HashMap<>();

        // Initialize freqP with frequencies of characters in string p
        for(char c : p.toCharArray()) {
            freqP.put(c, freqP.getOrDefault(c, 0) + 1);
        }

        // Initialize freqS with frequencies of characters in the first window of size p.length() in string s
        for(int i = 0; i < p.length(); i++) {
            char charS = s.charAt(i);
            freqS.put(charS, freqS.getOrDefault(charS, 0) + 1);
        }

        // Check if the first window is an anagram of p and add its starting index to list
        if(freqS.equals(freqP)) {
            list.add(0);
        }

        int start = 0;
        int end = p.length();

        // Slide the window and check for anagrams
        while(end < s.length()) {
            char charStart = s.charAt(start);
            char charEnd = s.charAt(end);

            // Update frequencies as window slides
            freqS.put(charStart, freqS.get(charStart) - 1);
            if(freqS.get(charStart) == 0) {
                freqS.remove(charStart);
            }
            freqS.put(charEnd, freqS.getOrDefault(charEnd, 0) + 1);

            // If frequencies are equal, add the starting index of current window to list
            if(freqS.equals(freqP)) {
                list.add(start + 1);
            }
            end++;
            start++;
        }
        return list;
    }
}
