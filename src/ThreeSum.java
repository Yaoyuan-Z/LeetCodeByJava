import java.util.*;

/*
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Notice that the solution set must not contain duplicate triplets.
 */
class Solution1 {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        if (nums.length < 3 || nums[0] > 0 || nums[nums.length - 1] < 0) {
            return new ArrayList();
        }

        List<List<Integer>> result = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if(i>0&&nums[i]==nums[i-1]){

            }else{
                result.addAll(twoSum(Arrays.copyOfRange(nums, i + 1, nums.length), -nums[i]));
            }

        }
        List<List<Integer>> result_1 = new ArrayList();
        for (int i =0; i< result.size(); i++){
            boolean oneMore = false;
            int count =1;
            for(int j =i+1; j<result.size();j++){
                List list1 = result.get(i);
                List list2 = result.get(j);
                if(list1.containsAll(list2)&&list2.containsAll(list1)){
                    count++;
                    break;
                }
            }
            if(count==1){
                result_1.add(result.get(i));
            }
        }
        return result_1;

    }

    public List<List<Integer>> twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        List<List<Integer>> result = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && i != map.get(target - nums[i])) {

                List<Integer> list =List.of(-target,nums[i],target-nums[i]); 
                result.add(list);
            }
        }

        return result;

    }
}

// two pointer

class Solution {
    public List<List<Integer>> threeSum(int[] nums){
        
         Arrays.sort(nums);
        if (nums.length < 3 || nums[0] > 0 || nums[nums.length - 1] < 0) {
            return new ArrayList();
        }

        List<List<Integer>> result = new ArrayList();
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] > 0) {
                break;
            }else if(i>0&& nums[i]==nums[i-1]){
            }else{
                int left = i+1;
                int right = nums.length-1;
                while (left < right){
                    
                    if(nums[i]+nums[right]+nums[left]==0){
                            result.add(List.of(nums[i],nums[left],nums [right]));
                        while(left<right && nums[left]==nums[left+1]){
                            left = left+1;
                        }
                        while(left<right && nums[right]== nums[right-1]){
                            right = right-1;
                        }
                        left = left+1;
                        right = right-1;
                    }else if(nums[left]+nums[i]+nums[right]>0){
                        right =right-1;
                    }else{
                        left = left+1;
                    }
                    
                }
            }
            
            
            
            
        }

                

        return result;
                   
        
    }
}

