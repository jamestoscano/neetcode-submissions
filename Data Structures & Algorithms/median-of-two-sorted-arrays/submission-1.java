class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // nums1 and nums2 are sorted

        // 1. Set up binary search boundaries
        int left = 0;
        int right = nums1.length;
        int m = nums1.length;
        int n = nums2.length;

        // 2. Binary search through divider positions
        while (left <= right) {

            int mid = left + (right - left) / 2;

            // TODO: Determine how many elements
            //       nums2 contributes to the left half
            int partition2 = (m + n) / 2 - mid;


            // TODO: Identify the values immediately
            //       surrounding both dividers
            int left1 = (mid == 0) ? Integer.MIN_VALUE : nums1[mid - 1]; //left of div
            int right1 = (mid == nums1.length) ? Integer.MAX_VALUE : nums1[mid]; //left of div


            int left2 = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];
            int right2 = (partition2 == nums2.length) ? Integer.MAX_VALUE : nums2[partition2];
            // TODO: Check whether the partition is valid

            if (left1 <= right2 && left2 <= right1) {
                if ((m+n) % 2 > 0){
                    return Math.min(right1, right2);  
                }else {
                    return ((double) Math.max(left1, left2) + Math.min(right1, right2)) / 2;
                }
            } else if (left1 > right2){
                right = mid-1;
            } else if (left2 > right1){
                left = mid + 1;
            }

            // TODO: If invalid, decide which direction
            //       to move the divider
        }
        return -1;
    }
}
