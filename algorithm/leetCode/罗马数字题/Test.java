package leetCode.罗马数字题;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int num = solution.romanToInt(s);
        System.out.println("罗马数字"+s+"为数字: "+num);
    }
}
