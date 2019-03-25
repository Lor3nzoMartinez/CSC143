package listLinker;

public interface Iteration<T>{
	
	public boolean hasNext();
	
	public T next();

	public void remove();
}
