class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < numbers.length; i++){

            int needed = target - numbers[i];

            if(hashMap.containsKey(needed)){
                return new int[]{hashMap.get(needed) + 1, i + 1};
            }else{
                hashMap.put(numbers[i], i);
            }
        }
        return new int[]{};
    }
}
