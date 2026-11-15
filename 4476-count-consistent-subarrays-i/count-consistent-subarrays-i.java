class Solution {
    public int countConsistent(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int ans=nums[i];
            int min=nums[i];
            for(int j=i;j<nums.length;j++){
                ans&=nums[j];
                min=Math.min(min,nums[j]);
if(ans==min){
                count++;
            }
            }
            
        }
        return count;
    }
}