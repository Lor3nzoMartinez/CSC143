package starter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class csvReader {
	
	public static void print (int[] list) {
		System.out.println(Arrays.toString(list));
	}
	
	public static String importer() {
		String fileName = ("C:/Users/Loren/Downloads/EndothermyLabCopy.csv");
		File file = new File(fileName);
		ArrayList listOfCounts = new ArrayList();
		ArrayList<String> listOfDates = new ArrayList();
		String[] values = null;
		try {
			Scanner inputStream = new Scanner(file);
			while (inputStream.hasNext()) {
				String data = inputStream.nextLine();
				values = data.split(",");
			}
		} catch (FileNotFoundException e) {
			System.out.println("Wrong file path!");
		}
		
		return Arrays.toString(values);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(importer());
	}

}
