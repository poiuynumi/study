import java.util.Arrays;

public class Math {

  public static void main(String[] args) {

    int[] score = new int[] {79,88,97,54,56,95};
    int max = score[0]; //79
    int min = score[0]; //79

    for (int i : score) {
    max = (i>max) ? i : max;
    min = (i<min) ? i : min;
    }
    /*
    for (int i=1; i<6; i++) {
      if(score[i] > max) {
        max = score[i];

      }else if(score[i] < min)
        min = score[i];
    }
     */
    System.out.println();
    System.out.printf("최대값 : %d\n최소값 : %d", max, min );
      }
  } 



