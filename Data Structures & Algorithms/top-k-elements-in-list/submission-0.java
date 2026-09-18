class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        int max = 0;

        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> results =
            new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        

        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int num : map.keySet()) {
            // I know:
            // num
            // map.get(num) = its frequency
            results.offer(num);

            // what should I do with num here?
            if (results.size() > k){
                results.poll();
            }
        }

        for (int i = 0; i < k; i++) {
            // what PriorityQueue method gives you
            // an element AND removes it?
            res[i] = results.poll();
        }
        return res;


    }
}
