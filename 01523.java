//LINK: https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/

class Solution {
    public int countOdds(int low, int high) {
        int oddNumbers=0;
        if(low%2!=0)
            low--;
        if(high%2!=0)
            high++;
        int n=(high/2)-(low/2);
        return n;
    }
}
