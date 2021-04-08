class Solution {
    public boolean canJump(int[] nums) {
        int lastPosition = nums.length -1;
        for(int i = nums.length-1; i>=0; i--){
            if(i+nums[i] >= lastPosition){
                lastPosition = i;
            }
        }
        return lastPosition ==0;
    }
    }

// solution 2
class Solution {
    public boolean canJump(int[] nums) {
        int start = 0;
        int end = nums[0];
        while (end < nums.length-1){
            int max = end;
            for(int i = start;i<=end; i++){
                max = Math.max(max,i+nums[i]);
            }
            if(start >= end){
                return false;
            }
            start = end;
            end = max;
        }
        return true;
    }
    
}
