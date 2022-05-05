package Review;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyReview {
	static Scanner scan = new Scanner(System.in);
	static String id = consonant_game.main.id;


	public static void myreview() {
		try {


			String path = String.format("C:\\Users\\joo\\Desktop\\토이플젝2\\%s.txt", id);

			File file = new File(path);

			file.createNewFile();
		} catch (IOException e) {

			e.printStackTrace();
		}

		writeMyReview();
	}

	private static void writeMyReview() {

		String path = String.format("C:\\Users\\joo\\Desktop\\토이플젝2\\%s.txt", id);
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(path));


			System.out.println("[!] 리뷰를 입력해주세요 ");
			System.out.println("[!] 리뷰쓰기를 그만하고 싶으면 exit를 입력하세요");
			boolean loop = true;
			while (loop) { // 무한루프
				String line = scan.nextLine();

				if (line.equals("exit")) { // 사용자가 exit를 누루면 빠져나가도록 만듦
					break;
				}

				writer.write(line); // exit를 누르지 않을경우 계속해서 원하는 line쓰도록..
				writer.write("\n");
			}

			// 자원 해제 코드, Clean- up -Code
			writer.close();

			System.out.println("[!] 리뷰가 입력되었습니다.");
			System.out.println();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void showMyReivew() {
		try {

			System.out.println("[!]" + id + " 님이 쓰신 리뷰입니다");
			String path = String.format("C:\\Users\\joo\\Desktop\\토이플젝2\\%s.txt", id);


			BufferedReader reader = new BufferedReader(new FileReader(path));
			String line = null;

			while ((line = reader.readLine()) != null) {

				System.out.println(line);
			}

			System.out.println();
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

