import java.util.Set;
import java.util.TreeSet;

public class Program {

  public static void main(String[] args) {
 
    /*
    Set<Integer> lotto = new TreeSet<>(); //TreeSet배열 생성
    for(int i=0;lotto.size() < 6; i++) { //6회반복
      lotto.add((int)(Math.random()*45)+1);//랜덤으로 1부터 45까지의 값을 추출해 lotto에 넣는다
      
    }System.out.println(lotto.toString());//lotto값 출력
     */
  Set<Integer> lotto = new TreeSet<>();
  for(int i=0; lotto.size()<6; i++) {
  lotto.add((int)(Math.random()*45)+1);
  }
 System.out.println(lotto.toString());
  }
}
    