// 69. Sqrt(x)
/**
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. 
 * The returned integer should be non-negative as well.
 * You must not use any built-in exponent function or operator.
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 */

class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2; // equivalent to (left + right) / 2, but avoids potential overflow
            if ((mid * mid) <= x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}