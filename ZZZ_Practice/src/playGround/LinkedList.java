package playGround;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import listLinker.LinkedList;
import listLinker.LinkedList.Node;

public class LinkedList<T> implements List<T> {
	private int size; // number of elements on list
	private Node<T> pre; // sentinel before first item
	private Node<T> post; // sentinel after last item
	private Node<T> lastAccessed = null;
	private Node<T> current = pre.next;

	public LinkedList() {
		pre = new Node<T>();
		post = new Node<T>();
		pre.next = post;
		post.prev = pre;
	}
	
	public LinkedList(Node<T> front) {
		
	}

	public void add(T data) {
		Node<T> last = post.prev;
		Node<T> x = new Node<T>();
		x.data = data;
		x.next = post;
		x.prev = last;
		post.prev = x;
		last.next = x;
		size++;
	}

	public void add(int index, T value) {
		if (list.length < this.size + 1) {
			list = copyOf(list, size + 1);
			size++;
		}

		for (int i = index; i < this.size; i++) {
			T temp = list[i];
			list[i] = value;
			value = temp;
		}
	}

	public boolean isEmpty() {
		return size == 0;
	}
	
	public void remove() {
		if (lastAccessed == null)
			throw new IllegalStateException();
		Node<T> x = lastAccessed.prev;
		Node<T> y = lastAccessed.next;
		x.next = y;
		y.prev = x;
		size--;
		if (current == lastAccessed)
			current = y;
		else
			index--;
		lastAccessed = null;
	}

	public int size() {
		return size;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (T data : this)
			s.append(data + " ");
		return s.toString();
	}
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(T value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set(int index, T value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkIndex(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(T value) {
		// TODO Auto-generated method stub
		return false;
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
	
	private class Node<T><E> {
		private E data;
		private Node<T> next;
		private Node<T> prev;
	}

	private class DoublyLinkedListIterator implements ListIterator<T> {
		private Node<T> current = pre.next;
		
		private int index = 0;

		public boolean hasNext() {
			return index < size;
		}

		public boolean hasPrevious() {
			return index > 0;
		}

		public int previousIndex() {
			return index - 1;
		}

		public int nextIndex() {
			return index;
		}

		public T next() {
			if (!hasNext())
				throw new NoSuchElementException();
			lastAccessed = current;
			T item = current.data;
			current = current.next;
			index++;
			return item;
		}

		public T previous() {
			if (!hasPrevious())
				throw new NoSuchElementException();
			current = current.prev;
			index--;
			lastAccessed = current;
			return current.data;
		}
		
		public void set(T data) {
			if (lastAccessed == null)
				throw new IllegalStateException();
			lastAccessed.data = data;
		}
		
		public void remove() {
			if (lastAccessed == null)
				throw new IllegalStateException();
			Node<T> x = lastAccessed.prev;
			Node<T> y = lastAccessed.next;
			x.next = y;
			y.prev = x;
			size--;
			if (current == lastAccessed)
				current = y;
			else
				index--;
			lastAccessed = null;
		}

		public void add(T data) {
			Node<T> x = current.prev;
			Node<T> y = new Node<T>();
			Node<T> z = current;
			y.data = data;
			x.next = y;
			y.next = z;
			z.prev = y;
			y.prev = x;
			size++;
			index++;
			lastAccessed = null;
		}
	}
}