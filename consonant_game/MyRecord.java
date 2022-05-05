package consonant_game;

import java.util.Scanner;

public class MyRecord {
	public static void main(String[] args) {

		TitleGraph();
		ScriptGraph();

	}

	public static void myRecord() {

		Scanner scan = new Scanner(System.in);

		System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
		System.out.println("               나의 승패 확인하기 ");
		System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");

		System.out.println("[!]" + main.id + "님의 승패를 확인하겠습니다");
		System.out.println();
		System.out.println("1.영화 제목 맞추기 게임 승패 확인하기");
		System.out.println("2.명대사 게임 승패 확인하기");
		System.out.println("3.메인메뉴로 돌아가기");
		System.out.println("번호를 입력하세요 : ");

		String answer = scan.next();

		if (answer.equals("1")) {
			System.out.println("영화 제목 맞추기 게임의 총 플레이 횟수는" + MovieTitle.allCount + "입니다.");
			System.out.println("영화 제목 맞추기 게임에서 정답을 맞춘 횟수는" + MovieTitle.rightCount + "입니다.");
			System.out.println("영화 제목 맞추기 게임에서 틀린 횟수는" + MovieTitle.failCount + "입니다.");
			System.out.println();
			TitleGraph();
			System.out.println();
			System.out.println();



		} else if (answer.equals("2")) {
			System.out.println("명대사 맞추기 게임의 총 플레이 횟수는" + Script.allCount + "입니다.");
			System.out.println("명대사 맞추기 게임에서 정답을 맞춘 횟수는" + Script.rightCount + "입니다.");
			System.out.println("명대사 맞추기 게임에서 틀린 횟수는" + Script.failCount + "입니다.");
			System.out.println();
			ScriptGraph();
			System.out.println();
			System.out.println();

		} else {
			main.main(null);
		}



	}

	public static void TitleGraph() {
		// 영화 제목 총 횟수
		System.out.print("영화 제목 총횟수 :");
		for (int i = 0; i < MovieTitle.allCount; i++) {
			System.out.print("■");
		}
		System.out.println();

		// 영화 총정답 그래프
		System.out.print("영화 제목 총정답 :");
		for (int i = 0; i < MovieTitle.rightCount; i++) {
			System.out.print("■");
		}

		for (int i = 0; i < MovieTitle.allCount - MovieTitle.rightCount; i++) {
			System.out.print("□");
		}

		System.out.println();
		// 영화제목 총오답
		System.out.print("영화 제목 총오답 :");
		for (int i = 0; i < MovieTitle.failCount; i++) {
			System.out.print("■");
		}

		for (int i = 0; i < MovieTitle.allCount - MovieTitle.failCount; i++) {
			System.out.print("□");
		}
	}


	public static void ScriptGraph() {
		System.out.print("명대사 맞추기 총횟수 :");
		for (int i = 0; i < Script.allCount; i++) {
			System.out.print("■");
		}
		System.out.println();

		// 영화 총정답 그래프
		System.out.print("명대사 맞추기 총정답 :");
		for (int i = 0; i < Script.rightCount; i++) {
			System.out.print("■");
		}

		for (int i = 0; i < Script.allCount - Script.rightCount; i++) {
			System.out.print("□");
		}

		System.out.println();
		// 영화제목 총오답
		System.out.print("명대사 맞추기 총오답 :");
		for (int i = 0; i < Script.failCount; i++) {
			System.out.print("■");
		}

		for (int i = 0; i < Script.allCount - Script.failCount; i++) {
			System.out.print("□");
		}
	}



}
