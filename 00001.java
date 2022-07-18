/*
LOGIC: Iterate through each number in the array to find the sum.

LINK: https://leetcode.com/problems/two-sum/
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
         int[] answer=new int[2];
        int flagi=0;
        int flagj=0;
        
        boolean targetFound=false;
        for(int i:nums){
            flagj=0;
            for(int j:nums){
                if(flagi!=flagj && i+j==target){
                    targetFound=true;
                    break;
                }
                if(targetFound==false)
                    flagj++;
            }
            if(targetFound)
                break;
            else
                flagi++;
        }
        answer[0]=flagi;
        answer[1]=flagj;
        return answer;
    }
}
