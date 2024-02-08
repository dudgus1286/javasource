// 패키지 문
package com.project.book;

// import 구문 => 다른 패키지에 있는 클래스를 사용할 때
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
// import java.util.Date;
// import java.util.Scanner;
import java.util.*; // 로 대체 가능

// 클래스 선언
public class Book {

  public static void main(String[] args) {
    Date date = new Date();
    System.out.println(date.toString()); // Date 에도 Object의 toString() 메소드가 오버라이딩 되어 있음
    System.out.println(date);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    System.out.println(sdf.format(date));

    LocalDateTime dateTime = LocalDateTime.now();
    System.out.println(dateTime);

    Scanner sc = new Scanner(System.in);
  }
}
