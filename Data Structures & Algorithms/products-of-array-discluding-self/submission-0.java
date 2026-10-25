class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product = 1;
        result[0] = 1;
        for(int i = 0; i < nums.length - 1; i++) {
            product = product * nums[i];
            result[i + 1] = product;
        }

        product = 1;
        
        for(int i = nums.length - 1; i > 0; i--) {
            product = product * nums[i];
            result[i - 1] = result[i - 1] * product;
        }
        return result;
    }
}  
