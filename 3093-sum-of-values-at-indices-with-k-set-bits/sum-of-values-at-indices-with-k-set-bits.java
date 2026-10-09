class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;

        for(int i=0;i<nums.size();i++){
            int setbits=count(i);
            if(setbits==k){
                sum+=nums.get(i);

            }
        }
        return sum;
        
    }

    public int count(int n){
        int temp=n;
        int c=0;
        while(temp>0){
            c+=(temp&1);
            temp>>=1;
        }
        return c;
    }
}