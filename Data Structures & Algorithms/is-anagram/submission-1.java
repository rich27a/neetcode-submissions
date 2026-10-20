class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        return false;


        int[] sArrayMap = new int[256];
        int[] tArrayMap = new int[256];

         for(int i = 0; i < s.length(); i++){
            sArrayMap[s.charAt(i) - 'a']++;
            tArrayMap[t.charAt(i) - 'a']++;
         }
        
        for(int i = 0; i < sArrayMap.length; i++){
            if(sArrayMap[i] != tArrayMap[i])
            return false;
         }

        return true;
    }
}
