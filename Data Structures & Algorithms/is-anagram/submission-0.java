class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] charS = new char[256];
        char[] charT = new char[256];

        for(int i = 0; i < s.length(); i++){
            charS[s.charAt(i) - 'a']++;
            charT[t.charAt(i) - 'a']++;
        }

        for(int i = 0; i < charS.length; i++){
            if(charS[i] != charT[i]){
                return false;
            }
        }
        return true;
    }
}
