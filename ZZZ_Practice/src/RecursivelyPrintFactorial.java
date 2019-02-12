

public class RecursivelyPrintFactorial {

	
// Problem starString
	public static String starString(int n){
		
		if(n < 0) { throw new IllegalArgumentException("n must be positive"); }
		
		else if (n == 0) {return "*";}
		
		else{ return starString(n-1) + starString(n-1); }

		}
	
// Problem writeNums
	public static void writeNums(int n) {
	    if (n < 1) {
	        throw new IllegalArgumentException();
	    } else if (n == 1) {
	        System.out.print("1");
	    } else {
	        writeNums(n - 1);
	        System.out.print(", " + n);
	    }
	}

// Problem Symmetry
	public static void writeSequence(int n) {
	    if (n < 1) {
	        throw new IllegalArgumentException();
	    } else if (n == 1) {
	        System.out.print("1 ");
	    } else {
	        System.out.print((n + 1) / 2 + " ");
	        if (n != 2) {
	            writeSequence(n - 2);
	        }
	        System.out.print((n + 1) / 2 + " ");
	    }
	}
	
// Problem writeChars
	public static void writeChars(int n) {
		if (n < 1) { throw new IllegalArgumentException(); }
		
		else if (n == 1) { System.out.print("*"); }
		
		else if (n == 2) { System.out.print("**"); }
		
		else {
			System.out.print("<");
			writeChars(n-2);
			System.out.print(">");
		}
	}

// Problem multiplyEvens
	public static void multiplyEvens(int n) {
		
	}

	
// TESTS
   public static void main (String [] args) {
	   
	   //Test starString
	   for (int i = 0; i < 5; i++)
		   System.out.println("2 raised to " + i + " : " + starString(i));
	   
	   System.out.println(" ");
	   
	   //Test writeNums
	   writeNums(5);
	   System.out.println(" \n");
	   
	   //Test writeSequence
	   writeSequence(5);
	   System.out.println(" \n");
	   
	   //Test writeChars
	   for (int i = 1; i < 9; i++) {
		   System.out.print(i + " is : ");
		   writeChars(i);
		   System.out.print( " \n");
		   }
	   System.out.println(" \n");
	   
	   //Test writeSequence
	   multiplyEvens(5);
	   System.out.println(" \n");
	   		
	   
   	}
}