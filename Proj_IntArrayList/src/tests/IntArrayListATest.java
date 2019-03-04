/********************************************************
 * This is a test class for IntArrayList
 ********************************************************/
package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import version_01.IntArrayList;

class IntArrayListATest {

	private IntArrayList testList = new IntArrayList();
	
	/**********************************************
	 * Test method for {@link version_01.IntArrayList#IntArrayList()}.
	 **********************************************/
	
	@Test
	void testIntArrayList() {
		assertEquals(3, testList.DEFAULT_CAPACITY);
		System.out.println("Default constructor test:\n" 
				+ "Check to make sure the "
				+ "\ndefault capacity is 3:\n"
				+ testList.toString()
				+ "\n");
	}
	
	/**********************************************
	 * Test method for {@link version_01.IntArrayList#IntArrayList(int)}.
	 **********************************************/

	@Test
	void testIntArrayListIntArrayList() {
		for (int i = 0; i < 2; i++) {
			testList.add(i);
		}
		assertEquals(2, testList.size());
		System.out.println("Constructor Test:\n"
				+"Test to see if the constructor\n"
				+ "resets the size of the list\n"
				+ "if element is removed or added:\n"
				+ testList.toString()
				+ "\n");
	}
	
	/**********************************************
	 * Test method for {@link version_01.IntArrayList#add(int)}.
	 **********************************************/

	@Test
	void testadd() {
		for (int i = 0; i < 4; i++) {
			testList.add(i);
		}
		assertEquals(4, testList.size());
		System.out.println("Add element test: \n"
				+ "Checks the add methods ability to "
				+ "add integers to our array:\n"
				+ "testList.add(n);\n"
				+ testList.toString() 
				+ "\n");
	}
	
	/**********************************************
	 * Test method for {@link version_01.IntArrayList#add( int, int)}.
	 **********************************************/

	@Test
	void testaddadd() {
		for (int i = 0; i < 5; i++) {
			testList.add(i);
		}
		testList.add(1, 91);
		assertEquals(91, testList.get(1));
		System.out.println("Add at index test: \n" 
				+ "Checks the ability to insert integer in\n"
				+ "the array at specified index: \n"
				+ "testList.add(1, 91);\n"
				+ testList.toString()
				+ "\n");
	}
	
	/**********************************************
	 * Test method for {@link version_01.IntArrayList#remove(int)}.
	 **********************************************/
	
	@Test
	void testremove() {
		for (int i = 0; i < 5; i++) {
			testList.add(i);
		}
		testList.remove(1);
		assertEquals(4, testList.size());
		System.out.println("Remove element test: \n" 
				+ "Checks removes ability to delete\n"
				+ "a integer at specified index: \n"
				+ "testList.remove(1);\n"
				+ testList.toString()
				+ "\n");
	}
	
	/**********************************************
	 * Test method for {@link version_01.IntArrayList#get(int)}.
	 **********************************************/
	
	@Test
	void testget() {
		for (int i = 0; i < 5; i++) {
			testList.add(i);
		}
		assertEquals(2, testList.get(2));
		System.out.println("Get method test:\n"
				+ "Check the ability to get current\n"
				+ "integer at specified index:\n"
				+ testList.toString()
				+ "\ntestList.get(3); = "
				+ testList.get(3)
				+ "\n");
	}
	
	/**********************************************
	 * Test method for {@link version_01.IntArrayList#size()}.
	 **********************************************/
	
	@Test
	void testsize() {
		for (int i = 0; i < 5; i++) {
			testList.add(i);
		}
		assertEquals(5, testList.size());
		System.out.println("Size of test: \n" 
				+ "Checks size method to return "
				+ "\nproper size of array:\n"
				+ testList.toString() 
				+ "\ntestList.size(); = "
				+ testList.size()
				+ "\n");
	}
	
	/**********************************************
	 * Test method for {@link version_01.IntArrayList#toString()}.
	 **********************************************/

	@Test
	void testtoString() {
		for (int i = 0; i < 4; i++) {
			testList.add(i);
		}
		assertEquals("[0, 1, 2, 3]", testList.toString());
		System.out.println("To String test:\n"
				+ "Prints current content of array:\n"
				+ "testList.toString();\n"
				+ testList.toString() 
				+ "\n");
	}
	
	/**********************************************
	 * Test method for {@link version_01.IntArrayList#indexOf(int)}.
	 **********************************************/
	
	@Test
	void testindexOf() {
		for (int i = 4; i > 1; i--) {
			testList.add(i);
		}
		assertEquals(1, testList.indexOf(3));
		System.out.println("Index Of Test:\n"
				+ "Returns the Index of the "
				+ "designated Integer:\n"
				+ testList.toString()
				+ "\ntestList.indexOf(3); = "
				+ testList.indexOf(3) 
				+ "\n");
	}
}
