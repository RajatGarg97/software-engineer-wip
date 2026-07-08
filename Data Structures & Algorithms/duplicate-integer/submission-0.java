class Solution {
    public boolean hasDuplicate(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return false;
        } 
        HashSet<Integer> hs = new HashSet();
        for(int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        return hs.size() < nums.length;
    }
}