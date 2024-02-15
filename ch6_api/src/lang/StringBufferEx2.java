package lang;

public class StringBufferEx2 {

  public static void main(String[] args) {
    StringBuffer sb1 = new StringBuffer("Hello");
    // StringBuffer sb2 = "Hello" ; - 간략하게 선언 불가

    // append() : 원본 문자열 뒤에 추가
    System.out.println("append() " + sb1.append(" World"));
    // String str1 = "Hello"; str1 += "123"; str += 456;
    sb1.append("123").append(456).append(12.3f);
    System.out.println(sb1); // 원본이 변경됨

    // charAt()
    System.out.println(sb1.charAt(3));

    // delete() : 끝 위치의 문자는 제외 : 6의 직전까지
    sb1.delete(3, 6);
    System.out.println(sb1);

    sb1.deleteCharAt(5);
    System.out.println(sb1);

    // insert() : 시작위치에 지정된 데이터 삽입
    sb1.insert(4, " 012345 ");
    System.out.println(sb1);

    // length()

    // replace() : 바꿀 문자열 위치 지정 후 지정된 문자열로 바꿈
    sb1.replace(0, 3, "AB");
    System.out.println(sb1);

    String str2 = "0123456789";
    // 9876543210 출력
    for (int i = str2.length() - 1; i > -1; i--) {
      System.out.print(str2.charAt(i));
    }

    System.out.println();

    StringBuffer sb3 = new StringBuffer("0123456789");
    System.out.println(sb3.reverse());
    // String => StringBuffer : 생성자로 교체
    StringBuffer sb4 = new StringBuffer(str2);
    System.out.println(sb4.reverse());

    sb1.setCharAt(1, 'K');
    System.out.println(sb1);

    StringBuilder sBuilder1 = new StringBuilder("Hello");
  }
}
