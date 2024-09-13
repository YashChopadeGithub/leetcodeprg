class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        double halfpow = myPow(x, n / 2);
        double halfpowsq = halfpow * halfpow;

        if (n % 2 != 0) {
            if (n > 0) {
                return x * halfpowsq;
            } else {
                return (1 / x) * halfpowsq;
            }
        }

        return halfpowsq;
    }
}