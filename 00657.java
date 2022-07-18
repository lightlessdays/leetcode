/***
LOGIC: we have an integer array with x position and y position. We will then iterate through each charachter in the string moves. 
If the charachter is U, we will add a position to the Y axis. If it is D, we will subtract a number from Y axis and so on... 
In the end, we will check if both X and Y are 0. If they are indeed 0, we will return true, else we will return false.

Link: https://leetcode.com/problems/robot-return-to-origin/
***/

class Solution {
    public boolean judgeCircle(String moves) {
        int[] position={0,0};
        char[] moveChar=moves.toCharArray();
        for (char i : moveChar) {
            if(i=='U')
                position[1]=position[1]+1;
            else if(i=='D')
                position[1]=position[1]-1;
            else if(i=='L')
                position[0]=position[0]-1;
            else if(i=='R')
                position[0]=position[0]+1;
        }
        if(position[0]==0 && position[1]==0)
            return true;
        return false;
    }
}
