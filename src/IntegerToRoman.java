/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral.
 */
public class IntegerToRoman {
    public String intToRoman(int num){
        if(num>399||num<1){
            return null;
        }
        String result ="";
        int count =0;
        while(num!=0){
            String temp ="";
            int res = num%10;
            switch (count){
                case 0:
                    if(res<4){
                        temp ="I".repeat(res);
                    }else if(res ==4 ){
                        temp = "IV";
                    }else if(res<9){
                        temp = "V"+"I".repeat(res-5);
                    }else {
                        temp = "IX";
                    }
                    count ++;
                    result = temp+result;
                    break;
                case 1:
                    if(res<4){
                        temp ="X".repeat(res);
                    }else if(res ==4 ){
                        temp = "XL";
                    }else if(res<9){
                        temp = "L"+"X".repeat(res-5);
                    }else {
                        temp = "XC";
                    }
                    count++;
                    result = temp+result;
                    break;
                case 2:
                    count++;
                    if(res<4){
                        temp ="C".repeat(res);
                    }else if(res ==4 ){
                        temp = "CD";
                    }else if(res<9){
                        temp = "D"+"C".repeat(res-5);
                    }else {
                        temp = "CM";
                    }
                    result = temp+result;
                    break;
                default:
                    temp = "M".repeat(res);
                    result = temp+result;
                    break;
            }

            num = num/10;
        }

        return result;
    }
}
