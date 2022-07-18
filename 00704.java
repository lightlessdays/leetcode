/*
BINARY SEARCH ALGORITHM

LINK TO QUESTION : https://leetcode.com/problems/binary-search/
*/

class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int middle=start-(start-end)/2;
            if(nums[middle]>target)
                end=middle-1;
            else if(nums[middle]<target)
                start=middle+1;
            else
                return middle;
        }
        return -1;
    }
}
