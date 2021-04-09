class Solution {
    public int climbStairs(int n) {
        
        if(n==1){
            return 1;
        }else if (n==2){
            return 2;
        }else{
             int[] climbs= new int[n];
            climbs[0]=1;
            climbs[1] =2;
            for(int i =2; i<n;i++){
                climbs[i] = climbs[i-1]+climbs[i-2];
            }
        return climbs[n-1];
        }
       
    }
}
