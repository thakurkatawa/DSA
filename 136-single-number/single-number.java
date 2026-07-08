class Solution {
    public int singleNumber(int[] nums) {
        int repeat=0;
        for(int i=0;i<nums.length;i++){
            repeat^=nums[i];
        }
        return repeat;
    }
}