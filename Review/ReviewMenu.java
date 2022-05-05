package Review;

import java.io.File;
import java.util.Scanner;
import consonant_game.main;

public class ReviewMenu {
	static Scanner scan = new Scanner(System.in);
	static String answer = "";

	public static void main(String[] args) {
		reviewMenu();

	}

	public static void reviewMenu() {


		System.out.println("◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆");
		System.out.println("               리뷰 메인 페이지 입니다.");
		System.out.println("◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆");
		System.out.println("1.현재 회원들의 리뷰 보기");
		System.out.println("2.나의 리뷰 남겨보기");
		System.out.println("3.내가 쓴 리뷰 보기");
		System.out.println("4.메인 메뉴로 돌아가기");

		String answer = scan.next();

		if (answer.equals("1")) {

			File dir = new File("C:\\Users\\joo\\Desktop\\토이플젝2");
			File[] list = dir.listFiles(); // dir에 있는 파일목록들을 list배열에 담아줌
			for (File d : list) {
				if (d.isDirectory()) { // 리스트 중에서 폴더일경우만 출력
					System.out.printf("[%s]\n", d.getName());
				}
			}
			selectUser();

		} else if (answer.equals("2")) {
			MyReview.myreview();

		} else if (answer.equals("3")) {
			MyReview.showMyReivew();
		} else {
			main.main(null);
		}

	}// reviewMenu()


	public static void selectUser() {
		System.out.println("리뷰를 볼 회원의 번호를 입력하세요[예 : user01 ->1]");
		answer = scan.next();
		System.out.println();
		System.out.println();
		gameReview.gameReview();

		System.out.println("[!] 이 리뷰에 한줄평을 남기시겠습니까?[Y/N]");
		String input = scan.next();

		if (input.toLowerCase().equals("y")) {
			gameReview.addReivew();
		} else {
			System.out.println();
			System.out.println("[!] 처음 화면으로 돌아갑니다.");
			main.main(null);
		}
	}


}
