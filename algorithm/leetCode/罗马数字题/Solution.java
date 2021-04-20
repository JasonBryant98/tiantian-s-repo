package leetCode.罗马数字题;

public class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int preNum = getInt(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int afterNum = getInt(s.charAt(i));
            if(preNum < afterNum) {
                sum = sum - preNum;
            } else {
                sum = sum + preNum;
            }
            preNum = afterNum;
        }
        sum += preNum;
        return sum;

    }

    public int getInt(char ch){
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
