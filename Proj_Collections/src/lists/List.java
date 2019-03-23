package lists;

import javax.swing.plaf.synth.SynthSeparatorUI;

public interface List<T> {

	public void add(T value);

	public void add(int index, T value);

	public int indexOf(T value);

	public void remove(int index);

	public int size();

	public String toString();

}
