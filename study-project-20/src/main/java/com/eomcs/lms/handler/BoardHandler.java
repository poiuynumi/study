package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;

public class BoardHandler {
	
	public static Scanner keyboard;
	static final int LENGTH = 10;
	static Board[] boards = new Board[LENGTH];
	static int boardIdx = 0;
	
	public static void listBoard() {
		System.out.println();
		for (int j = 0; j < boardIdx; j++) {
			System.out.printf("%3d, %-20s, %s, %d\n", 
					boards[j].no, boards[j].contents, 
					boards[j].createdDate, boards[j].viewCount);
			System.out.println();
		}

}
	
	public static void addBoard() {
		System.out.println();
		Board board = new Board();

		System.out.print("번호? ");
		board.no = Integer.parseInt(keyboard.nextLine());

		System.out.print("내용? ");
		board.contents = keyboard.nextLine();

		board.createdDate = new Date(System.currentTimeMillis()); 

		board.viewCount = 0;

		boards[boardIdx] = board;
		boardIdx++;
		System.out.print("저장되었습니다!");
		System.out.println();

	}
	
}
