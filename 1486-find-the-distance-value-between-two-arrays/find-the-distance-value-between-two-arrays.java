class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans=0;
        boolean far=true;
        for(int i=0;i<arr1.length;i++){
            far=true;
            int num=arr1[i];
            for(int j : arr2){
                if (Math.abs(num-j)<=d){
                    far=false;

                }
            }
            if(far){
                ans++;
            }
        }
     return ans;   
    }
}