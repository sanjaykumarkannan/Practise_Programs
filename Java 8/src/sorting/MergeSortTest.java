package sorting;

public class MergeSortTest {

	static void printArray(int arr[]) {
		System.out.print("[ ");
		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.print(" ]");
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 1, 6, 4, 8, 9, 5 };
		System.out.println("Un-Sorted array :");
		printArray(arr);

		MergeSortTest obj = new MergeSortTest();

		obj.sort(arr, 0, arr.length - 1);

		System.out.println("Sorted array :");
		printArray(arr);
	}

	private void sort(int[] arr, int l, int r) {
		int m = 0;
		if (l < r) {
			m = (l + r) / 2;
			sort(arr, l, m);
			sort(arr, m + 1, r);
			//System.out.println("l "+l+" m "+m+" r "+r);
			merge(arr, l, m, r);
		}
	}

	private void merge(int[] arr, int l, int m, int r) {

		int arr1Len = m - l + 1;
		int arr2Len = r - m;

		int L[] = new int[arr1Len];
		int R[] = new int[arr2Len];

		for (int i = 0; i < arr1Len; i++) {
			L[i] = arr[l+i];
		}
		for (int j = 0; j < arr2Len; j++) {
			R[j] = arr[m+1+j];
		}
		int i = 0, j = 0;

		int comparisons = arr1Len + arr2Len;
		// for(int k=0;k<comparisons;k++) {
		int k = l;
		while (i < arr1Len && j < arr2Len) {

			/*
			 * if (L[i] > R[j]) { arr[k] = R[j]; j++; }
			 */
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else { arr[k] = R[j]; j++; }
			k++;

			/*
			 * if (L[i] <= R[j]) { arr[k] = L[i]; i++; } else { arr[k] = R[j]; j++; } k++;
			 */
		}
		while (i < arr1Len) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < arr2Len) {
			arr[k] = R[j];
			j++;
			k++;
		}

	}
}
