import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        int longest=1;
        int count=1;
        Arrays.sort(nums);
        for (int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]==nums[i-1]+1){
                count+=1;

            }
            else{
                count=1;
            }
            if(count>longest){
                longest=count;
            }
        }
        return longest;
    }
}