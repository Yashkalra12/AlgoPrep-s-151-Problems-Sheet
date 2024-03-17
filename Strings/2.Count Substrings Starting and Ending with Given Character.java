//Optimal Code
class Solution {
    public long countSubstrings(String s, char c) {
        long count = 0;
       
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == c)    count++;
        }
        
        return count*(count+1)/2;
    }
}
//BruteForce Time Complexity O(n^3)
// import java.util.ArrayList;
// import java.util.List;

// class Solution {
//     public long countSubstrings(String s, char c) {
//         List<String> substrings = new ArrayList<>();
//         for (int i = 0; i < s.length(); i++) {
//             for (int j = i + 1; j <= s.length(); j++) { 
//                 substrings.add(s.substring(i, j));
//             }
//         }
//         int count = 0;
//         for (int i = 0; i < substrings.size(); i++) {
//             String substring = substrings.get(i); 
//             char first = substring.charAt(0);
//             char last = substring.charAt(substring.length() - 1);
//             if (first == c && last == c) {
//                 count++;
//             }
//         }
//         return count;
//     }
// }
