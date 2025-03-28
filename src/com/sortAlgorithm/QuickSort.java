package com.sortAlgorithm;

import com.printArray.PrintArray;

public class QuickSort extends Thread {
	private int[] arr;
	private int low;
	private int high;

	public QuickSort(int[] arr, int low, int high) {
		this.arr = arr;
		this.low = low;
		this.high = high;
	}

	public QuickSort() {

	}

	@Override
	public void run() {
		quickSort(this.arr, this.low, this.high);

	}

	public void quickSort(int[] arr, int low, int high) {
		long startTime = System.nanoTime();
		if (low < high) {

			partition(arr, low, high);
		}
		long endTime = System.nanoTime(); // Bitiş zamanı
		long duration = endTime - startTime;
		PrintArray prt = new PrintArray();
		prt.print(this.arr, "Quick sort", duration, Thread.currentThread().getName());
	}

	private int partition(int[] arr, int low, int high) {

		int pivot = arr[high]; // Pivot olarak son elemanı seçiyoruz
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return i + 1;

	}

	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
