package ch1;

public class VarByteEx1 {
    public static void main(String[] args) {
        // 데이터 타입(자료형),
        // 변수명(소문자로 시작/
        // (권고)두 개 이상의 단어가 합해진 변수명은 두 번째 단어 시작은 대문자로)
        // 1. 정수형 - byte(1byte), short(2byte), int(4byte), long(8byte)
        byte age = 10 , maxSpeed = 10 ;
        short age1 = 10 , maxSpeed1 = 10 ;
        int age2 = 15 , maxSpeed2 = 20 ;
        // long 타입은 값 뒤에 L(또는 소문자l) 붙이기
        long age3 = 123456789L , maxSpeed3 = 1000000000000L ;

        System.out.println(age + maxSpeed); // 20
        System.out.println(age + " , " + maxSpeed); // 10 , 10
        
        System.out.println("나이는 : " + age1 + ", 최고속도 : " + maxSpeed1 );
        System.out.println("나이는 : " + age2 + ", 최고속도 : " + maxSpeed2 );
        System.out.println("나이는 : " + age3 + ", 최고속도 : " + maxSpeed3 );

        age = 33 ;
        age = 127 ;
    }
    
}
