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

// 멀티 쓰레드 단점
// 여러 개의 쓰레드가 번갈아가면서 작업을 처리하기 때문에 쓰레드간 작업 전환 시간이 소요되고
// 한 쓰레드가 수행하는 동안 다른 쓰레드는 대기하는 대기시간이 필요함

// 쓰레드 실행 제어
// 1) sleep(int 밀리세컨드단위) : 지정된 시간동안 쓰레드 일시 정지(자동적으로 실행 대기 상태)
// 2) suspend() : 일시정지, resume()으로 호출해야 실행 대기 상태가 됨
// 3) stop(), interrupt()

// synchronized(동기화)
// 한 쓰레드가 진행중인 작업을 다른 쓰레드가 간섭하지 못하도록 막는 것(일종의 점유)
// 메소드 동기화
// 동기화 블록
// 먼저 실행된 명령이 너무 오래 필요한 영역을 점유하면 영역을 공유하는 다른 명령들은 계속 대기해야 하는 상태가 발생함

public class BigLetters {

  public static void main(String[] args) {
    // 서브 쓰레드
    Thread t = new Thread(new SmallLetters());
    t.start(); // thread 실행한다의 의미, 쓰레드 대기하게 함

    //메인 쓰레드
    for (char ch = 'A'; ch <= 'Z'; ch++) {
      System.out.print(ch + " ");
    }
  }
}