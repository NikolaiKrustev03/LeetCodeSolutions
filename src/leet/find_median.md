# Merge Two Sorted Arrays

## Description
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

## Java Code
```java
package leet;

import java.util.Arrays;

public class SolutionMedianOfSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] mergedNums = new int[n + m];
        int totalLength = mergedNums.length;
        for (int i = 0; i < totalLength; i++) {
            if (i < n){
                mergedNums[i] = nums1[i];
            }
            else{
                mergedNums[i] = nums2[i - n];
            }
        }
        Arrays.sort(mergedNums);
        if (totalLength % 2 == 0) {
            int midIndex1 = totalLength / 2 - 1;
            int midIndex2 = totalLength / 2;
            return (mergedNums[midIndex1] + mergedNums[midIndex2]) / 2.0;
        } else {
            int midIndex = totalLength / 2;
            return mergedNums[midIndex];
        }
    }

}
