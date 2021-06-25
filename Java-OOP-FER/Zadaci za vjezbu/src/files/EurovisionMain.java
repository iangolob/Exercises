package files;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class EurovisionMain {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year:");
		//int year= sc.nextInt();
		int year=2019;
		System.out.println(PointsUtil.getForYear(year));
		List<Pair<String,Integer>> list=StandingsUtil.orderByPoints(PointsUtil.getForYear(year));
		for(Pair<String,Integer> p:list) {
			String country = Translations.translate(p.getFirst(), "hr", Translations.load());
			System.out.format("%3d  : %s%n",p.getSecond(),country);
		}

		sc.close();
	}

}
