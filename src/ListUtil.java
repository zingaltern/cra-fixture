import java.util.List;

/** 演示工具类（cra 评审靶场）。 */
public class ListUtil {

  /** 返回列表最后一个元素。 */
  public static int last(List<Integer> items) {
    return items.get(items.size() - 1);
  }

  public static void main(String[] args) {
    // 漂移用例 A：锚行上方插入 10 行注释（锚行内容不变，预期指纹/滑窗抑制——M1 验收 1）
    // drift line 2
    // drift line 3
    // drift line 4
    // drift line 5
    // drift line 6
    // drift line 7
    // drift line 8
    // drift line 9
    // drift line 10
    System.out.println(last(List.of(1, 2, 3, 4)));
    System.out.println(last(List.of()));
  }
}
