

public class practiceIt {

	
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
	public static int multiplyEvens(int n) {
		
		if (n < 1) { throw new IllegalArgumentException();}
		
		else if (n == 1) { n = 2; }
		
		else {
			n = n * 2 * multiplyEvens(n-1);
		}
		
		return n;
	}

// Problem sumTo
	public static double sumTo(int n) {
			double holder = 0;
			
			if (n < 0) { throw new IllegalArgumentException(); }
			
			else if (n == 0) { return 0.0; }
			
			else { 
				holder = n ; 
				return 1/holder + sumTo(n-1) ;
			}
			
		}
		
// Problem digitMatch
	public static int digitMatch(int a, int b) {
	    if (a < 0 || b < 0) {
	        throw new IllegalArgumentException();
	    } else if (a == 0 && b == 0) {
	        return 1;
	    } else {
	        int result = 0;
	        if (a % 10 == b % 10) {
	            result++;
	        }
	        if (a / 10 == 0 || b / 10 == 0) {
	            return result;
	        }
	        return result + digitMatch(a / 10, b / 10);
	    }    
	}
	
// Problem repeat
	public static String repeat(String a, int n) {
		if ( n < 0 ) { throw new IllegalArgumentException(); }
		
		else if ( n == 0 ) { return ""; }
		
		else {
			int num = n % 10;
			String temp = "";
			for(int i = 0; i < num-1; i++) {
				temp += a;
			}
			if( n >= 10 ) {
				for (int i = 0; i < 9; i++) {
					a += a;
				}
			}
			return temp + a + repeat( a, n / 10);
		}
		
	}

// Problem isReversed
	public static boolean isReversed(String a, String b) {
		if(a.length() == b.length()) {
			 return true;
		}
		
		else if(a.length() != b.length()) {
			return false;
		}
		
		else {
			return false;
		}
		
	}
	
	public static int helps(int n) {
		if (n == 1) {
	        return 1;
	    } 
		
		else {
	        helps(n - 1);
	        return n;
	    }
		
	}

// Problem printNums
	public static String printNums(int nums) {
		String convert = Integer.toString(nums);
		if(nums == 1) {
			return "1";
		}
		
		else {
			System.out.print(convert);
			return printNums(nums-1);
		}
	
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
	   for (int i = 1; i < 8; i++) {
		   System.out.println(multiplyEvens(i));
	   }  
	   System.out.println(" \n");
	   
	   //Test sumTo
	   for (int i = 1; i < 6; i++) {
		   System.out.println(sumTo(i));
	   }  
	   System.out.println(" \n");
	   
	   //Test digitMatch
	   System.out.println(" \n" + digitMatch(38, 34) + " \n" + digitMatch(5, 5552) + " \n" +
	   digitMatch(892, 892) + " \n" + digitMatch(298892, 7892) + " \n" + digitMatch(380, 0)
	   + " \n" + digitMatch(123456, 654321) + " \n" + digitMatch(1234567, 67));
	   System.out.println(" \n");
	   
	   //Test repeat
	   System.out.println(repeat("hello",3));
	   
	   //Test isReversed
	   System.out.println(printNums(5));

   	}
}