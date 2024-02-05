package array;

public class ArrayEx13 {

  public static void main(String[] args) {
    int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
    int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 } };

    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr1[i].length; j++) {
        System.out.print(arr1[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
