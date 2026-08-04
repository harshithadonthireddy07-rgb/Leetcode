class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res=new int[nums.length];
        int k=nums.length-1;
        int left=0;
        int right=nums.length-1;
        while(right>=left){
            if(nums[left]*nums[left] > nums[right]*nums[right] ){

         res[k--]=nums[left]*nums[left];
         left++;

            }
            else{
                res[k--] = nums[right]*nums[right];
                right--;
            }
        }
        
    return res;    
    }
}