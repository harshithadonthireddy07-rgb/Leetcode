class Solution {
    public int minimumArrayLength(int[] nums) {
        int min = Integer.MAX_VALUE;
        int count = 0;

        // Find minimum and count its occurrences
        for (int num : nums) {
            if (num < min) {
                min = num;
                count = 1;
            } else if (num == min) {
                count++;
            }
        }

        // Check whether every number is divisible by min
        for (int num : nums) {
            if (num % min != 0) {
                return 1;
            }
        }

        // All numbers are divisible by min
        return (count + 1) / 2;
    }
}