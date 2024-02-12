package leet;

import java.util.Arrays;

class SolutionMergeSortedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] summed = new int[m + n];

        if (m >= 0) System.arraycopy(nums1, 0, summed, 0, m);

        if (n >= 0) System.arraycopy(nums2, 0, summed, m, n);

        Arrays.sort(summed);

        System.arraycopy(summed, 0, nums1, 0, summed.length);

    }
}