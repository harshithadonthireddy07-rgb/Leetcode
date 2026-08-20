class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num : nums){
            
                map.put(num,map.getOrDefault(num,0)+1);
            
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            int max=-1;
           int ele=-1;
            for(int key : map.keySet()){
                if(map.get(key) > max){
                    max=map.get(key);
                    ele=key;
                }
            }
            map.put(ele,-1);
            ans[i]=ele;

        }

    return ans;    
    }
}