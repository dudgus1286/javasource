package thread;

// Thread(쓰레드)
// 프로세스 : 실행 중인 프로그램(OS로부터 실행에 필요한 자원(메모리)를 할당받아 실행)
// 프로세스 : 프로그램을 수행하는 데 필요한 데이터 + 자원 + 쓰레드
// 모든 프로세스는 최소한 하나 이상의 쓰레드가 존재
// => 둘 이상의 쓰레드를 가진 프로세스는 멀티쓰레드 프로세스

// 멀티 쓰레드 구현 방법
// 1) Runnable을 구현하는 클래스 작성
//      - 쓰레드로 실행할 코드 작성해서 run() 오버라이딩
// 2) Thread를 상속받는 클래스 작성
//

public class BigLetters3 {

  public static void main(String[] args) {
    // 익명구현 : 1회성
    Runnable r = new Runnable() {
      @Override
      public void run() {
        for (int i = 1; i <= 100; i++) {
          System.out.print(i + " ");
        }
      }
    };

    // 서브 쓰레드
    Thread t = new Thread(r);
    t.start();

    Thread t2 = new SmallLetters2();
    t2.start();

    //메인 쓰레드
    for (char ch = 'A'; ch <= 'Z'; ch++) {
      System.out.print(ch + " ");
    }
  }
}
