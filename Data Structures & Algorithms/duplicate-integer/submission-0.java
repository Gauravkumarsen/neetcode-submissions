class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int i =0 ;i<nums.length;i++){
        map.put(nums[i], 0);
       }
       for(int i =0;i<nums.length;i++){
        int count = map.get(nums[i]);
        map.put(nums[i], count+1);
        if(map.get(nums[i])>1){
            return true;
        }
       }
       return false;
    }
}