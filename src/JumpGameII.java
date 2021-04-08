class Solution {
    public int jump(int[] nums) {
        int time =0;
        int start = 0;
        int end = 0;
        while (end < nums.length-1){
            time ++;
            int max = end+1;
            for(int i = start;i<=end; i++){
                max = Math.max(max,i+nums[i]);
            }
            start = end+1;
            end = max;
        }
        return time;
    }
}
