package loop;

public class BreakEx2 {

  public static void main(String[] args) {
    // break; 구문 => switch
    int i = 0;
    while (true) {
      // 주사위 값 6일때 반복문 종료
      i = (int) (Math.random() * 6) + 1;
      System.out.println(i);
      if (i == 6) break;
    }
    System.out.println("종료");
  }
}
