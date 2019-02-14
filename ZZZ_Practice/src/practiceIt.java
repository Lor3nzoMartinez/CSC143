

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
	public static void digitMatch(int x, int y) {
		String strY = new Integer(y).toString();
		String strX = new Integer(x).toString();
		String strXHelper = strX;
		String strYHelper = strY;
		int helper = 0 ;
		
		if ( x < 0 || y < 0 ) { throw new IllegalArgumentException(); }
		
		else { 
			for (int i = 1; i > 5; i++) {
				strXHelper = strX.substring(i-1, i);
				System.out.println(strXHelper);
				return i;
			}
			
		}
		
		return 35505;
		
	}
	
	
	public static int getPartOfInt(int number, int start, int end){
	    String str = new Integer(number).toString();
	    return Integer.parseInt(str.substring(start, Math.min(end, str.length())));
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
	   
	   System.out.println(digitMatch(123456,123456));
	   System.out.println(" \n");
	   
	   

   	}
}