//QUESTION: https://leetcode.com/problems/roman-to-integer/
//LOGIC: REPLACE IV, IX, XL, ETC. WITH ONE SUSBTITUTE LETTER.
//ASSIGN EACH SUBSTITUTE LETTER A NUMBER.
//ADD ALL THE NUMBERS TOGETHER.

class Solution {
    public int romanToInt(String s) {
        String roman="IVXLCDMQWERTY";
        int returnNumber=0;
        int[] numbers={1,5,10,50,100,500,1000,4,9,40,90,400,900};
        s=s.replace("IV", "Q");
        s=s.replace("IX", "W");
        s=s.replace("XL", "E");
        s=s.replace("XC", "R");
        s=s.replace("CD", "T");
        s=s.replace("CM", "Y");
        for (int i = 0; i < s.length(); i++) {
            returnNumber+=numbers[roman.indexOf(Character.toString(s.charAt(i)))];
        }
        return returnNumber;
    }
}
