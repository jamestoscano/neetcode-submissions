class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length){
            while ( i < nums.length && i > 0 && nums[i] == nums[i-1]){
                        i++;
            }
            int j = i+1;
            int k = nums.length-1;
            while (j < k){
                int sum = nums[i] + nums[j] + nums[k];

                if (sum < 0){
                    j++;
                } else if (sum > 0){
                    k--;
                } else if (sum == 0){
                    res.add(new ArrayList<>(List.of(nums[j],nums[k],nums[i])));
                    j++;
                    k--;
                    while ( j < k && nums[j] == nums[j-1]){
                        j++;
                    }
                }
            }
            i++;
        }
        return res;
    }
}
