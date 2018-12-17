import java.util.Arrays;
import java.util.Scanner;

public class Binary {
	
 int binary(int a) {

    String a2 = Integer.toBinaryString(a); //2진수 문자배열로 변환
    int max=0; //최대간격값(리턴값)
    int idx=-1; //간격을 구하기 위한 인덱스 ->
    String[] num = new String[a2.length()]; 
    num = a2.split(""); // 2진수를 배열에 담는다

    for (int i=0; i<num.length; i++) {
    
      if (num[i].equals("1")) { //배열 중 1이 있는 위치를 찾는다

        if(idx !=-1) { //인덱스가 초기설정값이 아니면 (배열에서 첫번째 1이 아니면) 다음을 수행

          if(i-idx-1>max) {

            max=i-idx-1;
            }
         }

         idx = i;
      }

    }return max;
  }
	 

	public static void main (String[] args) {
		
  Binary number = new Binary();
  Scanner keyboard = new Scanner(System.in);
  System.out.print("숫자 ");
  int a;
  a = keyboard.nextInt();

  System.out.println(number.binary(a));
		
	}
}