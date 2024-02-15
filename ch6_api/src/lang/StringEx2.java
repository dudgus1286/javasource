package lang;

import java.util.Date;
import javax.xml.crypto.Data;

public class StringEx2 {

  public static void main(String[] args) {
    //생성자
    String str1 = new String("Hello");
    char[] chars = { 'H', 'e', 'l', 'l', 'o' };
    String str2 = new String(chars);

    String str3 = "Hello";

    // 메소드
    // return type => 변수에 담기, sout 안에 넣기
    char ch = str1.charAt(0);

    // charAt() : 인덱스 위치 문자 반환
    System.out.println("charAt(0) : " + ch);
    System.out.println("charAt(3) : " + str2.charAt(3));

    //concat() : 문자열 연결
    String result = str1.concat("World");
    System.out.println("concat() " + result);

    // compareTo() : 0, -1, 1 숫자로 리턴
    // 문자열과 사전 순서로 비교
    // 같으면 0, 사전 순으로 이전이면 음수, 이후면 양수
    // a : 97 , b : 98 => "b".compareTo("a") = 98-97 = 1
    System.out.println("compareTo() " + str1.compareTo(str3));
    System.out.println("compareTo() " + "aaa".compareTo("bbb"));
    System.out.println("compareTo() " + "bbb".compareTo("aaa"));
    System.out.println("compareTo() " + "bbb".compareTo("baa"));

    //contains() : 지정된 문자가 포함되었는지 검사 boolean으로 리턴
    System.out.println("contains() " + str1.contains("e"));

    //endswith() : 지정된 문자열로 끝나는지 검사 boolean으로 리턴
    System.out.println("endsWith() " + "Hello.txt".endsWith("txt")); // 확장자로 찾을때 많이 씀
    //endswith() : 지정된 문자열로 시작하는지 검사 boolean으로 리턴
    System.out.println("startsWith() " + str3.startsWith("H"));

    // equals() , equalsIgnoreCase() - 대소문자 상관하지 말고 비교
    // Hello == HELLO => false (문자 대소문자 구별 함)
    System.out.println("equalsIgnoreCase() " + str1.equalsIgnoreCase("HELLO"));
    System.out.println("equals() " + str1.equals("HELLO"));

    // indexOf() : 주어진 문자가 문자열에 존재하는지 확인하여 위치를 숫자로 반환
    // 찾는 게 없으면 -1
    System.out.println("indexOf() " + str1.indexOf("s"));
    System.out.println("indexOf() " + str1.indexOf('s'));
    System.out.println("indexOf() " + str1.indexOf('e'));
    // 2번을 시작위치로 지정 (2번째 문자(첫번째 'l')이후에 오는 e가 없기 때문에 음수)
    System.out.println("indexOf() " + str1.indexOf('e', 2));

    // lastIndexOf() : 지정된 문자를 문자열의 오른쪽 끝에서부터 찾아서 위치를 숫자로 반환
    String str4 = "java.lang.String";
    System.out.println("lastIndexOf " + str4.lastIndexOf(".")); // 9
    System.out.println("indexOf " + str4.indexOf(".")); // 4

    // length() : 문자열 길이 반환

    // replace() : 문자를 새로운 문자로 바꿔서 문자열의 형태로 반환
    String replaceStr = str1.replace('H', 'h');
    System.out.println("replace() " + replaceStr);
    // str2.replace('H', 'h'); - String은 불변이기 때문에 이렇게만 쓰면 원본 안 바뀜
    str2 = str2.replace("ll", "LL");
    System.out.println(str2); // Hello
    str4 = "Hellollo";
    System.out.println("replace() " + str4.replace("ll", "LL"));
    System.out.println("replaceAll() " + str4.replaceAll("ll", "LL"));
    System.out.println("replaceFirst() " + str4.replaceFirst("ll", "LL"));

    // split() : 문자열 분리한 후 배열로 리턴 (기준 설정 가능)
    String[] strArr = str1.split("");
    for (String string : strArr) {
      System.out.println(string); // "H", "e", "l", "l" "o"
    }
    str4 = "dog,cat,bear";
    strArr = str4.split(",");
    for (String string : strArr) {
      System.out.println(string); // "dog", "cat", "bear"
    }
    // 문자열 전체를 지정된 숫자로 자른다
    strArr = str4.split(",", 2);
    for (String string : strArr) {
      System.out.println(string); // "dog", "cat,bear"
    }

    // substring() : 시작위치부터 끝 위치에 포함된 문자열 추출
    // 끝 위치는 포함하지 않음
    System.out.println("substring() " + str1.substring(1)); // ello
    System.out.println("substring() " + str1.substring(1, 4)); // ell

    // toLowerCase() : 모든 문자를 소문자로 반환
    // toUpperCase() : 모든 문자를 대문자로 반환
    System.out.println("toLowerCase()" + str1.toLowerCase());
    System.out.println("toUpperCase()" + str1.toUpperCase());

    // toString()
    System.out.println(str1);

    // 공백 하나 = 문자 하나
    // trim() : 앞, 뒤 공백 제거
    // "Hello" == "Hello "
    str4 = "             Hello      World                  ";
    System.out.println("trim() 전 " + str4);
    System.out.println("trim() 후 " + str4.trim());

    // value() : 지정된 값을 문자열로 변환하여 반환
    // int num=Integer.parseInt("100"); 와 반대(문자열을 숫자로)
    String num1 = String.valueOf(100); // int => String
    System.out.println(num1);
    num1 = String.valueOf(1.3); // double => String
    System.out.println(num1);
    num1 = String.valueOf(1.3f);
    System.out.println(num1);
    num1 = String.valueOf(1000l);
    System.out.println(num1);
    num1 = String.valueOf('c');
    System.out.println(num1);
    Date d = new Date();
    num1 = String.valueOf(d);
    System.out.println(num1);

    int i = 100;
    String type = String.valueOf(i); // "100"
    type = i + "";

    // String.valueOf(10) <=> Integer.parseInt("10") or Integer.valueOf("10")
    // String.valueOf(10.3) <=> Integer.parseDouble("10.3") or Double.valueOf("10.3")
    // "10.3f" = 10.3f

    double d1 = Double.parseDouble("10.3");
    float f = Float.parseFloat("10.3f");
    Long l = Long.parseLong("10l");
  }
}
