package com.sortAlgorithm;

import com.printArray.PrintArray;

public class BubbleSort extends Thread {
	private int[] arr;

	public BubbleSort(int[] arr) {
		this.arr = arr;
	}

	public BubbleSort() {

	}

	@Override
	public void run() {

		bubbleSort();
	}

	public void bubbleSort() {
		long startTime = System.nanoTime();
		int n = this.arr.length;
		boolean swapped;

		for (int i = 0; i < n - 1; i++) {
			swapped = false; // Eğer hiç değişim olmazsa algoritmayı durdurmak için

			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) { // Yan yana elemanları karşılaştır
					swap(arr, j, j + 1); // Yer değiştir
					swapped = true; // Değişim olduğunu işaretle
				}
			}

			if (!swapped)

				break; // Eğer hiç değişim olmadıysa dizi sıralıdır, çık
		}
		long endTime = System.nanoTime(); // Bitiş zamanı
		long duration = endTime - startTime; // Geçen süre (nanosaniye cinsinden)

		PrintArray prt = new PrintArray();
		prt.print(this.arr, "Bubble sort", duration, Thread.currentThread().getName());
	}

	// İki elemanın yerini değiştiren fonksiyon
	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		this.arr[i] = this.arr[j];
		this.arr[j] = temp;
	}

}
