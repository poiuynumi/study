package main.java.lms;

import java.util.Scanner;

public class Main {

  public static void main (String[] args) {
    System.out.print("개수");
    int kb = Integer.parseInt(new Scanner(System.in).next());

    int[] no = new int[kb];
    for (int i=0; i<kb; i++) {
      no[i] = ((int)(Math.random()*10)+1);
      for (int j=0; j<i; j++) {
        if(no[j]==no[i]) {
          i--;
          break;
        }
      }
    }for (int h=0; h<kb;h++) {
      System.out.println(no[h]);


    } System.out.println();

    for (int a=kb; a>0;a--) {
      for (int h=0; h<kb-1 ;h++) {
        int n;
        if(no[h]>no[h+1]) {
          n = no[h];
          no[h] = no[h+1];
          no[h+1] = n;
        }
      }
    }


    for (int b=0;b<kb;b++)
      System.out.println(no[b]);
  }}


















