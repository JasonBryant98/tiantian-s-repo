package stringDemo;

/*
分割字符串的方法：
public String[] split(String regax):按照参数的规则，将字符串切分成为若干部分

注意事项：
split方法的参数其实是一个正则表达式，今后学习
今天要注意：如果按照英文句点“.”进行切分，必须写“\\.”(两个反斜杠)
 */
public class StringDemo3 {

    public static void main(String[] args) {

        String str = "aaa,bbb,ccc";
        String[] array =str.split(",");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }
}
