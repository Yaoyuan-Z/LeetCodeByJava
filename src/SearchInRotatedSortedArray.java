class Solution {    
  public int search(int[] nums, int target) {
      int n = nums.length;
      if(n==0){
          return -1;
      }
      int left = 0;
      int right = n-1;
      int mid = (left+right)/2;
      
      while(left<=right){

          if(nums[mid] == target){
              return mid;
          }else if(nums[left] == target){
              return left;
          }else if(nums[right] == target){
              return right;
          }else{
              if(nums[mid]>nums[left]){
                  if(nums[mid]>target&&nums[left]<target){
                      right = mid -1;
                  }else{
                      left = mid +1;
                  }
                  mid = (right+left)/2;
              }else{
                  if(nums[mid]<target&&nums[right]>target){
                      left = mid +1;
                  }else{
                      right = mid -1;
                  }
                  mid = (right+left)/2;
              }
          }

          
      }

      return -1;
      
    }
}
