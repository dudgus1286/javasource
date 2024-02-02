package loop;

public class BreakEx1 {

  public static void main(String[] args) {
    // break; 구문 => switch
    int sum = 0, i = 0;
    while (true) {
      if (sum > 100) break;
      ++i;
      sum += i;
    }
    System.out.printf("i=%d, sum=%d", i, sum);
  }
}
