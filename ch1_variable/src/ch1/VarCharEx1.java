package ch1;

public class VarCharEx1 {
    public static void main(String[] args) {
        // 2. 문자형 - char (2byte 사용)
        // 문자(한 글자, '' 사용 ) 와 문자열(한 글자 이상, "" 사용)
        // 문자는 코드값(ASCII, UTF-8)이 정의 되어 있음
        // A(문자) => 65(코드값)
        char name = 'J' ;
        char var1 = 65 ;
        char var2 = '\u0041' ;  // uft - 8
        char var3 = 44032 ;     // uft - 8
        // String name2 = "Ja" ;
        System.out.println("나의 이름은 " + name);
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var3 = " + var3);
    }
    
}
