# Remove one element from aray to make it strictly increasing

## Description
Given a 0-indexed integer array nums, return true if it can be made strictly increasing after removing exactly one element, or false otherwise. If the array is already strictly increasing, return true.

The array nums is strictly increasing if nums[i - 1] < nums[i] for each index (1 <= i < nums.length).
 
## Java Code
```java
package leet;

public class SolutionIncreasingArray {
    public boolean canBeIncreasing(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (isStrictlyIncreasing(removeElement(nums, i)))
                return true;
        }
        return false;
    }

    private boolean isStrictlyIncreasing(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1])
                return false;
        }
        return true;
    }

    private int[] removeElement(int[] nums, int index) {
        int[] newArr = new int[nums.length - 1];
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (i != index)
                newArr[j++] = nums[i];
        }
        return newArr;
    }
}
