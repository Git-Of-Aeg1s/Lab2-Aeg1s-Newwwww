

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L2022211880_7_Test {

    // 测试用例设计总体原则：等价类划分原则，边界值分析原则，错误预设原则

    // 测试方法：testSmallestStringWithSwapsGeneral
    // 测试目的：验证在一般情况下，是否能够正确交换字符得到字典序最小的字符串
    @Test
    public void testSmallestStringWithSwapsGeneral() {
        Solution7 solution = new Solution7();
        List<List<Integer>> pairs = Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2));
        String result = solution.smallestStringWithSwaps("dcab", pairs);
        Assert.assertEquals("测试失败：期望输出为 'bacd'，实际输出为 '" + result + "'", "bacd", result);
    }

    // 测试方法：testSmallestStringWithSwapsSingleSwap
    // 测试目的：验证当只有一个交换对时，是否能够正确处理

    @Test
    public void testSmallestStringWithSwapsNoSwaps() {
        Solution7 solution = new Solution7();
        List<List<Integer>> pairs = new ArrayList<>();
        String result = solution.smallestStringWithSwaps("abc", pairs);
        Assert.assertEquals("测试失败：期望输出为 'abc'，实际输出为 '" + result + "'", "abc", result);
    }

    // 测试方法：testSmallestStringWithSwapsAllSwaps
    // 测试目的：验证当所有字符都参与交换时，是否能够得到正确的最小字典序字符串
    @Test
    public void testSmallestStringWithSwapsAllSwaps() {
        Solution7 solution = new Solution7();
        List<List<Integer>> pairs = Arrays.asList(Arrays.asList(0, 1), Arrays.asList(1, 2), Arrays.asList(2, 3));
        String result = solution.smallestStringWithSwaps("dcba", pairs);
        Assert.assertEquals("测试失败：期望输出为 'abcd'，实际输出为 '" + result + "'", "abcd", result);
    }

    // 测试方法：testSmallestStringWithSwapsEmptyString
    // 测试目的：验证当输入字符串为空时，是否能够正确处理
    @Test
    public void testSmallestStringWithSwapsEmptyString() {
        Solution7 solution = new Solution7();
        List<List<Integer>> pairs = Arrays.asList(Arrays.asList(0, 1));
        String result = solution.smallestStringWithSwaps("", pairs);
        Assert.assertEquals("测试失败：期望输出为 ''，实际输出为 '" + result + "'", "", result);
    }

    // 其他测试方法...
    // 您可以根据需要添加更多的测试方法来验证不同的边界情况和异常情况
}
