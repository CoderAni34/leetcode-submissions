class Solution {
    public int removeDuplicates(int[] nums) {
        int read = 1,write=0;
        while(read<nums.length){
            if(nums[read] != nums[write]){
                write++;
                nums[write]=nums[read];
                read++;
            }
            else if(nums[read] == nums[write]){
                read++;
                
            }
        }
        return write+1;
    }
}