package listLinker;

import java.util.Iterator;

public class LinkedList<T> implements List<T> {
	
	private T[] list;
	private int size;
	private Node<T> front;
	
	public LinkedList() {
		size = this.size;
		front = this.front;
	}
	
	public LinkedList(Node front) {
		this.front = front;
		size = 0;
	}

	public void add(T value) {
		if (front == null) {
			front = new Node<T>(value,front, front);
		}
		else {
			Node<T> current = front;
			while (current.next != null){
				current = current.next;
			}
			current.next = new Node<T>(value);
		}
	}

	public void add(int index, T value) {
		if (index == 0) {
			front = new Node<T> (value, front, front);
		}
		else {
			Node<T> current = nodeAt(index -1);
			current.next = new Node<T>(value, current.next, current.next);
		}
	}

	private void checkIndex(int index) {
		if (index == -1) {
			throw new IndexOutOfBoundsException();
		} 
		return ;
	}

	public void clear() {
		size.remove<T>();
	}

	public boolean contains(T value) {
		return true;
	}

	public T get(int index) {
		return nodeAt(index).data;
	}

	public int indexOf(T value) {
		int index = 0;
		Node<T> current = front;
		while (current.next !=  null) {
			if (current.data == value) {
				return index;
			}
			index++;
			current = current.next;
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
		if (index == 0) {
			front = front.next;
		}
		else {
			Node<T> current = nodeAt(index-1);
			current.next = current.next.next;
		}
	}

	public void set(int index, T value) {
		if (index > 0 && index < size) {
			list[index] = value;
		}
	}

	public int size() {
		int count = 0;
		Node<T> current = front;
		while (current != null) {
			current = current.next;
			count++;
		}
		return count;
	}

	public String toString() {
		if(front == null) {
			return "[]";
		}
		else {
			String result = "[" + front.data;
			Node<T> current = front.next;
			while (current != null) {
				result += ", " + current.data;
				current = current.next;
			}
			result += " ]";
			return result;
		}
	}

	public class LinkedIterator implements Iterator<T> {

		private int index;
		private boolean ableToRemove;

		public LinkedIterator(LinkedList<T> list) {
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
				LinkedList.this.remove(index - 1);
				index--;
			}
		}
	}
	
	private Node<T> nodeAt(int index) {
		Node<T> current = front;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current;
	}
	
	public class Node<E> {
		
		private E data;
		private Node<E> next;
		private Node<E> prev;
		
		public Node(E data, Node<E> next , Node<E> prev) {
			data = this.data;
			next = this.next;
			prev = this.prev;
		}
	}
}
