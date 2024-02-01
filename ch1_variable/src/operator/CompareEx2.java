package operator;

public class CompareEx2 {

  public static void main(String[] args) {
    // 비교 연산자 결과는 true 또는 false 로 나옴
    // 문자와 문자열은 다르다
    // ''       ""
    // 'A'      "A"
    //기본 타입 객체 타입(객체 타입은 대문자로 시작)
    String str1 = "홍길동";
    String str2 = "홍길동";
    String str3 = new String("홍길동");
    System.out.println(str1 == str2); // true
    System.out.println(str1 == str3); // false
    // 문자열 비교는 equals 사용
    System.out.println(str1.equals(str3)); // true
  }
}
