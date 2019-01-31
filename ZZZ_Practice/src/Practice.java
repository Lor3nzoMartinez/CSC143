import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = new int[10];
		
		for (int x = 0; x < numbers.length; x++)
			numbers[x] = x;
		
		System.out.print(Arrays.equals(numbers, numbers));

	}

}
