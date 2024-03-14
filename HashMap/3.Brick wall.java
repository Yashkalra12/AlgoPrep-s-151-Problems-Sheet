import java.util.*;

class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer,Integer> m=new HashMap<>();
        int n=wall.size();
        int ans=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<wall.get(i).size()-1;j++){
                sum+=wall.get(i).get(j);
                m.put(sum, m.getOrDefault(sum, 0) + 1);
                ans=Math.max(ans,m.get(sum));
            }
        }
        return n - ans;
    }
}
