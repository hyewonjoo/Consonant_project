package Review;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class gameReview {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		gameReview();
		addReivew();

	}

	public static void gameReview() {

		try {

			String path =
					String.format(("C:\\Users\\joo\\Desktop\\토이플젝2\\user0%s\\gameReview%s.txt"),
							ReviewMenu.answer, ReviewMenu.answer);
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String line = null;

			while ((line = reader.readLine()) != null) {

				System.out.println(line);
			}
			System.out.println("-----------------------------");
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void addReivew() {
		try {
			String path = String.format(("C:\\Users\\joo\\Desktop\\토이플젝2\\user0%s\\message%s.txt"),
					ReviewMenu.answer, ReviewMenu.answer);
			BufferedWriter writer = new BufferedWriter(new FileWriter(path, true)); // 저장해놓을

			System.out.println("[!] 한줄평을 달아주세요");
			String message = scan.next();
			String name = consonant_game.main.id;
			writer.write(String.format("%s  :", name)); // id 받기
			writer.write(String.format("%s", message));

			writer.close();
			System.out.println("[!] 한줄 평 입력이 완료되었습니다.");
			System.out.println();
			System.out.println();
		}

		catch (Exception e) {
			e.printStackTrace(); // 에러메세지를 출력! -> 빠뜨리지 않도록 조심
		}
	}
}
