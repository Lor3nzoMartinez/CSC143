
public class Solution {
	
	public static int flipLights(int n, int m) {
		if( m == 1 ) { return m + n; }
		else if( n == 1 ) { return  m; }
		else if( n==0 || m==0 ) { return m+n; }
		else { return m*n; }
    }
	
	
	public static void main(String[] args) {
		
		// Tester
		for (int i = 1; i < 10; i++)
			for (int c = 1; c < 10; c++)
				for (int Counter = 0; Counter < c; Counter++) {
					System.out.print("For "+i+" and "+c+ " : "+ flipLights( i , c ));
					if(Counter % 5 == 0) {
						System.out.println(" ");}
					}
	}
	
	

}
