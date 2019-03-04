package version_01;

import java.util.Arrays;

public class IntArrayList {

	private int size;
	private int[] element;

	public static int DEFAULT_CAPACITY = 3;
	public static int NOT_FOUND = -1;

	public IntArrayList() {
		this(DEFAULT_CAPACITY);
	}

	public IntArrayList(int holder) {
		this.element = new int[holder];
		size = 0;
	}

	public void add(int value) {
		if (element.length < this.size + 1) {
			element = copyOf(element, size + 1);
		}
		element[size++] = value;
	}

	public void add(int index, int value) {
		if (element.length < this.size + 1) {
			element = copyOf(element, size + 1);
			size++;
		}

		for (int i = index; i < this.size; i++) {
			int temp = element[i];
			element[i] = value;
			value = temp;
		}
	}

	public static int[] copyOf(int[] data, int length) {
		int[] newArray = new int[length];
		for (int i = 0; i < newArray.length - 1; i++) {
			newArray[i] = data[i];
		}
		if (data.length > newArray.length) {
			newArray[newArray.length - 1] = data[data.length - 1];
		}
		return newArray;
	}

	public void remove(int index) {
		for (int i = index; i < this.size - 1; i++) {
			element[i] = element[i + 1];
		}
		this.size--;
		element = copyOf(element, size);
	}

	public int get(int index) {
		return this.element[index];
	}

	public int size() {
		return this.size;
	}

	public String toString() {
		return Arrays.toString(element);
	}

	public int indexOf(int value) {
		for (int i = 0; i < this.size; i++) {
			if (element[i] == value) {
				return i;
			}
		}
		return -1;
	}

}
