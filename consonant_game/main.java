package consonant_game;

import java.util.Scanner;
import Ranking.showRanking;
import Review.ReviewMenu;


public class main {
	public static String id;
	static Scanner scan = new Scanner(System.in);


	// 프로그램을 처음 실행 했을 때 뜨는 화면..아주 간단한 로그인 추가할까..? ㅎ,,
	public static void main(String[] args) {


		// 객체생성
		// Java의 static keyword는 field, method, class에 적용할 수 있다.
		// static 키워드의 공통점은 객체와의 분리입니다. 객체를 생성하지 않고 접근할 수 있다. -> script클래스는 static을 사용하여 따로 객체생성을 하지
		// 않았다.
		// 비교를 위해 layout과 movieTitle은 static을 사용하지 않고 객체를 생성하였다.

		LayOut layout = new LayOut();
		MovieTitle movieTitle = new MovieTitle();

		layout.StartView();
		id = scan.next();
		while (true) {

			System.out.println("환영합니다!" + id + "님, 즐거운 초성 월드로 떠나볼까요?");

			System.out.println();
			System.out.println();


			layout.TitleView();
			int answer = scan.nextInt();

			if (answer == 1) {
				movieTitle.movieTitle();
			} else if (answer == 2) {
				Script.Script();
			} else if (answer == 3) {
				MyRecord.myRecord();
			} else if (answer == 4) {
				ReviewMenu.reviewMenu();
			} else if (answer == 5) {
				showRanking.showRanking();

			} else if (answer == 6) {
				System.out.println("프로그램을 종료합니다");
				break;
			}



		} // while문 종료

		System.out.println();
		System.out.println();

		layout.FinishView();

	}


}
