package com.sortRunnerMain;

public class sortRunnerMainInsertionSort {

	// Main metodu
	public static void main(String[] args) {
		int[] arr = { 9, 8, 7, 6, 5 };

		long startTime = System.nanoTime();
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;

			// Key'den büyük olan elemanları sağa kaydır
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		long endTime = System.nanoTime(); // Bitiş zamanı
		long duration = endTime - startTime; // Geçen süre (nanosaniye cinsinden)

		System.out.println("Kodun çalışma süresi: " + duration + " ns");
		System.out.println("Sıralanmış Dizi:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

}
