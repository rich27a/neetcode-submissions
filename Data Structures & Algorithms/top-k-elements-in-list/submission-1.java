class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.merge(nums[i], 1, Integer::sum);
        }

        List<Integer>[] buckets = new List[nums.length + 1];

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int count = entry.getValue();

            if(buckets[count] == null){
                buckets[count] = new ArrayList();
            }

            buckets[count].add(entry.getKey());

        }

        int[] result = new int[k];
        int idx = 0;

        for(int i = buckets.length - 1; i >= 0 && idx < k; i--){
            if(buckets[i] != null){
                for(int n: buckets[i]){
                    result[idx++] = n;
                    if(idx == k) break;
                }
            }
        }

        return result;
    }
}
