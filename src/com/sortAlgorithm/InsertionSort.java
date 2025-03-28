package com.sortAlgorithm;

import com.printArray.PrintArray;

public class InsertionSort extends Thread {
	private int[] arr;

	public InsertionSort(int[] arr) {
		this.arr = arr;
	}

	public InsertionSort() {

	}

	@Override
	public void run() {

		insertionSort();

	}

	public void insertionSort() {
		long startTime = System.nanoTime();
		int n = this.arr.length;
		for (int i = 1; i < n; i++) {
			int key = this.arr[i];
			int j = i - 1;

			// Key'den büyük olan elemanları sağa kaydır
			while (j >= 0 && this.arr[j] > key) {
				this.arr[j + 1] = this.arr[j];
				j = j - 1;
			}
			this.arr[j + 1] = key;
		}
		long endTime = System.nanoTime(); // Bitiş zamanı
		long duration = endTime - startTime; // Geçen süre (nanosaniye cinsinden)

		PrintArray prt = new PrintArray();
		prt.print(this.arr, "Insertion sort", duration, Thread.currentThread().getName());
	}

}
