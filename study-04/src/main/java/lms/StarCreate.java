package main.java.lms;

import java.util.Scanner;

public class StarCreate {

  public void getStar(int num) {
    for(int i=0; i< num; i++) {
      for(int j=0; j<= i; j++) {
        System.out.print("*");
      }System.out.println();
    }
  }
  public static void main(String[] args) {
    System.out.printf("별 갯수를 입력하세요");
    int num = Integer.parseInt(new Scanner(System.in).next());
    new StarCreate().getStar(num);
  }  
}

