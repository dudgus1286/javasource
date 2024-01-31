package ch1;

public class SpecialChar {
    public static void main(String[] args) {
        // 탭 == \t, 엔터 == \n
        System.out.println("성명    주소    전화번호");
        System.out.println("성명\t주소\t전화번호");
        System.out.println("\"Hello\""); // "Hello" 출력
        System.out.println("\'Hello\'"); // 'Hello' 출력
        // System.out.println("'Hello'"); // 큰따옴표 안에 작은 따옴표가 있어서 일단은 'Hello' 출력 됨
        System.out.println("재미있는\\자바");
        System.out.println("\n");
        System.out.println("escape 문자");
        System.out.print("test\n");
        System.out.print("test");

        // 화면 출력
        // System.out.print();
        // System.out.println();
        // System.out.printf();
    }
    
}
