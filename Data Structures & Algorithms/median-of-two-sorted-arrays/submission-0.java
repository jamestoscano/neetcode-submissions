class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int length = nums1.length + nums2.length;
        int[] merged = new int[length];

        int left = 0;
        int right = 0;
        int index = 0;
        while (left < nums1.length && right < nums2.length){
            if (nums1[left] < nums2[right]) {
                merged[index] = nums1[left];
                left++;
                index++;
            } else {
                merged[index] = nums2[right];
                right++;
                index++;
            }
        }

        while (right < nums2.length) {
            merged[index] = nums2[right];
            right++;
            index++;
        }

        while (left < nums1.length) {
            merged[index] = nums1[left];
            left++;
            index++;
        }


        if (length % 2 == 1){
            return merged[length/2];
        } else {
            return ((double) (merged[length/2] + merged[(length/2)-1])/2);
        }
    }
}
