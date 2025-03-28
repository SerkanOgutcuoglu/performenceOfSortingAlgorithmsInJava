package com.sortRunnerMain;

public class SortRunnerMainQuickSort {

	public static void main(String[] args) {
		int[] arr = { 9, 8, 7, 6, 5, 4, 3 };
		long startTime = System.nanoTime();

		// Quick Sort algoritmasını çağır
		quickSort(arr, 0, arr.length - 1);
		long endTime = System.nanoTime(); // Bitiş zamanı
		long duration = endTime - startTime; // Geçen süre (nanosaniye cinsinden)

		System.out.println("Kodun çalışma süresi: " + duration + " ns");
		System.out.println("Sıralamadan Sonra:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	// Quick Sort fonksiyonu
	private static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(arr, low, high);
			quickSort(arr, low, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, high);
		}
	}

	// Diziyi bölme işlemi
	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				// Swap işlemi
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

}
