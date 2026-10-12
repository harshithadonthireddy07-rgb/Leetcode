class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums1){
            map.put(num,1);
        }
        int min=Integer.MAX_VALUE;
        for(int num : nums2){
            if(map.containsKey(num)){
                if(num < min ){
                    min=num;
                }
            }
        }



        if(min==Integer.MAX_VALUE){
            return -1;
        }
    return min;
    }
}