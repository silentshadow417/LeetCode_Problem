class Solution {
    public int missingNumber(int[] nums) {
       int n = nums.length;
       int Sum = (n * (n + 1))/ 2;
       int sum = 0;
       for(int i = 0; i<n; i++) {
        sum = sum + nums[i];
       }
    int missing = Sum - sum;
    return missing;
    }
}