class Solution {
    public int singleNumber(int[] nums) {
        Map map = new HashMap<Integer,Integer>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,2);
            }else{
                map.put(num,1);
            }
        }
        for(int num:nums){
            if((int)map.get(num)==1){
                return num;
            }
        }
        return 0;
    }
}
