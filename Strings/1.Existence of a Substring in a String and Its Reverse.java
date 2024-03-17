class Solution {
    public boolean isSubstringPresent(String s) {
        List<String> substrings=new ArrayList<>();
        for(int i=0;i<s.length()-1;i++){
            substrings.add(s.charAt(i)+""+s.charAt(i+1));
            //stores all the consecutive two-character substrings of the input string s.
        }
        String rev=new StringBuilder(s).reverse().toString();
        for(int i=0;i<substrings.size();i++){
            if(s.contains(substrings.get(i)) && rev.contains(substrings.get(i))){
                return true;
            }
        }
        return false;
    }
}