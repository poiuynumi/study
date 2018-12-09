package com.eomcs.lms;

import java.util.Scanner;

import com.eomcs.lms.handler.BoardHandler;
import com.eomcs.lms.handler.LessonHandler;
import com.eomcs.lms.handler.MemberHandler;

public class App {
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {

		LessonHandler.keyboard = keyboard;
		BoardHandler.keyboard = keyboard;
		MemberHandler.keyboard = keyboard;

		while (true) {
			String command = prompt();

			if (command.equals("lesson/add")) {
				LessonHandler.addLesson();
			}else if (command.equals("/lesson/list")) {
				LessonHandler.listLesson();	
			} else if (command.equals("/board/add")) {
				BoardHandler.addBoard();
			}else if (command.equals("/board/list")) {
				BoardHandler.listBoard();
			} else if (command.equals("/member/add")) {
				MemberHandler.addMember();
			}else if (command.equals("mamber/list")) {
				MemberHandler.listMember();
			}else if (command.equals("quit")) {
				System.out.print("안녕!\n");
				break;
			}else {System.out.print("\n실행할 수 없는 명령입니다.\n");
			}System.out.println();
		}keyboard.close();
	}	

	private static String prompt() {
		System.out.print("명령>");
		String command = keyboard.nextLine().toLowerCase();
		return command;
	}


}


