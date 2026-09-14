class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int comp = target - nums[i];

            if (map.containsKey(nums[i])){
                //nums[i] is comp, 
                //i and map.get(nums[i]);
                int ans = map.get(nums[i]);
                if (i < ans) {
                    result[0] = i;
                    result[1] = ans;
                } else {
                    result[0] = ans;
                    result[1]= i;
                }
            }

            map.put(comp, i);
        }
        return result;
    }
}
