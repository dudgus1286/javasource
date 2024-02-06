package ch4;

public class Calc {

  // 직사각형, 정사각형 넓이 구하는 메소드(오버로딩)
  double areaRectangle(double width) {
    //정사각형
    return width * width;
  }

  double areaRectangle(double width, double height) {
    //직사각형
    return width * height;
  }
}
