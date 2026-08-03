class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int count[]=new int[26];
        for(int iterI=0;iterI<s.length();iterI++){
            count[s.charAt(iterI)-'a']++;
            count[t.charAt(iterI)-'a']--;
        }
        for(int iterI=0;iterI<26;iterI++){
            if(count[iterI]!=0){
                return false;
            }
        }
        return true;
    }
}
