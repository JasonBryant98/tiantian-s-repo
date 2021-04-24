package leetCode.最长公共前缀;

public class Test {
    public static void main(String[] args) {
       Solution solution = new Solution();
       String[] str = {"flower","alow","vlight"};
        String s = solution.longestCommonPrefix(str);
        System.out.println(s);
    }
}
