class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        int sublength=nums.length/2;
        long sum=0;
        for(int i=0;i<sublength;i++ ){
            
                sum-=nums[i];
            }
        for(int i=sublength;i<nums.length;i++ ){
            
                sum+=nums[i];
            }
        
    return sum;    
    }   
}