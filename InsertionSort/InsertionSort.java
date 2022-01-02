
class InsertionSort {
	public static void main(String[] args) {

		int[] A = {31, 41, 59, 26, 41, 58};

		InsertionSort obj = new InsertionSort();
		obj.insertionSort(A);

		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
	}

	public int[] insertionSort(int[] A) {

		for (int j = 1; j < A.length ; j++) {
			int key = A[j];
			int i = j - 1;

			while(i > -1 && A[i] > key) {
				A[i + 1] = A[i];
				i = i - 1;
			}

			A[i + 1] = key;
		}

		return A;
	}
}