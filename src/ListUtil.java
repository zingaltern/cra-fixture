import java.util.List;

/** 演示工具类。 */
public class ListUtil {

  /** 返回列表最后一个元素。 */
  public static int last(List<Integer> items) {
    return items.get(items.size() - 1);
  }

  public static void main(String[] args) {
    System.out.println(last(List.of(1, 2, 3)));
  }
}
