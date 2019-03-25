package utility;

import college.Student;
import lists.ArrayList;

public class Query {
	
	public static <T extends Comparable<T>> int binarySearch
	(ArrayList<T> list, T key) {
		int left = 0;
		int right = list.size();

		while (left <= right) {
			int mid = (left + right) / 2;
			if (list.get(mid).compareTo(key) == 0) {
				return mid;
			} else if (list.get(mid).compareTo(key) < 0) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}
	
	public static <T> void bubbleSort
	(ArrayList<T> list, Comparator<T> key) {
		for (int i = 0; i < list.size(); i++)
			for (int j = 0; j < list.size() - 1; j++)
				if (key.compare(list.get(j), list.get(j+1)) < 0) {
					T temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
				}
	}
	
	public static int indexOf(ArrayList<Student> list, String key) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(key)) {
				return i;
			}
		}
		return -1;
	}
	
	public static <T extends Comparable<T>> int partition
	(ArrayList<T> list, int left, int right) {
		 T pivot = list.get(right);  
	     int i = (left-1); 
	        for (int j=left; j<right; j++) {  
	            if (list.get(j).compareTo(pivot) <= 0) {
	                T temp = list.get(i); 
	                list.set(i, list.get(j)); 
	                list.set(j, temp);
	                i++;
	            } 
	        } 

	        T temp = list.get(i+1); 
	        list.set(i+1, list.get(right)); 
	        list.set(right,temp); 
	  
	        return i+1; 
		
	}
	
	public static <T extends Comparable<T>> void quickSort
	(ArrayList<T> list, int left, int right) {
		if (left < right) 
        { 
            int pi = partition(list, left, right); 
  
            quickSort(list, left, pi-1); 
            quickSort(list, pi+1, right); 
        } 
	}

}
