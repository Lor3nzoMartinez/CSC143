package playGround;

public class heapersCreapers {

	public static void sumOdd(int n) {
		int heps = 0;
		int previ = 0;

		for (int i = 0; i < n * 2; i++) {
			if (i % 2 != 0) {
				heps = i + previ;
				previ = heps;
			}

		}

		System.out.println(heps);
	}

	public static void main(String[] args) {
		sumOdd(5);
	}

}
