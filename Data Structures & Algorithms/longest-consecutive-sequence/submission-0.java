class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for(int num: nums){
            uniqueNumbers.add(num);
        }
        int maxSequence = 0;
        for(int i = 0; i < nums.length; i++){
            if(uniqueNumbers.contains(nums[i]) && !uniqueNumbers.contains(nums[i] - 1)){
                int count = 0;
                int start = nums[i];
                while(uniqueNumbers.contains(start)){
                    count++;
                    start++;
                }
                maxSequence = Math.max(count, maxSequence);
            }
            
        }

        return maxSequence;

    }
}
