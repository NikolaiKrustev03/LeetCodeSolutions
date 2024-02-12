# Merge Sorted Array

## Description
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).
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
