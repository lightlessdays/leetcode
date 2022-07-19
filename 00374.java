/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 
 LINK: https://leetcode.com/problems/guess-number-higher-or-lower/
 LOGIC: BINARY SEARCH ALGORITHM
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start=1;
        int end=n;
        while(start<=end){
            int middle=(start)-(start-end)/2;
            int guessNumber=guess(middle);
            if(guessNumber==1)
                start=middle+1;
            else if(guessNumber==-1)
                end=middle-1;
            else
                return middle;
        }
        return -1;
    }
}
