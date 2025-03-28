package com.sortRunnerMain;

public class SortRunnerMainShell {

	public static void main(String[] args) {

		int[] arr = { 9, 8, 7, 6, 5, 4, 3 };

		long startTime = System.nanoTime();

		// Shell Sort Algoritması
		int n = arr.length;
		for (int gap = n / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < n; i++) {
				int temp = arr[i];
				int j = i;
				while (j >= gap && arr[j - gap] > temp) {
					arr[j] = arr[j - gap];
					j -= gap;
				}
				arr[j] = temp;
			}
		}

		long endTime = System.nanoTime(); // Bitiş zamanı
		long duration = endTime - startTime; // Geçen süre (nanosaniye cinsinden)

		System.out.println("Kodun çalışma süresi: " + duration + " ns");

		System.out.println("Sıralamadan Sonra:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
