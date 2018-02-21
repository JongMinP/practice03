package prob07;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String[] input = scanner.nextLine().split(" ");

			switch (input[1]) {
			case "+":
				Arith add = new Add();
				add.setValue(Integer.parseInt(input[0]), Integer.parseInt(input[2]));
				System.out.println(add.calculate());
				break;
			case "-":
				Arith sub = new Add();
				sub.setValue(Integer.parseInt(input[0]), Integer.parseInt(input[2]));
				System.out.println(sub.calculate());
				break;
			case "*":
				Arith mul = new Add();
				mul.setValue(Integer.parseInt(input[0]), Integer.parseInt(input[2]));
				System.out.println(mul.calculate());
				break;
			case "/":
				Arith div = new Add();
				div.setValue(Integer.parseInt(input[0]), Integer.parseInt(input[2]));
				System.out.println(div.calculate());
				break;

			}
			String line = scanner.nextLine();

			if (line.toLowerCase().equals("quit")) {
				break;
			}

		}

		scanner.close();

	}

}
