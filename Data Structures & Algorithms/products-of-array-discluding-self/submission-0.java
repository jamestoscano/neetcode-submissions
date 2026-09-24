class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int product = 1;
        int[] prefix = new int[nums.length];

        // Left to right
        for (int i = 0; i < nums.length; i++) {
            prefix[i] = product;
            product *= nums[i];
        }

        product = 1;

        // Right to left
        for (int i = nums.length - 1; i >= 0; i--) {
            prefix[i] *= product;
            product = nums[i] * product;
        }
        return prefix;
    }
}  
