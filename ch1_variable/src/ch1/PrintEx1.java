package ch1;

public class PrintEx1 {
    public static void main(String[] args) {
     //화면 출력
     int var1 = 35, var2 = 25;
     boolean flag = true ;
     System.out.println(var1 + ", " + var2 + ", " + flag); 
     System.out.printf("var1=%d, var2=%d, flag=%b\n", var1, var2, flag);  
     // printf 지시자
     // %d : 10진 정수 형태로 출력
     // %b : boolean 형태로 출력
     // %c : char 형태로 출력
     // %s : 문자열(String) 형태로 출력
     // %f : 부동소수점(float, double) 형태로 출력
    System.out.println("Hello");
     // 숫자: 숫자 형태로 출력할 때 표시되는 총 자릿수
    System.out.printf("var1=%5d, var2=%05d, flag=%b\n", var1, var2, flag);  // 첫번째는 공란 그대로 남겨서 다섯자리 숫자 표시, 두 번째는 공란을 0으로 채움

    float f1 = 3.141592f ;
    double d1 = 31.41592d ;
    System.out.printf("f1=%.5f\n", f1); // 소수점 5자리 까지 출력
    System.out.printf("d1=%5.3f\n", d1); // 다섯 자리만 줄이되 그 중 셋은 소수점으로 제한
    }
    
}
