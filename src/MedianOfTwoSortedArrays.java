/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

Follow up: The overall run time complexity should be O(log (m+n)

 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length == 0 && nums2.length == 0) {
            return 0.00;
        } else if (nums1.length == 0) {
            if (nums2.length % 2 == 1) {
                return (double) nums2[nums2.length / 2];
            } else {
                return ((double) (nums2[nums2.length / 2 - 1] + (double) nums2[nums2.length / 2]) / 2);
            }

        } else if (nums2.length == 0) {
            if (nums1.length % 2 == 1) {
                return (double) nums1[nums1.length / 2];
            } else {
                return ((double) (nums1[nums1.length / 2 - 1] + (double) nums1[nums1.length / 2]) / 2);
            }
        }

        int length = nums1.length + nums2.length;
        int[] temp = new int[length / 2 + 1];
        int i = 0;
        if (length % 2 == 1) {

            int temp1 = 0, temp2 = 0;

            while (i < length / 2 + 1) {
                //System.out.println("temp1:"+temp1+"temp2:"+temp2+"num2.length"+nums2.length);
                if (temp1 == nums1.length) {
                    temp[i] = nums2[temp2];
                    temp2++;
                } else if (temp2 == nums2.length) {
                    temp[i] = nums1[temp1];
                    temp1++;
                } else if (nums1[temp1] < nums2[temp2]) {
                    temp[i] = nums1[temp1];
                    temp1++;
                } else {
                    temp[i] = nums2[temp2];
                    temp2++;
                }
                i++;
            }
            return (double)(temp[i - 1]);
        } else {
            int temp1 = 0, temp2 = 0;
            while (i < length / 2 + 1) {

                if (temp1 == nums1.length) {
                    temp[i] = nums2[temp2];
                    temp2++;
                } else if (temp2 == nums2.length) {
                    temp[i] = nums1[temp1];
                    temp1++;
                } else if (nums1[temp1] < nums2[temp2]) {
                    temp[i] = nums1[temp1];
                    temp1++;
                } else {
                    temp[i] = nums2[temp2];
                    temp2++;
                }
                i++;

            }

            return ((Double.valueOf(temp[i - 2]) + Double.valueOf(temp[i - 1])) / 2);
        }


    }
}
