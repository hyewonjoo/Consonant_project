package consonant_game;

import java.util.Scanner;

public class Script {
	static Scanner scan = new Scanner(System.in);
	static int allCount = 0;
	static int rightCount = 0;
	static int failCount = 0;

	public static void Script() {


		System.out.println("◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆");
		System.out.println("               재미있는 초성월드로 떠나볼까?");
		System.out.println("◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆");

		String answer = "";


		String[] script = {"밥은 먹고 다니냐?", "니 아버지 뭐하시노?", "아직..한 발 남았다..", "싸늘하다..가슴에 비수가 날아와 꽂힌다..",
				"비겁한 변명입니다!", "호이가 계속되면 그게 둘리인줄알아요", "살려는 드릴게", "가장 완벽한 계획이 뭔지알아 ? 무계획이야", "살아있네",
				"야 4885 너지?", "누구냐,너"};


		for (int i = 0; i < script.length; i++) {
			String n = script[i];
			System.out.println("[ " + (i + 1) + "번째 문제 : " + n + "]");
			answer = scan.next();


			if (n.equals(script[0])) {
				if (answer.equals("살인의추억") || answer.equals("살인의 추억")) {
					System.out.println("정답입니다!");
					rightCount++;
				} else {
					System.out.println("오답입니다 ㅠㅠ");
					failCount++;
				}

			} else if (n.equals(script[1]) || answer.equals("살인의 추억")) {
				if (answer.equals("살인의추억")) {
					System.out.println("정답입니다!");
					rightCount++;
				} else {
					System.out.println("오답입니다 ㅠㅠ");
					failCount++;
				}

			} else if (n.equals(script[2])) {
				if (answer.equals("아저씨")) {
					System.out.println("정답입니다!");
					rightCount++;
				} else {
					System.out.println("오답입니다 ㅠㅠ");
					failCount++;
				}

			} else if (n.equals(script[3])) {
				if (answer.equals("타짜")) {
					System.out.println("정답입니다!");
					rightCount++;
				} else {
					System.out.println("오답입니다 ㅠㅠ");
					failCount++;
				}

			} else if (n.equals(script[4])) {
				if (answer.equals("실미도")) {
					System.out.println("정답입니다!");
					rightCount++;
				} else {
					System.out.println("오답입니다 ㅠㅠ");
					failCount++;
				}

			} else if (n.equals(script[5])) {
				if (answer.equals("부당거래")) {
					System.out.println("정답입니다 !");
					rightCount++;
				} else {
					System.out.println("오답입니다 ㅠㅠ");
					failCount++;
				}

			} else if (n.equals(script[6])) {
				if (answer.equals("신세계")) {
					System.out.println("정답입니다!");
					rightCount++;
				} else {
					System.out.println("오답입니다 ㅠㅠ");
					failCount++;
				}

			} else if (n.equals(script[7])) {
				if (answer.equals("기생충")) {
					System.out.println("정답입니다!");
					rightCount++;
				} else {
					System.out.println("오답입니다 ㅠㅠ");
					failCount++;
				}
			} else if (n.equals(script[8])) {
				if (answer.equals("범죄와의 전쟁") || answer.equals("범죄와의전쟁")) {
					System.out.println("정답입니다!");
					rightCount++;
				} else {
					System.out.println("오답입니다 ㅠㅠ");
					failCount++;
				}
			} else if (n.equals(script[9])) {
				if (answer.equals("추격자")) {
					System.out.println("정답입니다!");
					rightCount++;
				} else {
					System.out.println("오답입니다 ㅠㅠ");
					failCount++;
				}
			} else if (n.equals(script[10])) {
				if (answer.equals("올드보이")) {
					System.out.println("정답입니다!");
					rightCount++;
				} else {
					System.out.println("오답입니다 ㅠㅠ");
					failCount++;
				}
			} // else if종료

			System.out.println();

			allCount++;
		} // for

		System.out.println("◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆");
		System.out.println("                 초성게임을 종료합니다 ");
		System.out.println("◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆");


	}
}


