/*
LOGIC: SORT THE ARRAY AND THEN CHECK IF CONSECUTIVE ELEMENTS ARE EQUAL. IF CONSECUTIVE ELEMENTS ARE EQUAL, RETURN TRUE, ELSE RETURN FALSE.

LINK: https://leetcode.com/problems/contains-duplicate/
*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
