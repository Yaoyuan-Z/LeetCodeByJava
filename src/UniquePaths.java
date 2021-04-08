class Solution {
    public int uniquePaths(int m, int n) {
        if(m ==1 || n ==1){
            return 1;
        }
        
        int[][] nums = new int[m][n];
        nums[0][0] = 0;
        nums[0][1] =1;
        nums[1][0] =1;
        for (int i =1; i<m;i++){
            nums[i][0] =1; 
            for(int j =1; j<n; j++){
                nums[0][j] =1;
                nums[i][j] = nums[i-1][j] +nums[i][j-1];
            }
        }
        
        return nums[m-1][n-1];
    }
}
