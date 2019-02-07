

public class Practice {

    public static String play(int number) {

        if (number == 0) throw new IllegalArgumentException("Number must not be 0");
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";


        return String.valueOf(number);
    }
    


public static void main(String [] args) {
	
	for (int i = 1; i < 100; i++) {
		System.out.print(play(i) + "    ");
		if( i%17 == 0) {
			System.out.println(" ");
		}
	}
	}
}