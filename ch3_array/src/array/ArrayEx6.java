package array;

public class ArrayEx6 {

  public static void main(String[] args) {
    // 학생 10 명의 점수 관리
    int score[] = { 79, 88, 91, 33, 100, 45, 55, 89, 25, 74 };

    // 최고 점수 , 최저 점수 확인, 총합, 평균
    int max = score[0], min = score[0];
    int sum = score[0];

    for (int i = 1; i < score.length; i++) {
      if (max < score[i]) max = score[i];
      if (min > score[i]) min = score[i];
      sum += score[i];
    }
    int avg = sum / score.length;
    System.out.printf(
      "최고 점수는 %d, 최저 점수는 %d, 총합 %d, 평균 %d",
      max,
      min,
      sum,
      avg
    );
  }
}
