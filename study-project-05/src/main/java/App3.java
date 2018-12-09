import java.sql.Date;
import java.util.Scanner;

public class App3 {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    final int LENGTH = 10;
    int[] no = new int[LENGTH];
    String[] contents = new String[LENGTH];
    Date[] createdDate = new Date[LENGTH];
    
    int i = 0;
    
    while (i < LENGTH) {
    System.out.print("번호? ");
   no[i] = Integer.parseInt(keyboard.nextLine());
    
    System.out.print("내용? ");
    contents[i] = keyboard.nextLine();
    
    createdDate[i] = new Date(System.currentTimeMillis()); 
    
   
    
    i++;
    
    System.out.print("\n 계속 입력하시겠습니까? (Y/N) ");
    String answer = keyboard.nextLine().toLowerCase();
    
    if (!answer.equals("y") && answer.length() > 0)
   	 break;
    
    }
    
    System.out.println();
    // 사용후 스캐너 객체의 자원을 해제한다.
    keyboard.close();
    
    System.out.println(); // 빈 줄 출력
    
    for (int j=0 ; j<i ; j++) {
    System.out.printf(" %d, %s, %10s\n", no[j], contents[j], createdDate[j]);
    }
  }
}
