class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>, List<String>> hashMap = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            int[] keys = new int[26];
            for(int j = 0; j < strs[i].length(); j++){
                keys[strs[i].charAt(j) - 'a']++;
            }
            List<Integer> keysAsList = new ArrayList<>();
            for(Integer a: keys){
                keysAsList.add(a);
            }

            if(hashMap.containsKey(keysAsList)){
                List<String> list = hashMap.get(keysAsList);
                list.add(strs[i]);
                hashMap.put(keysAsList, list);
            }else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                hashMap.put(keysAsList, list);
            }
        }

        return new ArrayList<>(hashMap.values());
    }
}
