import java.util.Arrays;

public class Lotto {

  public static void main(String[] args) {


    int[] array = new int[6];

    for(int i=0;i<array.length; i++) {
      array[i] = (int)((Math.random()*45)+1);

      for (int j=0;j<i;j++) {
        if (array[j] == array[i]) {
          i--;
          break;   
        }

      }
    } Arrays.sort(array);
    for (int a=0; a<6; a++) {
      System.out.println(array[a]);

    }
  }
}