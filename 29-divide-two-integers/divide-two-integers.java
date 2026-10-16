class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
        long remain = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        long ans = 0;

        while (remain >= d) {
            long chunk = d;
            long count = 1;

            while (chunk <= (remain >> 1)) {
                chunk <<= 1;
                count <<= 1;
            }

            remain -= chunk;
            ans += count;
        }

        return sign == -1 ? (int) -ans : (int) ans;
    }
}