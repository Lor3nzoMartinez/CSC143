package lists;

public interface List<T> {

	public void add(T value);

	public void add(int index, T value);
	
	public T get(int index);

	public int indexOf(T value);
	
	public boolean isEmpty();

	public void remove(int index);
	
	public void set(int index, T value);
	
	public int size();

	public String toString();

}
