# Own pow(x,n( fnction

## Description
Implement own pow(x,n), which calculates x raised to the power n (i.e., xn).
The overall run time complexity should be O(log (m+n)).

## Java Code
```java
class Solution {
    public double myPow(double x, int n) {
        long absN = Math.abs((long) n);
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            x = 1 / x;
        }
        double result = 1.0;
        while (absN > 0) {
            if (absN % 2 == 1) {
                result *= x;
            }
            x *= x;
            absN /= 2;
        }
        return result;
    }
}
