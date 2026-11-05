class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for(int i = 0; i < s.length(); i++){
            mapS[s.charAt(i) - 'a']++;
            mapT[t.charAt(i) - 'a']++;
        }

        for(int i = 0; i < mapS.length; i++){
            if(mapS[i] != mapT[i]){
                return false;
            }
        }

        return true;

    }
}
