package leet;

class Solution {
    private static final int MIN = -(int)Math.pow(2, 31);
    private static final int MAX = (int)Math.pow(2, 31) - 1;
    public int reverse(int x){
        long reversedInteger = 0;
        int sign = x >= 0 ? 1 : -1;
        x = Math.abs(x);

        while(x != 0){
            int digit = x % 10;
            reversedInteger = reversedInteger * 10 + digit;

            x /= 10;
        }
        reversedInteger *= sign;
        if (reversedInteger > MAX || reversedInteger < MIN) {
            return 0;
        }
        else{
            return (int) (reversedInteger);
        }
    }

    public static void main(String[] args) {
        /*Solution solution = new Solution();
        System.out.println(solution.reverse(1234));
        System.out.println(solution.reverse((int)Math.pow(2, 39)));
        System.out.println(solution.reverse(-2345));*/
    }
}