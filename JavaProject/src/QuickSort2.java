
public class QuickSort2 {
	public static void quicksort(int low, int high)

	{

		if (low < high) {
			int temp = 0;
			int pivot = a[low];
			int smalls_index = low;
			int larges_index = high;

			while (smalls_index <= larges_index) {
				while (a[larges_index] > pivot)
					larges_index--;

				while (a[smalls_index] < pivot)
					smalls_index++;

				if (smalls_index <= larges_index) {
					temp = a[smalls_index];
					a[smalls_index] = a[larges_index];
					a[larges_index] = temp;
					smalls_index++;
					larges_index--;
				}
			}

			if (low < larges_index) {
				quicksort(low, larges_index);
			}
			if (smalls_index < high) {
				quicksort(smalls_index, high);
			}
		}
	}

	public static void main(String[] args) {
		quicksort(0, 5);
		for (int i = 0; i <= 5; i++) {
			System.out.print(a[i] + " ");
		}
	}

	static int[] a = { 1, 2, 34, 4, 2, -9 };
}