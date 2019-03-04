package lists;

import javax.swing.plaf.synth.SynthSeparatorUI;

public interface List<T> {

	public static void add(T value) {
		System.out.println();
	}

	public static void add(int index, T value) {
		System.out.println();
	}

	public static int indexOf(T value) {
		return 0;
	}

	public static void remove(int index) {
		System.out.println();
	}

	public static int size() {
		return 0;
	}

	public String toString() {
		return "";
	}

}
