class Solution {
    public void sortColors(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(0,0);
        map.put(1,0);
        map.put(2,0);
        
        int i = 0;
        for(i = 0; i< nums.length;i++){
            map.put(nums[i],map.get(nums[i])+1);
        }
        
        i = 0;
        while(i<nums.length){
            if(i<map.get(0)){
                nums[i]=0;
            }else if(i< map.get(0)+map.get(1)){
                nums[i]=1;
            }else{
                nums[i]=2;
            }
            i++;
        }

    }
}
