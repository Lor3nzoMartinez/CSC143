package algorithms;

import java.util.Arrays;


public class AlgorithmClient {
	
	static int[] list1 = {1,2,4,6,9};
	static int[] list2 = {1,2,8,2,7,4,2,6,8,7,8,4,2,4,2,4,9};
	static int[] list3 = {1,2,4,6,7,9};
	static int[] list4 = {2,4,5,7,8,9};
	static int[] list5 = {2,4,5,7,8,9};
	static int[] list6 = {1,2,4,5,7,8,9};
	static int[] list7 = {2,9,5,4,8,1,6};
	static int[] list8 = {2,9,5,4,8,1,6};
	
	
	
	
	public static void print (int[] list) {
		System.out.println(Arrays.toString(list));
	}

	public static int getKeyCount(int[] list, int key) {
		int count = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] == key)
				count = count + 1;
		}
		return count;
	}

	public static int indexOf(int[] list, int key) {
		int count = -1;
		for (int i = 0; i < list.length; ++i) {
			if(list[i]==key) 
				count = i+1;
		}
		return count;
		
	}
	
	public static void shiftLeft(int[] list) {
		int last = list[0];
		for (int i = 0; i < list.length-1; ++i) {
			list[i] = list[i+1];
			}
		list[list.length-1] = last;
		print(list);
	}
	
	public static void helperShiftLeft(int[] list) {
		int last = list[0];
		for (int i = 0; i < list.length-1; ++i) {
			list[i] = list[i+1];
			}
		list[list.length-1] = last;
		//print(list);
	}
	
	public static void shiftRight(int[] list) {
		for (int i = 0; i < list.length-1; ++i) {
			helperShiftLeft(list);
		}
		print(list);
	}
	
	public static void helperShiftRight(int[] list) {
		for (int i = 0; i < list.length-1; ++i) {
			helperShiftLeft(list);
		}
		//print(list);
	}
	
	public static void insert(int[] list) {
		int [] saveList =new int[list.length+1];
		helperShiftRight(list);
		for (int firstHalf = 0; firstHalf < list.length/2; ++firstHalf) {
			saveList[firstHalf] = list[firstHalf];
		}
		for (int lastHalf = 4; lastHalf < list.length+1; ++lastHalf) {
			saveList[lastHalf] = list[lastHalf-1];
		}
		print(saveList);
	}
	
	public static void selectionSort(int[] list) {
		int [] saveList =new int[1];
		for (int x = 0; x < list.length-1; ++x) {
			if (list[x] < list[x+1]) {
				saveList[0] = list[x];
			}
		}
		print(saveList);
	}
	
	public static void descendingSort(int[] list) {
		int [] saveList = new int[list.length];
		for (int i = 0; i < list.length; i++) {
			for (int l = 0; l < list.length; l++) {
				if (list[i] < list[l]) {
					saveList[l] = list[i];
					
				}
			}
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Problem 1
		System.out.println("Problem #1");
		print(list1);
		System.out.println("\n");
		
		//Problem 2
		System.out.println("Problem #2");
		System.out.println(getKeyCount(list2,2));
		System.out.println(getKeyCount(list2,4));
		System.out.println(getKeyCount(list2,8));
		System.out.println("\n");
		
		//Problem 3
		System.out.println("Problem #3");
		System.out.println(indexOf(list3,2));
		System.out.println(indexOf(list3,7));
		System.out.println(indexOf(list3,8));
		System.out.println("\n");
		
		//Problem 4
		System.out.println("Problem #4");
		print(list4);
		shiftLeft(list4);
		System.out.println("\n");
		
		//Problem 5
		System.out.println("Problem #5");
		print(list5);
		shiftRight(list5);
		System.out.println("\n");
		
		//Problem 6
		System.out.println("Problem #6");
		print(list6);
		insert(list6);
		System.out.println("\n");
		
		//Problem 7
		System.out.println("Problem #7");
		print(list7);
		selectionSort(list7);
		System.out.println("\n");
		
		//Problem 8
		System.out.println("Problem #8");
		print(list8);
		descendingSort(list8);
		
	}

}
