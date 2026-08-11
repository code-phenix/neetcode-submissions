class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> hashSet= new HashSet<>();
        int max=0;
        int left=0;
        for(int right =0 ;right<s.length();right++){
            while(hashSet.contains(s.charAt(right))){
                hashSet.remove(s.charAt(left));
                left++;
            }
            hashSet.add(s.charAt(right));
            max=Math.max(max,(right-left)+1);

        }
        return max;
        
    }
}
