class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequenciesMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            frequenciesMap.merge(nums[i], 1, Integer::sum);
        }
        
        List<Integer>[] list = new List[nums.length + 1];
        for(Map.Entry<Integer, Integer> entry: frequenciesMap.entrySet()){
            int count = entry.getValue();
            if(list[count] == null){
                list[count] = new ArrayList<>();
            }
            list[count].add(entry.getKey());
        }

        int[] result = new int[k];
        int idx = 0;

        for(int i = list.length - 1; i >= 0 && idx < k; i--){
            if(list[i] != null){
                for(Integer a: list[i]){
                    result[idx++] = a;
                }
            }
        }

        return result;

    }
}
