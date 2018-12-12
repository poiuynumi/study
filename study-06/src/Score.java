
public class Score {

  public static void main(String[] args) {
    
    int sum=0;
    float average = 0f;
    int[] jumsu = {100,55,90,60,78};
    
    //1. 총 과목수
    //2. 점수의 합
    //3. 점수의 평균을 구하세요  (2,3 번은 하나의 for문에서)
    
    for(int i=0; i<jumsu.length;i++) {
      sum +=jumsu[i];
      average  = sum/(float)jumsu.length;
    
  }
    System.out.printf("총 과목수 : %d\n점수의 합 : %d\n점수의 평균 : %f ",jumsu.length,sum,average);

}
}
