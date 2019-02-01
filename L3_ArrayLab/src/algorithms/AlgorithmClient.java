package algorithms;

import java.util.Arrays;

public class AlgorithmClient {
	
	static int[] list = {1,2,4,6,7,9};
	static int[] list1 = {2,4,5,7,8,9};
	
	
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
		for (int i = 0; i < list.length; ++i) {
			if(i > 1) 
				list[i-1] = list[i];
			list[0] = list[list.length-1];
		}
		print(list);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(list);
		System.out.println(getKeyCount(list,2));
		System.out.println(getKeyCount(list,4));
		System.out.println(getKeyCount(list,8));
		System.out.println(indexOf(list,2));
		System.out.println(indexOf(list,7));
		System.out.println(indexOf(list,8));
		print(list1);
		shiftLeft(list1);
	}

}
