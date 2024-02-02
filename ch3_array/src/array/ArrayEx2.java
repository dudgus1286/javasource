package array;

public class ArrayEx2 {

  public static void main(String[] args) {
    int score[] = new int[5]; // 길이가 5인 int 배열(인덱스 0)

    // 배열의 초기값 변경
    score[0] = 98;
    score[1] = 88;
    score[2] = 78;
    score[3] = 68;
    score[4] = 58;

    // 배열값 확인
    // System.out.println(score[0]);
    // System.out.println(score[1]);
    // System.out.println(score[2]);
    // System.out.println(score[3]);
    // System.out.println(score[4]);
    // System.out.println(score[5]);
    System.out.println(score.length); // 배열의 길이 알아내는 메소드

    for (int i = 0; i < score.length; i++) {
      System.out.println(score[i]);
    }

    System.out.println("");

    // (데이터타입 값을담을변수 : 배열명)       ====        중요
    for (int i : score) {
      System.out.println(i);
    }
  }
}
