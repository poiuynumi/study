import java.sql.Date;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    
    // 키보드 입력 스트림(System.in)을 스캐너 객체에 연결한다.
    // => 스캐너는 입력 스트림으로 들어온 문자열을 줄 단위로 잘라주는 역할을 수행한다.
    Scanner keyboard = new Scanner(System.in);
    final int LENGTH = 10;
    
    int[] no = new int[LENGTH];
    String[] title = new String[LENGTH];
    String[] contents = new String[LENGTH];
    Date[] startDate = new Date[LENGTH];
    Date[] endDate = new Date[LENGTH];
    int[] totalHours = new int[LENGTH];
    int[] dayHours = new int[LENGTH];
    
    int i=0;
    
    while (i<LENGTH) {
    // 콘솔에서 입력 받은 값을 변수에 저장한다.
    System.out.print("번호? ");
    no[i] = Integer.parseInt(keyboard.nextLine());
    
    System.out.print("수업명? ");
     title[i] = keyboard.nextLine();
    
    System.out.print("설명? ");
     contents[i] = keyboard.nextLine();
    
    System.out.print("시작일? ");
     startDate[i] = Date.valueOf(keyboard.nextLine());
    
    System.out.print("종료일? ");
     endDate[i] = Date.valueOf(keyboard.nextLine());
    
    System.out.print("총수업시간? ");
     totalHours[i] = Integer.parseInt(keyboard.nextLine());
    
    System.out.print("일수업시간? ");
     dayHours[i] = Integer.parseInt(keyboard.nextLine());
    
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
    System.out.printf("%3d, %-15s, %10s ~ %10s, %4d\n", 
    		no[j], title[j], startDate[j], endDate[j], totalHours[j]);
    }
  }
}
