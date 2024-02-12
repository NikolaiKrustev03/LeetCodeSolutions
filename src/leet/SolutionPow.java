package leet;

public class SolutionPow {
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

    public static void main(String[] args) {
        SolutionPow solutionPow = new SolutionPow();
        System.out.println(solutionPow.myPow(2.0,-2147483648));
    }
}
