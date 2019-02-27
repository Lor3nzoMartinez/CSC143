package recusiveAlgorithms;

public class Recursion {

// PROBLEM 1
	public static int factorial(int n) {
		if (n == 1) {
			return n;
		}

		else {
			n = factorial(n - 1) * n;
		}

		return n;
	}

	public static int factorialIt(int n) {
		for (int i = n - 1; i > 0; i--) {
			n = n * i;
		}
		return n;
	}

//PROBLEM 2
	public static int fibSequence(int n) {

		if (n == 0) {
			return n;
		}

		else if (n < 3) {
			n = 0 + 1;
		}

		else {
			n = fibSequence(n - 1) + fibSequence(n - 2);
		}

		return n;
	}

	public static int fibSequenceIt(int n) {

		if (n == 0) {
			return n;
		}

		else {
			int f[] = new int[n + 2];

			f[0] = 0;
			f[1] = 1;

			for (int i = 2; i <= n; i++) {
				f[i] = f[i - 1] + f[i - 2];
			}

			return f[n];

		}
	}

//PROBLEM 3
	public static int sumOfPosN(int n) {

		if (n > 0) {
			n = sumOfPosN(n - 1) + n;
		}

		else {
			return n;
		}

		return n;

	}

	public static int sumOfPosNIt(int n) {
		for (int i = n - 1; i > 0; i--) {
			n = n + i;
		}

		return n;
	}

//PROBLEM 4
	public static int sumOfOddPosN(int n) {

		if (n < 0) {
			throw new IllegalArgumentException();
		}

		else if (n == 0) {
			n = 1;
		}

		else if (n % 2 != 0) {
			return 2 * (n + 1) + sumOfOddPosN(n - 1);
		}

		else {
			return sumOfOddPosN(n - 1);
		}

		return n;
	}

	public static int sumOfOddPosNIt(int n) {
		int heps = 0;
		int previ = 0;

		if (n == 0) {
			return 0;
		}

		else if (n > 0) {
			for (int i = 0; i < n * 2; i++) {
				if (i % 2 != 0) {
					heps = i + previ;
					previ = heps;
				}

			}
			return heps;
		}

		else {
			return n;
		}

		/*
		 * if(n < 0) { throw new IllegalArgumentException();}
		 * 
		 * else if (n == 0) { n = 0; return n; }
		 * 
		 * else { int sum = 1; for (int i = 1; i <= n; i++) { if (i % 2 != 0) { sum =
		 * sum + i+2; } } return sum; }
		 */
	}

//PROBLEM 5
	public static int twoRaised(int n) {

		if (n == 0) {
			return 1;
		}

		else if (n == 1) {
			return 2;
		}

		else if (n == 2) {
			return 2 * 2;
		}

		else {
			return twoRaised(n - 1) * 2;
		}

	}

	public static int twoRaisedIt(int n) {
		int heps = 1;

		if (n == 0) {
			return 1;
		}

		else if (n == 1) {
			return 2;
		}

		else if (n == 2) {
			return 2 * 2;
		}

		else {
			for (int i = 0; i < n; i++) {
				heps *= 2;
			}
		}

		return heps;
	}

//PROBLEM 6
	public static Double xRaisedN(double x, double n) {
		if (n <= 0) {
			return (double) 0;
		}

		else if (n == 1) {
			return x;
		}

		else if (n == 2) {
			return x * x;
		}

		else {
			return xRaisedN(x, n - 1) * x;
		}
	}

	public static Double xRaisedNIt(double x, int n) {
		double heps = 1;

		if (n <= 0) {
			return (double) 0;
		}

		else if (n == 1) {
			return x;
		}

		else if (n == 2) {
			return x * x;
		}

		else {
			for (int i = 0; i < n; i++) {
				heps *= x;
			}
		}
		return heps;
	}

//MAIN TESTS

	public static void main(String[] args) {
		// Problem #1
		System.out.println("Problem #1 \n");
		for (int i = 1; i < 6; i++)
			System.out.print(i + " factorial is: " + factorial(i) + " \n");
		System.out.println(" ");

		System.out.println("Problem #1 It\n");
		for (int i = 1; i < 6; i++)
			System.out.print(i + " factorial is: " + factorialIt(i) + " \n");
		System.out.println(" ");

		// Problem #2
		System.out.println("Problem #2 \n");
		for (int i = 0; i < 9; i++)
			System.out.print("Fib Series of " + i + " : " + fibSequence(i) + "\n");
		System.out.println(" ");

		System.out.println("Problem #2 It \n");
		for (int i = 0; i < 9; i++)
			System.out.print("Fib Series of " + i + " : " + fibSequenceIt(i) + "\n");
		System.out.println(" ");

		// Problem #3
		System.out.println("Problem #3 \n");
		for (int i = 0; i < 9; i++)
			System.out.println("Sum of " + i + " : " + sumOfPosN(i));
		System.out.println(" ");

		System.out.println("Problem #3 It \n");
		for (int i = 0; i < 9; i++)
			System.out.println("Sum of " + i + " : " + sumOfPosNIt(i));
		System.out.println(" ");

		// Problem #4
		System.out.println("Problem #4\n");
		for (int i = 0; i < 12; i++)
			System.out.println("Sum of " + i + " : " + sumOfOddPosN(i));
		System.out.println(" ");

		// Problem #4
		System.out.println("Problem #4 It\n");
		for (int i = 0; i < 12; i++)
			System.out.println("Sum of " + i + " : " + sumOfOddPosNIt(i));
		System.out.println(" ");

		// Problem #5
		System.out.println("Problem #5 \n");
		for (int i = 0; i < 9; i++)
			System.out.println("Two raised to " + i + " : " + twoRaised(i));
		System.out.println(" ");

		// Problem #5
		System.out.println("Problem #5 It\n");
		for (int i = 0; i < 9; i++)
			System.out.println("Two raised to " + i + " : " + twoRaisedIt(i));
		System.out.println(" ");

		// Problem #6 Part A
		System.out.println("Problem #6 Part A \n");
		for (int i = 1; i < 5; i++)
			System.out.println(i + ") " + i + " raised to " + (i - 1) + " : " + xRaisedN(i, i - 1));
		System.out.println(" ");

		// Problem #6 Part A
		System.out.println("Problem #6 Part A It \n");
		for (int i = 1; i < 5; i++)
			System.out.println(i + ") " + i + " raised to " + (i - 1) + " : " + xRaisedNIt(i, i - 1));
		System.out.println(" ");

		// Problem #6 e Raised X
		System.out.println("Problem #6 Part B \n");
		double e = Math.exp(1);
		System.out.println(1 + ") " + "e raised to " + 5 + " : " + xRaisedN(e, 5));
	}

}
