package com.sortRunnerMain;

public class sortRunnerMainBubble {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		int[] arr = { 9, 8, 77, 6, 5, 4, 3 };

		// Bubble Sort işlemi
		int n = arr.length;
		boolean swapped;
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// Swap işlemi
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped)
				break; // Eğer değişim olmadıysa döngüden çık
		}
		long endTime = System.nanoTime(); // Bitiş zamanı
		long duration = endTime - startTime; // Geçen süre (nanosaniye cinsinden)

		System.out.println("Kodun çalışma süresi: " + duration + " ns");

		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

}
