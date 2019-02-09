package recusiveAlgorithms;

public class Recursion {

	public static int factorial(int n) {
		if( n == 1 ) { return n; } 
		
		else { n = factorial(n-1) * n; }
		
		return n;
	}
	
	public static int fibSequence(int n) {
		int previous = 0;
		int secPrevious = 1;
		
		if(n == 0) { return n; } 
		
		else if(n<3){ n = previous + secPrevious;} 
		
		else {
			previous = fibSequence(n-1);
			secPrevious = fibSequence(n-2);
			n = previous + secPrevious;
			}
		
		return n;
	}
	
	
	
	
	public static void main(String[] args) {
		//Problem #1
		System.out.print(factorial(5));
		System.out.println(" \n");
		
		//Problem #2
		for(int i = 0; i < 25; i++)
		System.out.print("Fib Series of " + i + " : " + fibSequence(i)+ "\n");
		System.out.println(" ");
		
		//Problem #3 
		
	}

}
