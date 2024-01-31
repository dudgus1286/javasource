package ch1;

// 자동 형(타입)변환
// 정수형 / 문자형 / 실수형 / 논리형
// 타입 변환이 가능한 경우 : 작은 타입 => 큰 타입
// 연산 시에도 타입변환이 일어남 : 작은 타입 => 큰 타입
public class PromotionEx1 {
    public static void main(String[] args) {
        // int 보다 작은 값을 int로 변환
        byte v1 = 10 ;
        int intValue = v1 ; // 1byte -> 4byte
        System.out.println("inValue = " + intValue);

        short s1 = 15 ;
        intValue = s1 ;
        System.out.println("inValue = " + intValue);

        char ch1 = 'a';
        intValue = ch1 ; // 소문자 코드 
        System.out.println("inValue = " + intValue);

        // float type 이 int 보다 더 정밀한 수를 표현
        // int(4byte, 정수) -> float(4byte, 실수)
        float floatValue = intValue ;
        System.out.println("floatValue = " + floatValue );

        // int를 long(8byte)으로
        long longValue = intValue;
        System.out.println("longValue = " + longValue );
        
        // 소수점이 자동으로 붙음
        double doubleValue = intValue;
        System.out.println("doubleValue = " + doubleValue );

        // int + double
        intValue = 55 ;
        doubleValue = 98.25d ;
        
        // int result = intValue + doubleValue ;
        double result = intValue + doubleValue ;
        System.out.println("int + double = double 타입으로 변환됨");
        System.out.println(result);

        byte v2 = 15;
        //byte byteValue = v1 + v2; => 정수를 변수에 담는다면 int 사용
        int byteValue = v1 + v2;
    }
    
}
