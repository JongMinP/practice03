package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String[] input = scanner.nextLine().split(" ");

			switch (input[1]) {
			case "+":
				Add add = new Add(Integer.parseInt(input[0]), Integer.parseInt(input[2]));
				System.out.println(add.calculate());
				break;
			case "-":
				Sub sub = new Sub(Integer.parseInt(input[0]), Integer.parseInt(input[2]));
				System.out.println(sub.calculate());
				break;
			case "*":
				Mul mul = new Mul(Integer.parseInt(input[0]), Integer.parseInt(input[2]));
				System.out.println(mul.calculate());
				break;
			case "/":
				Div div = new Div(Integer.parseInt(input[0]), Integer.parseInt(input[2]));
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
