///LINK: https://leetcode.com/problems/first-bad-version/

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=1;
        int end=n;
        int returnValue=start;
        while(start<=end){
            int middle=start-(start-end)/2;
            boolean bad=isBadVersion(middle);
            if(bad){
                returnValue=middle;
                end=middle-1;
            }
            else{
                start=middle+1;
            }
        }
        return returnValue;
    }
}
