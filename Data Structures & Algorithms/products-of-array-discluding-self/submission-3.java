class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] forward = new int[n];
        int[] backward = new int[n];
        int[] output = new int[n];
        forward[0] = 1;
        backward[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            forward[i] = forward[i-1] * nums[i-1];
        }
        for (int i = n - 2; i >= 0; i--) {
            backward[i] = backward[i+1] * nums[i+1];
        }
        for (int i = 0; i < n; i++) {
            output[i] = forward[i] * backward[i];
        }
        return output;
    }
}  
