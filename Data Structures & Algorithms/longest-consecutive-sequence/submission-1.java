class Solution {
    public int longestConsecutive(int[] nums) {
        int size = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        for(int i =0;i<size;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], (map.getOrDefault(nums[i]-1,0)+
                map.getOrDefault(nums[i]+1, 0) +1));
                map.put(nums[i]-map.getOrDefault(nums[i]-1,0), map.get(nums[i]));
                map.put(nums[i]+map.getOrDefault(nums[i]+1,0), map.get(nums[i]));
                 answer = Math.max(answer, map.get(nums[i]));
            }
        }
        return answer;
    }
}
