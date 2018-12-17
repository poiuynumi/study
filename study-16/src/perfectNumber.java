import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class perfectNumber {

  public void number(int num) {
    
    Set<Integer> aliquot = new TreeSet<>();
    int sum=0;
    
    for (int i=0; i<num; i++) {
      if (num%i ==0)
        aliquot.add(i);
      }
    Collections.addAll(aliquot);
    
    
  }
  
 
  public static void main (String[] args) {
    
    perfectNumber p = new perfectNumber();
    Scanner sc = new Scanner(System.in);
    System.out.print("자연수를 입력하세요");
    int num = sc.nextInt();
    p.number(num);
    
  }
}
