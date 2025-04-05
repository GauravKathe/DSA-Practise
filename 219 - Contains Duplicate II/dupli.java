class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i>k){
                set.remove(nums[i-k-1]);
            }
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
        /* Brute Force but TLE
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] && Math.abs(i-j)<=k){
                    return true;
                }
            }
        }
        return false;
        */


    }
}