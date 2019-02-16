package recusiveAlgorithms;


public class Recursion {

// PROBLEM 1
	public static int factorial(int n) {
		if( n == 1 ) { return n; } 
		
		else { n = factorial(n-1) * n; }
		
		return n;
	}
	
//PROBLEM 2
	public static int fibSequence(int n) {
		
		if(n == 0) { return n; } 
		
		else if(n<3) { n = 0 + 1; } 
		
		else { n = fibSequence(n-1) +fibSequence(n-2); }
		
		return n;
	}
	
//PROBLEM 3
	public static int sumOfPosN(int n) {
		
		if (n > 0) {n = sumOfPosN(n-1) + n ;}
		
		else { return n;}
		
		return n;
		
	}
	
//PROBLEM 4
	public static int sumOfOddPosN(int n) {
		
		if(n <= 1) {return n;}
		
		else if(n % 2 != 0 && n > 0) { 
			n = sumOfOddPosN(n-2) + n ;
			return n;
			
		}
		else { return n;}
		
	}
	
//PROBLEM 5
	public static int twoRaised(int n) {
		
		if(n == 0) { return 1; }
		
		else if(n == 1) { return 2; }
		
		else if(n == 2) { return 2*2; }
		
		else { return twoRaised(n-1)*2; }
		
	}
	
//PROBLEM 6 Part A
	public static Double xRaisedN(double x, double n) {
		if(n <= 0) { return (double) 0; }
		
		else if (n == 1) { return x; }
		
		else if (n == 2) { return x * x; }
		
		else { return xRaisedN(x, n-1) * x; }
	}
	
	
	
//MAIN TESTS
	
	public static void main(String[] args) {
		//Problem #1
		System.out.println("Problem #1 \n");
		for(int i = 1; i < 6; i++)
		System.out.print(i + " factorial is: " + factorial(i) + " \n");
		System.out.println(" ");
		
		//Problem #2
		System.out.println("Problem #2 \n");
		for(int i = 0; i < 9; i++)
		System.out.print("Fib Series of " + i + " : " + fibSequence(i)+ "\n");
		System.out.println(" ");
		
		//Problem #3 
		System.out.println("Problem #3 \n");
		for(int i = 0; i < 9; i++)
		System.out.println("Sum of "+ i + " : " + sumOfPosN(i));
		System.out.println(" ");
		
		//Problem #4
		System.out.println("Problem #4 (FIX ME!)\n");
		for(int i = 0; i < 12; i++)
		System.out.println("Sum of "+ i + " : " +  sumOfOddPosN(i));
		System.out.println(" ");
		
		//Problem #5
		System.out.println("Problem #5 \n");
		for(int i = 0; i < 9; i++)
		System.out.println("Two raised to "+ i + " : " +  twoRaised(i));
		System.out.println(" ");
		
		//Problem #6 Part A
		System.out.println("Problem #6 Part A \n");
		for(int i = 1; i < 5; i++)
		System.out.println(i + ") " + i + " raised to "+ (i-1) + " : " +  xRaisedN(i,i-1));
		System.out.println(" ");
		
		//Problem #6 Part B
		System.out.println("Problem #6 Part B \n");
		double e = Math.exp(1);
		System.out.println(1 + ") " + "e raised to "+ 5 + " : " +  xRaisedN(e,5));
		
	}

}
