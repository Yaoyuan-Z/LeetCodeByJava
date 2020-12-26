/*
Given a 32-bit signed integer, reverse digits of an integer.

Note:
Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */

public class ReverseInteger {
    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        int result = 0;
        while (x != 0) {
            if (result > Integer.MAX_VALUE / 10 || result == Integer.MAX_VALUE / 10 && x % 10 > 7) {
                return 0;
            } else if (result < Integer.MIN_VALUE / 10 || result == Integer.MIN_VALUE / 10 && x % 10 < -8) {
                return 0;
            }
            /*another solution:
            make result as long then convert it to int
             */
            result = result * 10 + x % 10;
            x = x / 10;
        }

        return result;

    }

}
