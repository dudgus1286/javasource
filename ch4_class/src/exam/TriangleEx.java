package exam;

public class TriangleEx {

  public static void main(String[] args) {
    Triangle triangle = new Triangle(5, 4);
    double area = triangle.getArea();

    System.out.println(area);
    System.out.println(triangle.getArea());
  }
}
