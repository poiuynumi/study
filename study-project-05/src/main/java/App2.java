import java.sql.Date;
import java.util.Scanner;

public class App2 {

  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    final int LENGTH = 10;
    int i = 0;
    
    while (i<LENGTH) {
    
    int[] no = new int[LENGTH];
    String[] name = new String[LENGTH];
    String[] email = new String[LENGTH];
    String[] password = new String[LENGTH];
    String[] photo = new String[LENGTH];
    String[] tel = new String[LENGTH];
    Date[] registeredDate = new Date[LENGTH];
   

    while (i<LENGTH) {
    System.out.print("번호? ");
    no[i] = Integer.parseInt(keyboard.nextLine());
    
    System.out.print("이름? ");
   name[i] = keyboard.nextLine();
    
    System.out.print("이메일? ");
    email[i] = keyboard.nextLine();
    
    System.out.print("암호? ");
    password[i] = keyboard.nextLine();

    System.out.print("사진? ");
    photo[i] = keyboard.nextLine();

    System.out.print("전화? ");
    tel[i] = keyboard.nextLine();

    registeredDate[i] = new Date(System.currentTimeMillis()); 
    
    i ++;
    
    System.out.print("\n 계속 입력하시겠습니까? (Y/N) ");
    String answer = keyboard.nextLine().toLowerCase();
    
    if (!answer.equals("y") && answer.length() > 0)
   	 break;
    
    }
        
    System.out.println();
    // 사용후 스캐너 객체의 자원을 해제한다.
    keyboard.close();
    
    System.out.println(); // 빈 줄 출력
    
    for(int j=0; j<i; j++) {
    System.out.printf(" %d, %s, %s, %s, %s, %s, %s\n ", 
    		no[j], name[j], email[j], password[j], photo[j], tel[j], registeredDate[j]);
    }
  }
  }
}
