class Solution {
    public boolean hasDuplicate(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return false;
        }
        HashSet<Integer> hs = new HashSet();
        for(int i = 0; i < len; i++) {
            if (hs.contains(nums[i])) return true;
            hs.add(nums[i]);
        }
        return false;
    }
}