package leetCode.有效的字母异位词;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean anagram = solution.isAnagram("aacc", "ccac");
        System.out.println(anagram);
    }
}
