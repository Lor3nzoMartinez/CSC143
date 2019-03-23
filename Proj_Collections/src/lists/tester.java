package lists;

public class tester {

	public static void main(String[] args) {
		ArrayList list12 = new ArrayList();
		ArrayList list1 = new ArrayList();
		
		for (int i = 1; i < 10; i++) {
			list12.add(i);
		}
		
		System.out.println(list12.toString());
		list12.clear();
		System.out.println(list12.size());
		
	}

}
