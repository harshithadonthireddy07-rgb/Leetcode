class Solution {
    public boolean check(int[] nums) {
        int[] a= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            a[i]=nums[i];
        }
        Arrays.sort(a);
        for (int start = 0; start < nums.length; start++) {
    boolean matches = true;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != a[(start + i) % nums.length]) {
            matches = false;
            break;
        }
    }

    if (matches) return true;
}
return false;
        
    }
}