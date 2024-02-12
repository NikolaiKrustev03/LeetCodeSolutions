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
