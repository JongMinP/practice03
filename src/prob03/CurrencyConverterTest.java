package prob03;

public class CurrencyConverterTest {

	public static void main(String[] args) {
		// 환율을 세팅 합니다.
		CurrencyConverter.setRate(123);

		System.out.println("백만원은 : " + CurrencyConverter.toDollar(1000000) + "달러입니다.");
		System.out.println("백달러는 : " + CurrencyConverter.toKRW(100) + "원입니다.");

	}

}
