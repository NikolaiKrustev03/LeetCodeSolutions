# Reverse Integer

## Description
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

## Java Code
```java
package leet;

class Solution {
    private static final int MIN = -(int)Math.pow(2, 31);
    private static final int MAX = (int)Math.pow(2, 31) - 1;
    
    public int reverse(int x) {
        long reversedInteger = 0;
        int sign = x >= 0 ? 1 : -1;
        x = Math.abs(x);

        while (x != 0) {
            int digit = x % 10;
            reversedInteger = reversedInteger * 10 + digit;
            x /= 10;
        }
        
        reversedInteger *= sign;
        
        if (reversedInteger > MAX || reversedInteger < MIN) {
            return 0;
        } else {
            return (int) reversedInteger;
        }
    }

}
