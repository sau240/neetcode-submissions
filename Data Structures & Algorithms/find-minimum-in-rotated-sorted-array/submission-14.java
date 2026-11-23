class Solution {
    public int findMin(int[] nums) {
        
        ArrayList<Integer> result = new ArrayList<>();

        if(nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array must not be Empty.....");
        }
        int min = nums[0];

        for(int i = 0; i < nums.length; i ++) {
            if(nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
}
