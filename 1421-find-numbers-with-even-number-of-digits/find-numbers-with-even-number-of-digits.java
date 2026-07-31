class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for (int temp : nums){
            
            int count=0;
            while(temp>0){
                temp=temp/10;
                count++;
            }
            if(count%2==0){
                ans++;
            }
        }
        return ans;
    }
}
