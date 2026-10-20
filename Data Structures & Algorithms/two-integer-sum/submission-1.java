class Solution {
    public int[] twoSum(int[] nums, int target) {
        // [3,4,5,6] target = 7

        // hashMap contains 4?
        // hashMap.put(3, 0)

        // hashMap contains 3?
        // yes return currIndx and hashMap.get 3

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if(hashMap.containsKey(complement)){
                return new int[]{hashMap.get(complement), i};
            }else{
                hashMap.put(nums[i], i);
            }
        }

        return new int[]{};
    }
}
