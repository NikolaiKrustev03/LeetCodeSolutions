# Merge Two Sorted Arrays

## Description
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).
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
