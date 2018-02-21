package prob06;

public class Div {

	private int a;
	private int b;

	public Div(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calculate() {

		return a / b;
	}

}
