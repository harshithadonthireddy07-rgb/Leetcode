class Solution {
    public int maxLength(int[] nums) {
        int best = 0;

        for (int i = 0; i < nums.length; i++) {
            long product = 1;
            int gcd = 0;
            long lcm = 1;

            for (int j = i; j < nums.length; j++) {
                int x = nums[j];

                product *= x;
                gcd = gcd(gcd, x);
                lcm = lcm / gcd((int) lcm, x) * x;

                if (product == (long) gcd * lcm) {
                    best = Math.max(best, j - i + 1);
                }
            }
        }

        return best;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}