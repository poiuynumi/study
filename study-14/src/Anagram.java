import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

  String check(String a, String b) {
    
    if(a.length() == b.length()) {
      String[] num1 = new String[a.length()];
      String[] num2 = new String[b.length()];    
      num1 = a.split("");
      num2 = b.split("");
      Arrays.sort(num1);
      Arrays.sort(num2);
      
      if (Arrays.equals(num1, num2)) 
        return "yes"; 
      else return "no";
      
    }else return "no";
    
  } 
     
  public static void main(String[] args) {

    Anagram anagram = new Anagram();

    String first;
    String second;

    Scanner input = new Scanner(System.in);
    
    // 문장을 받을 수도 있기에 nextLine() 활용
    System.out.print("첫번째 단어/문장 입력:");
    first = input.nextLine();

    System.out.print("두번째 단어/문장 입력:");
    second = input.nextLine();

    System.out.printf("Anagram ? " + anagram.check(first, second));
input.close();
  }
}





