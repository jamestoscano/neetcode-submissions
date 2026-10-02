class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int longest = 0;
        for (int num : set) {
            // Only start counting if 'num' is the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int length = 1;
                // expand streak...
                while (set.contains(num + length)){
                    length++;
                }
                longest = Math.max(longest, length);
            } 
        }
        return longest;
    }
}
