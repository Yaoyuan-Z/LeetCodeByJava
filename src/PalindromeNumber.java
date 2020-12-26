/*
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Follow up: Could you solve it without converting the integer to a string?
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0 || x%10 ==0 && x!=0){
            return false;
        }

        int revert = 0;
        int initial =x;
        while(x!=0){
            revert = revert*10 +x%10;
            x= x/10;
        }
        return initial==revert;
    }
}
