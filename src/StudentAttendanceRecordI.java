class Solution {
    public boolean checkRecord(String s) {
        int longestL =0;
        int countA = 0;
        int currentL =0;
        for(int i =0; i<s.length();i++){
            switch (s.charAt(i)){
                case 'A':
                    countA=countA+1;
                    currentL = 0;
                    break;
                case 'L':
                    currentL = currentL+1;
                    if(currentL>longestL){
                        longestL = currentL;
                    }
                    break;
                default:
                    currentL =0;
                    break;
                    
            }
        }

        return ((longestL<3)&&(countA<2));
        
    }
}
