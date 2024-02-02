package array;

public class ArrayEx1 {

  public static void main(String[] args) {
    //배열(array) : 같은 타입의 변수를 하나의 묶음으로 처리
    // int 타입 변수 5 개 필요할 배 배열로 처리
    // 타입[] 배열명 = new 타입[필요한 길이]
    // 배열 선언, 생성하면 초기화까지 일어남

    int[] arr1 = new int[5]; // 0 (byte, short,int, ling)
    float arr2[] = new float[10]; // 0.0 (float, double)
    boolean arr3[] = new boolean[2]; // false (boolean)
    char arr4[] = new char[2]; // ' '

    // int i ; 초기화하지 않으면 에러, 로컬 변수는 초기화해줘야 함

    System.out.println(arr1); // [I@7a81197d ==> 메모리 주소
    System.out.println(arr1[0]); // 배열 값 확인
    System.out.println(arr2[0]);
    System.out.println(arr3[0]);
    System.out.println(arr4[0]);
  }
}
