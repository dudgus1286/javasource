package steam;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import lambda.Student;

public class FromCollectionEx {

  static int sum = 0;

  public static void main(String[] args) {
    List<Student> students = Arrays.asList(
      new Student("홍길동", 90, 80),
      new Student("강호동", 80, 70),
      new Student("송진호", 70, 60)
    );
    // students.forEach(null);

    // Stream 객체로 변환
    // Stream 객체도 forEach 가능
    Stream<Student> stream = students.stream();

    stream.forEach(student ->
      System.out.println(
        student.getName() + ": " + student.getKor() + ", " + student.getMath()
      )
    );
    // stream.forEach(student -> {
    //   //처리해야 할 코드가 많은 경우 중괄호
    // });

    //ch9_io FileEx3.java 에서 temp 폴더에 있는 파일 목록 가져온 것과 비슷한 거
    // Path
    // java.nio.file (nio : io를 향상시킨 패키지)
    // File을 바로 스트림으로 다룰 수 없어서 Path 사용
    Path path = Paths.get("c:\\temp");
    try (Stream<Path> stream2 = Files.list(path);) {
      //파일명 출력
      stream2.forEach(file -> System.out.println(file.getFileName()));
    } catch (Exception e) {
      e.printStackTrace();
    }

    // 1~100까지의 합
    // int sum = 0;
    // for (int i = 0; i < 101; i++) {
    //   sum += i;
    // }
    // System.out.println("1~100 합 : " + sum);

    // 특정 범위의 정수를 스트림으로 생성
    // .range()
    IntStream.range(0, 10).forEach(i -> System.out.println(i + " "));
    System.out.println();
    // .rangeClosed() : 마지막을 포함
    IntStream.rangeClosed(0, 10).forEach(i -> System.out.println(i + " "));

    IntStream.rangeClosed(1, 100).forEach(i -> sum += i);
    System.out.println("sum = " + sum);
  }
}
