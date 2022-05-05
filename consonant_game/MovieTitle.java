package consonant_game;

import java.util.Scanner;

public class MovieTitle {
	static Scanner scan = new Scanner(System.in);
	static int allCount = 0;
	static int rightCount = 0;
	static int failCount = 0;

	public void movieTitle() {


		System.out.println("◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆");
		System.out.println("               재미있는 초성월드로 떠나볼까?");
		System.out.println("◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆");

		String answer = "";


		String[] movie = {"ㄱㅁ", "ㅇㅂㅌ", "ㅅㅁㄷ", "ㅇㄱㅆ", "ㅊㅈㅂㄱㅎ", "ㅁㅇㅇ", "ㅇㄱㄱㄷ", "ㄱㅅ"};


		for (int i = 0; i < movie.length; i++) {
			String n = movie[i];
			System.out.println("[ " + (i + 1) + "번째 문제 : " + n + "]");
			answer = scan.next();


			if (n.equals(movie[0])) {
				if (answer.equals("괴물")) {
					System.out.println("정답입니다!");
					rightCount++;
				} else {
					System.out.println("오답입니다 ㅠㅠ");
					failCount++;
				}

			} else if (n.equals(movie[1])) {
				if (answer.equals("아바타")) {
					System.out.println("정답입니다!");
					rightCount++;
				} else {
					System.out.println("오답입니다 ㅠㅠ");
					failCount++;
				}

			} else if (n.equals(movie[2])) {
				if (answer.equals("실미도")) {
					System.out.println("정답입니다!");
					rightCount++;
				} else {
					System.out.println("오답입니다 ㅠㅠ");
					failCount++;
				}

			} else if (n.equals(movie[3])) {
				if (answer.equals("아가씨")) {
					System.out.println("정답입니다!");
					rightCount++;
				} else {
					System.out.println("오답입니다 ㅠㅠ");
					failCount++;
				}

			} else if (n.equals(movie[4])) {
				if (answer.equals("최종병기활")) {
					System.out.println("정답입니다!");
					rightCount++;
				} else {
					System.out.println("오답입니다 ㅠㅠ");
					failCount++;
				}

			} else if (n.equals(movie[5])) {
				if (answer.equals("마음이")) {
					System.out.println("정답입니다 !");
					rightCount++;
				} else {
					System.out.println("오답입니다 ㅠㅠ");
					failCount++;
				}

			} else if (n.equals(movie[6])) {
				if (answer.equals("여고괴담")) {
					System.out.println("정답입니다!");
					rightCount++;
				} else {
					System.out.println("오답입니다 ㅠㅠ");
					failCount++;
				}

			} else if (n.equals(movie[7])) {
				if (answer.equals("곡성")) {
					System.out.println("정답입니다!");
					rightCount++;
				} else {
					System.out.println("오답입니다 ㅠㅠ");
					failCount++;
				}

			} // else if

			System.out.println();

			allCount++;
		} // for

		System.out.println("◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆");
		System.out.println("         초성게임을 종료하고 메인페이지로 이동합니다 ");
		System.out.println("◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆");
		System.out.println();


	}



}
