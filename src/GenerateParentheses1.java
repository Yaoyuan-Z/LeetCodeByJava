class Solution {
    public int majorityElement(int[] nums) {
        Map map= new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,(int)map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        
        for(int num : nums){
            if((int)map.get(num) > nums.length/2){
                return num;
            }
        }
        return -1;
    }
}
