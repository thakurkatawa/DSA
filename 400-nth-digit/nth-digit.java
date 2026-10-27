class Solution {
    public int findNthDigit(int n) {
        long digits=1;
        long count=9;
        long start=1;

         while (n > digits * count) {
            n -= digits * count;
            digits++;
            count *= 10;
            start *= 10;
        }

        // Find the actual number
        long number = start + (n - 1) / digits;

        // Find the digit's position
        String s = String.valueOf(number);
        int index = (int) ((n - 1) % digits);

        return s.charAt(index) - '0';
    }
}