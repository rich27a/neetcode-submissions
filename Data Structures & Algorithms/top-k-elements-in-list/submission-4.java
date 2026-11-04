class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            hashMap.merge(nums[i], 1, Integer::sum);
        }

        List<Integer>[] listNumbers = new List[nums.length + 1];

        for(Map.Entry<Integer, Integer> entry: hashMap.entrySet()){
            int count = entry.getValue();

            if(listNumbers[count] == null){
                listNumbers[count] = new ArrayList<>();
            }

            listNumbers[count].add(entry.getKey());
        }

        int[] result = new int[k];
        int idx = 0;

        for(int i = listNumbers.length - 1; i >= 0 && idx < k; i--){
            if(listNumbers[i] != null){
                for(int n: listNumbers[i]){
                    result[idx++] = n;
                }
            }
        }

        return result;
    }
}
