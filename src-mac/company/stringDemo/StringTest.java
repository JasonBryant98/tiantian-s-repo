package company.stringDemo;

/*
键盘输入一个字符串，并且统计其中各字符出现的次数
种类有：大写字母、小写字母、数字、其他
 */

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String input = sc.next();
        System.out.println("输入的字符串：" + input);

        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;

        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] >= '0' && chars[i] <= '9'){
                countNumber++;
            } else if(chars[i] >= 'a' && chars[i] <= 'z' ){
                countLower++;
            } else if(chars[i] >= 'A' && chars[i] <= 'Z') {
                countUpper++;
            } else{
                countOther++;
            }

        }
        System.out.println("数字字符个数：" + countNumber);
        System.out.println("小写字符个数：" + countLower);
        System.out.println("大写字符个数：" + countUpper);
        System.out.println("其他字符个数：" + countOther);

    }


}
