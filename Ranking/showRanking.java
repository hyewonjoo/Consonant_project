package Ranking;

import java.io.BufferedReader;
import java.io.FileReader;

public class showRanking {

	public static void showRanking() {
		System.out.println("◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆");
		System.out.println("               명예의 전당 입니다.");
		System.out.println("◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆");
		try {

			String path = String.format("C:\\Users\\joo\\Desktop\\토이플젝2\\rank.txt");


			BufferedReader reader = new BufferedReader(new FileReader(path));
			String line = null;

			while ((line = reader.readLine()) != null) {

				System.out.println(line);
			}
			System.out.println();
			System.out.println();
			System.out.println("[!] 가장 초기 화면으로 돌아갑니다");
			System.out.println();
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

