import com.leetcode.Solution959;

public class LeetCodeMain {
    public static void main(String[] args) {
        int count = leetCode959();
        System.out.println(count);
    }

    static int leetCode959() {
        Solution959 s = new  Solution959();
        String[] str = new String[2];
        str[0] = " /";
        str[1] = "/ ";
        return s.regionsBySlashes(str);
    }
}
