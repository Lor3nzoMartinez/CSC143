package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgorithmClient {
	
	static int[] list1 = {1,2,4,6,9};
	static int[] list2 = {1,2,8,2,7,4,2,6,8,7,8,4,2,4,2,4,9};
	static int[] list3 = {1,2,4,6,7,9};
	static int[] list4 = {2,4,5,7,8,9};
	static int[] list5 = {2,4,5,7,8,9};
	static int[] list6 = {1,2,4,5,7,8,9};
	
	
	
	
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
		for (int firstHalf = 0; firstHalf < list.length/2; ++firstHalf) {
			saveList[firstHalf] = list[firstHalf];
		}
		for (int lastHalf = 4; lastHalf < list.length; ++lastHalf) {
			saveList[lastHalf] = list[lastHalf-1];
		}
		print(saveList);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Problem 1
		print(list1);
		System.out.println("\n");
		
		//Problem 2
		System.out.println(getKeyCount(list2,2));
		System.out.println(getKeyCount(list2,4));
		System.out.println(getKeyCount(list2,8));
		System.out.println("\n");
		
		//Problem 3
		System.out.println(indexOf(list3,2));
		System.out.println(indexOf(list3,7));
		System.out.println(indexOf(list3,8));
		System.out.println("\n");
		
		//Problem 4
		print(list4);
		shiftLeft(list4);
		System.out.println("\n");
		
		//Problem 5
		print(list5);
		shiftRight(list5);
		System.out.println("\n");
		
		//Problem 6
		print(list6);
		insert(list6);
	}

}
