# Merge Sorted Array

## Description
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
## Java Code
```java
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
