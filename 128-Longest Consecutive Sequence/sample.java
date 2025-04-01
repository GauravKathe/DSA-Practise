class Solution {
    public int longestConsecutive(int[] nums) {
        //better solution but not optimal
        Arrays.sort(nums);
        int large=0;
        int counter=0;
        int lastsmall=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]-1 == lastsmall){
                counter=counter+1;
                lastsmall=nums[i];
            }
            else if(nums[i]!=lastsmall){
                counter=1;
                lastsmall=nums[i];
            }
            large=Math.max(large,counter);
        }
        return large;


    }
}