import java.util.Arrays;

public class searchAlgo {

	public static void print(int[] list) {
		System.out.println(Arrays.toString(list));
	}

	public static int linearSearch(int[] list, int n) {
		int counter = -1;
		for (int i = 0; i < list.length; i++) {
			counter++;
			if (n == list[i]) {
				return counter;
			}
		}

		return -1;
	}

	public static int maxSize(int[] list) {
		int keeper = 0;
		for (int i = 0; i < list.length; i++) {
			if (keeper < list[i]) {
				keeper = list[i];
			}
		}

		return keeper;
	}

	public static int binarSearch(int[] list, int n) {
		int left = 0;
		int right = list.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;

			if (n == list[mid]) {
				return mid;
			} else if (n > list[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	public static void selectSort(int list[]) {
		int n = list.length;

		for (int i = 0; i < n - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < n; j++) {
				if (list[j] < list[min_idx]) {
					min_idx = j;
				}
			}

			int temp = list[min_idx];
			list[min_idx] = list[i];
			list[i] = temp;
		}
	}

	public static void bubbleSort(int[] list) {
		int n = list.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (list[j] > list[j + 1]) {
					int temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
	}

	public static void insertionSort(int[] list) {
		int n = list.length;
		for (int i = 1; i < n; ++i) {
			int key = list[i];
			int j = i - 1;

			while (j >= 0 && list[j] > key) {
				list[j + 1] = list[j];
				j = j - 1;
			}
			list[j + 1] = key;
		}
	}
	
	 public static void merge(int[] list, int l, int m, int r){ 
	        int n1 = m - l + 1; 
	        int n2 = r - m; 
	        int L[] = new int [n1]; 
	        int R[] = new int [n2]; 
	  
	        for (int i=0; i<n1; ++i) 
	            L[i] = list[l + i]; 
	        for (int j=0; j<n2; ++j) 
	            R[j] = list[m + 1+ j]; 
	  
	        int i = 0, j = 0; 
	  
	        int k = l; 
	        while (i < n1 && j < n2) 
	        { 
	            if (L[i] <= R[j]) 
	            { 
	                list[k] = L[i]; 
	                i++; 
	            } 
	            else
	            { 
	                list[k] = R[j]; 
	                j++; 
	            } 
	            k++; 
	        }
	        
	  	    while (i < n1) { 
	            list[k] = L[i]; 
	            i++; 
	            k++; 
	        } 

	        while (j < n2) 
	        { 
	            list[k] = R[j]; 
	            j++; 
	            k++; 
	        } 
	    } 
	
	public static void sort(int[] list, int l, int r) { 
        if (l < r) { 
            int m = (l+r)/2; 
  
            sort(list, l, m); 
            sort(list , m+1, r); 

            merge(list, l, m, r); 
        } 
    } 
	
	public static int quick(int[] list, int low, int high){ 
        int pivot = list[high];  
        int i = (low-1);
        for (int j=low; j<high; j++){
            if (list[j] <= pivot){ 
                i++;
                int temp = list[i]; 
                list[i] = list[j]; 
                list[j] = temp; 
            } 
        } 
  
        int temp = list[i+1]; 
        list[i+1] = list[high]; 
        list[high] = temp; 
  
        return i+1; 
    } 
  
    public static void sorts(int[] list, int low, int high){ 
        if (low < high){
            int pi = quick(list, low, high); 
            sort(list, low, pi-1); 
            sort(list, pi+1, high); 
        } 
    } 

	public static void main(String[] args) {
		int[] list1 = { 7, 3, 9, 5, 2, 7, 1 };
		/*
		 * System.out.println(linearSearch(list, 2));
		 * 
		 * System.out.println(maxSize(list));
		 * 
		 * System.out.println(binarSearch(orgList, 7));
		 */
//		sort(list1);
		print(list1);

	}
}
