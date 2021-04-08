class Solution {
    public int minPathSum(int[][] grid) {
        int[][] max = new int[grid.length][grid[0].length];
        max[0][0] = grid[0][0];
        int result =0;
        if(grid.length == 1){
            for(int j =0; j<grid[0].length; j++){
                result = result+ grid[0][j];
            }
            return result;
        }
        if(grid[0].length == 1){
            for(int i =0; i<grid.length;i++){
                result = result+ grid[i][0];
            }
            return result;
        }
        
        for(int i =1; i<grid.length;i++){
            
            max[i][0] = max[i-1][0] +grid[i][0];
            for(int j =1; j<grid[0].length; j++){
                max[0][j] = max[0][j-1]+grid[0][j];
                max[i][j] = Math.min(max[i-1][j],max[i][j-1])+grid[i][j];
            }
        }
        return max[grid.length-1][grid[0].length-1];
    }
}
