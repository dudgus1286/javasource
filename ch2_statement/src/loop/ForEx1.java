package loop;

/* 제어문 -1) 조건문    2) 반복문
 * 1) 조건문: 조건에 따라 다음 문장 수행 여부를 결정
 *      if, switch
 * 2) 반복문: 어떤 작업이 반복적으로 수행되도록 할 때 사용
 *      for, while, do-while
 */
public class ForEx1 {

  public static void main(String[] args) {
    // for (int i = 0; i < args.length; i++) {
    //   int i = 0; : 값을 초기화 (제일 처음에만 실행)
    //   i < args.length; : 조건식 (조건식이 참일 때까지만 반복)
    //   i++ (i=i+1) : 증감식 (반복문을 제어하는 변수의 값을 증가 혹은 감소)
    // }

    // I can do it. 을 다섯 번 출력
    for (int i = 0; i < 5; i++) {
      System.out.println("I can do it.");
    }
    // 1) int i = 0 ; 이 실행
    // 2) i < 5 ; 실행
    // 3) 반복문 안으로 진입해서 sout 구문이 실행
    // 4) i++ 이 실행되서 i = 1 로 변경
    // 5) 다시 2)의 조건 검사: i < 5 ; 실행
    // 6) 다시 3)의 반복문으로 진입
    // .......
    // 7) i++ 이 실행되서 i = 5 가 됨
    // 8) i < 5 조건이 false 가 되면서 반복문 종료

    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }
    // for () {} 의 괄호 안에 쓰인 변수는 괄호와 블럭에서만 쓸수 있음
  }
}
