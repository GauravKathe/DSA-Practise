class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;  // Step 1: Find pivot index

        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                pivot = i - 1; // Store the index of the first decreasing element
                break;
            }
        }

        // Step 2: Find the next larger element to swap with pivot
        if (pivot != -1) {
            for (int i = nums.length - 1; i > pivot; i--) {
                if (nums[i] > nums[pivot]) {
                    // Swap pivot and next greater element
                    int temp = nums[i];
                    nums[i] = nums[pivot];
                    nums[pivot] = temp;
                    break;
                }
            }
        }

        // for i/p [3 2 1]
        int start = pivot + 1, end = nums.length - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
