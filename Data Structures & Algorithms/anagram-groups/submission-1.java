class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<Character>, List<String>> hashMap = new HashMap<>();

        List<List<String>> results = new ArrayList<>();

        for(int i = 0; i < strs.length; i++){

            char[] key = new char[26];

            for(int j = 0; j < strs[i].length(); j++){
                key[strs[i].charAt(j) - 'a']++;
            }

            List<Character> keys = new ArrayList<>();
            for(int k = 0; k < key.length; k++){
                keys.add(key[k]);
            }

            if(hashMap.containsKey(keys)){
                List<String> list = hashMap.get(keys);
                list.add(strs[i]);
                hashMap.put(keys, list);
            }else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                hashMap.put(keys, list);
            }
        }


        return new ArrayList<>(hashMap.values());
    }
}
