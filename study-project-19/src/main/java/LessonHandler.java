import java.sql.Date;
import java.util.Scanner;

public class LessonHandler {

	static Scanner keyboard;
	static final int LENGTH = 10;
	static Lesson[] lessons = new Lesson[LENGTH];
	static int lessonIdx = 0;
	
	public static void listLesson() {
		
		System.out.println(); 

				
		for (int j = 0; j < lessonIdx; j++) {
			System.out.printf("%3d, %-15s, %10s ~ %10s, %4d\n", 
					lessons[j].no, lessons[j].title, 
					lessons[j].startDate, lessons[j].endDate, lessons[j].totalHours);
			System.out.println();
		}
	}
	
	public static void addLesson() {
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
