import java.util.*;

/*
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Notice that the solution set must not contain duplicate triplets.
 */
public class ThreeSum {
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
            for(int j =i+1; j<result.size();j++){
                if(result.get(i).containsAll(result.get(j))){
                    oneMore = true;
                    break;
                }
            }
            if(!oneMore){
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
//                  if(!result.retainAll(List.of(-target, nums[i], target - nums[i]))){
//                    // result.add(List.of(-target, nums[i], target - nums[i]));
//                 }else{

//                  }

                result.add(List.of(-target, nums[i], target - nums[i]));
            }
        }

        return result;

    }
}
