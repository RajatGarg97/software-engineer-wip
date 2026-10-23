class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        
        if(nums.length == 2) {
            res[1] = 1;
            return res;
        }

        Map<Integer, Integer> hm = new HashMap();

        for(int i = 0; i < nums.length; i++) {
            hm.put(target - nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
            int idx = hm.getOrDefault(nums[i], -1);
            if(idx != -1 && idx != i) {
               if(idx > i) {
                res[0] = i;
                res[1] = idx;
               } else {
                res[0] = idx;
                res[1] = i;
               }
               return res;
            }
        }
        return res;
    }
}
