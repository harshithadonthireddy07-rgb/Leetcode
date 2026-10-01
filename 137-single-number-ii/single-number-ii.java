class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        for(int num:nums){
           if(hm.get(num)==1){
            ans= num;
           }
        }

     return ans;   
    }
}