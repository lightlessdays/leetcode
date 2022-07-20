//LINK: https://leetcode.com/problems/peak-index-in-a-mountain-array/
//MADE SOME ALTERATIONS IN THE BINARY SEARCH ALGORITHM

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length;
        while (start!=end){
            int middle=start+(end-start)/2;
            if(arr[middle]<arr[middle+1]) start=middle+1;
            else end=middle;
        }
        return end;
    }
}
