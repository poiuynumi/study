import java.sql.Date;
import java.util.Scanner;

public class App {


	static Scanner keyboard = new Scanner(System.in);
	static final int LENGTH = 10;
	static Lesson[] lessons = new Lesson[LENGTH];
	static int lessonIdx = 0;
	static Board[] boards = new Board[LENGTH];
	static int boardIdx = 0;
	static Member[] members = new Member[LENGTH];
	static int memberIdx = 0;

	public static void main(String[] args) {

		while (true) {
			System.out.print("명령>");
			String command = keyboard.nextLine().toLowerCase();

			if (command.equals("lesson/add")) {
				addLesson();
			}else if (command.equals("/lesson/list")) {
				listLesson();	
			} else if (command.equals("/board/add")) {
				addBoard();
			}else if (command.equals("/board/list")) {
				listBoard();
			} else if (command.equals("/member/add")) {
				addMember();
			}else if (command.equals("mamber/list")) {
				listMember();
			}else if (command.equals("quit")) {
				System.out.print("안녕!\n");
				break;
			}else System.out.print("\n실행할 수 없는 명령입니다.\n");
		}
	}

	private static void listMember() {
		for (int j = 0; j < memberIdx; j++) {
			System.out.printf("%3d, %-4s, %-20s, %-15s, %s\n", 
					members[j].no, members[j].name, members[j].email, 
					members[j].tel, members[j].registeredDate);
		}
	}
	private static void addMember() {
		Member member = new Member();

		System.out.print("번호? ");
		member.no = Integer.parseInt(keyboard.nextLine());

		System.out.print("이름? ");
		member.name = keyboard.nextLine();

		System.out.print("이메일? ");
		member.email = keyboard.nextLine();

		System.out.print("암호? ");
		member.password = keyboard.nextLine();

		System.out.print("사진? ");
		member.photo = keyboard.nextLine();

		System.out.print("전화? ");
		member.tel = keyboard.nextLine();

		member.registeredDate = new Date(System.currentTimeMillis()); 

		members[memberIdx] = member;

		System.out.print("저장되었습니다!\n");

		memberIdx++;
	}

	private static void listBoard() {
		System.out.println();
		for (int j = 0; j < boardIdx; j++) {
			System.out.printf("%3d, %-20s, %s, %d\n", 
					boards[j].no, boards[j].contents, 
					boards[j].createdDate, boards[j].viewCount);
			System.out.println();
		}
	}

	private static void listLesson() {
		System.out.println(); // 빈 줄 출력

		for (int j = 0; j < lessonIdx; j++) {
			System.out.printf("%3d, %-15s, %10s ~ %10s, %4d\n", 
					lessons[j].no, lessons[j].title, 
					lessons[j].startDate, lessons[j].endDate, lessons[j].totalHours);
			System.out.println();
		}
	}

	private static void addBoard() {
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

	private static void addLesson() {
		System.out.println();
		Lesson lesson = new Lesson();

		System.out.print("번호? ");
		lesson.no = Integer.parseInt(keyboard.nextLine());

		System.out.print("수업명? ");
		lesson.title = keyboard.nextLine();

		System.out.print("설명? ");
		lesson.contents = keyboard.nextLine();

		System.out.print("시작일? ");
		lesson.startDate = Date.valueOf(keyboard.nextLine());

		System.out.print("종료일? ");
		lesson.endDate = Date.valueOf(keyboard.nextLine());

		System.out.print("총수업시간? ");
		lesson.totalHours = Integer.parseInt(keyboard.nextLine());

		System.out.print("일수업시간? ");
		lesson.dayHours = Integer.parseInt(keyboard.nextLine());

		lessons[lessonIdx] = lesson;
		lessonIdx++;

		System.out.print("저장되었습니다!\n");
		System.out.println();
	}
}