class Solution {
    public int minEatingSpeed(int[] piles, int h) 
    {
        int left = 1;
        int right = 0;
        for (int num : piles){
            right = Math.max(num, right);
        }

        int res = right;

        while (left <= right){
            int k = left + (right-left) / 2;
            long hours = 0;
            for (int p : piles){
                hours += Math.ceil((double) p / k);
            }

            if (hours <= h){
                res = Math.min(res,k);
                right = k-1;

            } else {
                left = k+1;
            }
        }
        return res;
        
    }
}
