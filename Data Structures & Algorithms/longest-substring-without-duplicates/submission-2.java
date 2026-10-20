class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()){
            return 0;
        }
        int maxLength = 0;
        int left = 0;
        Set<Character> hashSet = new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            
            while(hashSet.contains(s.charAt(i))){
                hashSet.remove(s.charAt(left));
                left++;
            }

            hashSet.add(s.charAt(i));
            maxLength = Math.max(maxLength, i - left);


        }
        return maxLength + 1;
    }
}
