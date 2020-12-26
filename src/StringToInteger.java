/*
Implement atoi which converts a string to an integer.

The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

If no valid conversion could be performed, a zero value is returned.
 */
public class StringToInteger {
    public int myAtoi(String s){
        String x= "";
        String target ="+- ";
        boolean isPositive = true;
        for(int i=0; i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))&& !target.contains(""+s.charAt(i)) ){
                if(x ==""){
                    return 0;
                }else {
                    break;
                }
            }
            if(!Character.isDigit(s.charAt(i))&& target.contains(""+s.charAt(i)) ){
                if(x !=""){
                    break;
                }
            }

            if(Character.isDigit(s.charAt(i))){

                if(i-1>=0&& x.equals("")){
                    isPositive = !(s.charAt(i-1) =='-');
                    if(s.substring(0,i-1).contains("+")||s.substring(0,i-1).contains("-")||s.substring(0,i-1).contains(".")){
                        return 0;
                    }
                }
                x= x+s.charAt(i);
            }
        }

        long result = 0;
        if (isPositive) {
            for (int i = 0; i < x.length(); i++) {
                result = result * 10 + x.charAt(i) - '0';
                if (result > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
            }
        } else {
            for (int i=0; i<x.length();i++){
                result = result*10 - (x.charAt(i) - '0');
                if(result < Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
            }
        }
        return (int)result;
    }
}
