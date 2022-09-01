//TC : O(N)
//SC : O(1)

class Solution {
    public int longestOnes(int[] nums, int k) {
        int low = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 0) k--;
            if(k < 0){
                if(nums[low] == 0)  k++;
                
                low++;
            }
        }
        return nums.length - low;
    }
}
