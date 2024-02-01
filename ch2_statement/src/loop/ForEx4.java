package loop;

public class ForEx4 {

  public static void main(String[] args) {
    // 5행 10열으로 별 출력
    for (int i = 1; i < 6; i++) {
      for (int j = 1; j < 11; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    /*
     * 1) int i = 1 ; 실행
     * 2) i < 6 ; 실행
     * 3) int j = 1 ; 실행
     * 4) j < 11 ; 실행
     * 5) System.out.print("*") 실행
     * 6) j++ 실행, j = 2
     * ...
     * 7) j = 11 이 되면서 안쪽 for문 종료
     * 8) System.out.println(); 실행
     * 9) 바깥쪽 for 문의 i++ 실행, i = 2
     * 10) i < 6 이기 때문에 안쪽 for 문 다시 10회 수행
     * ...
     * 이후 바깥쪽 for 문이 참일 때까지 반복
     */
  }
}
