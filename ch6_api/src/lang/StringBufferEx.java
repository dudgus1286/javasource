package lang;

// java.lang.StringBuffer : mutable(변경 가능한) 클래스, thread-safe
// java.lang.StringBuilder : mutable(변경 가능한) 클래스
public class StringBufferEx {

  public static void main(String[] args) {
    StringBuffer sb1 = new StringBuffer("Hello");
    StringBuffer sb2 = new StringBuffer("Hello");

    // equals(), toString() 오버라이딩 여부
    System.out.println(sb1.equals(sb2) ? "같음" : "다름"); // "다름" - 값 비교로 안 바뀜
    System.out.println(sb1); // "Hello" - 값 표시로 오버라이딩됨
    // 값 비교하기 위해 String으로 변환해서 equals() 사용
    // 생성자로 변환
    String str1 = new String(sb1);
    String str2 = new String(sb2);
    // 메소드로 변환
    str1 = sb1.toString();
    str2 = sb2.toString();
  }
}
