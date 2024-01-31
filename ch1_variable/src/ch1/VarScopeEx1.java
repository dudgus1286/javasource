package ch1;

// 변수의 유효범위
// local(지역) 변수 : {} 안에서만 유효함 / 초기화를 하고 사용함
// 변수 선언 => 값 할당(=초기화)
public class VarScopeEx1 {
    public static void main(String[] args) {
        int v2 ;
        v2 = 30 ;

        int v3;
        int v4; // 변수 선언만, 값 할당 X
        {
            int v1 = 15 ;
            v3 = v1 + v2;
            System.out.println("v1 = " + v1);
            System.out.println("v3 = " + v3);
        }
        // System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);
        // The local variable v4 may not have been initializedJava(536870963)
        // 로컬변수 v4가 초기화되지 않았음을 의미
        // System.out.println("v4 = " + v4);
    }
    // void print() {
    //     "main 메소드 안에 선언된 변수를 사용할 수 있는가?"
    //     System.out.println(v2);  - 쓸 수 없음
    // }
}
