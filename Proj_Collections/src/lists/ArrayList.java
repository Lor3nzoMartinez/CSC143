package lists;

import java.util.Iterator;

@SuppressWarnings("unchecked")

public class ArrayList<T> implements List<T> {

	private int size;
	private T[] element;

	public static int DEFAULT_CAPACITY = 3;
	public static int NOT_FOUND = -1;

	public ArrayList() {
		this(DEFAULT_CAPACITY);
	}

	public ArrayList(int holder) {
		this.element = ((T[]) new Object[holder]);
		size = 0;
	}

	public void add(T value) {
		if (element.length < this.size + 1) {
			element = copyOf(element, size + 1);
		}
		element[size++] = value;
	}

	public void add(int index, T value) {
		if (element.length < this.size + 1) {
			element = copyOf(element, size + 1);
			size++;
		}

		for (int i = index; i < this.size; i++) {
			T temp = element[i];
			element[i] = value;
			value = temp;
		}
	}

	private void checkIndex(int index) {
		if (index > 0 && index < size) {
			System.out.println("isValid");
		} else {
			throw new IndexOutOfBoundsException();
		}
	}

	public void clear() {
		for (int i = 0; i < element.length; i++) {
			this.size--;
		}
	}

	public boolean contains(T value) {
		for (int i = 0; i < element.length; i++) {
			if (element[i] == value) {
				return true;
			}
		}
		return false;
	}

	public T[] copyOf(T[] data, int length) {
		T[] newArray = (T[]) new Object[length];
		for (int i = 0; i < newArray.length - 1; i++) {
			newArray[i] = data[i];
		}
		if (data.length > newArray.length) {
			newArray[newArray.length - 1] = data[data.length - 1];
		}
		return newArray;
	}

	public void ensureCapacity(int capacity) {
		//TODO
	}

	public T get(int index) {
		return this.element[index];
	}

	public int indexOf(T value) {
		for (int i = 0; i < this.size; i++) {
			if (element[i] == value) {
				return i;
			}
		}
		return -1;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	public void remove(int index) {
		for (int i = index; i < this.size - 1; i++) {
			element[i] = element[i + 1];
		}
		this.size--;
		element = copyOf(element, size);
	}

	public void set(int index, T value) {
		if (index > 0 && index < size) {
			element[index] = value;
		}
	}

	public int size() {
		return this.size;
	}

	public String toString() {
		int counter = 0;

		System.out.print("[");

		while (size - 1 > counter) {
			System.out.print(element[counter] + ",");
			counter++;
		}

		return element[size] + "]";
	}

	public class ArrayIterator implements Iterator<T> {

		private int index;
		private boolean ableToRemove;

		public ArrayIterator(ArrayList<T> list) {
			this.index = 0;
			this.ableToRemove = false;
		}

		@Override
		public boolean hasNext() {
			return (index <= size);
		}

		@Override
		public T next() {
			index++;
			return get(index - 1);
		}

		public void remove() {
			if (ableToRemove) {
				ArrayList.this.remove(index - 1);
				index--;
			}
		}
	}
}
