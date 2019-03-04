package tests;

import version_01.IntArrayList;

public class tester {

	public static void main(String[] args) {
		IntArrayList list12 = new IntArrayList();

		for (int i = 1; i < 5; i++) {
			list12.add(i);
		}
	
		// Remove
		System.out.println("Remove the 3: \n" + list12.toString());
		list12.remove(4);
		System.out.println(list12.toString() + "\n");

		// Add
		System.out.println("Adds 91 to index 3: \n" + list12.toString());
		list12.add(3, 91);
		System.out.println(list12.toString() + "\n");

		// Add
		System.out.println("Adds 11 to array: \n" + list12.toString());
		list12.add(12);
		System.out.println(list12.toString() + "\n");

		// Size
		System.out.println("Prints size: \n" + list12.toString());
		System.out.println("List size: " + list12.size() + "\n");

		// indexOf
		System.out.println("Prints index of 91: \n" + list12.toString());
		System.out.println("Index of 91 is: " + list12.indexOf(91) + "\n");

	}

}
