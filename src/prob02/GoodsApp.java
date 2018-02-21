package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		for (int i = 0; i < COUNT_GOODS; i++) {
			String[] line = scanner.nextLine().split(" ");
			Goods good = new Goods(line[0]
					,Integer.parseInt(line[1])
					, Integer.parseInt(line[2]));
			goods[i] = good;
		}
		
		for(Goods g : goods) {
			System.out.println(g.getName() +"(가격:"+g.getPrice() +"원)이" + g.getCount() + "개 입고 되었습니다.");
		}

		scanner.close();
	}
}
