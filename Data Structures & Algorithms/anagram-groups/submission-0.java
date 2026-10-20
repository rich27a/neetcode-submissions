class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<Character>, List<String>> hashMap = new HashMap<>();

        List<List<String>> result = new ArrayList<>();

        for(int i = 0; i < strs.length; i++){
            char[] charArray = new char[26];

            for(int j = 0; j < strs[i].length(); j++){
                charArray[strs[i].charAt(j) - 'a']++;
            }

            List<Character> listChars = new ArrayList<>();
            for(char c: charArray){
                listChars.add(c);
            }

            if(hashMap.containsKey(listChars)){
                List<String> list = hashMap.get(listChars);
                list.add(strs[i]);
            }else{
                List<String> arrayList = new ArrayList<>();
                arrayList.add(strs[i]);
                hashMap.put(listChars, arrayList); 
            }

        }

        return new ArrayList<>(hashMap.values());
    }
}
