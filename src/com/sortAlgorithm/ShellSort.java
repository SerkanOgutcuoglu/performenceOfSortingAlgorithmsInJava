package com.sortAlgorithm;

import com.printArray.PrintArray;

public class ShellSort extends Thread {
	private int[] arr;

	public ShellSort(int[] arr) {
		this.arr = arr;
	}

	@Override
	public void run() {

		shellSort();

	}

	public void shellSort() {
		long startTime = System.nanoTime(); // Başlangıç zamanı

		int n = arr.length;
		for (int gap = n / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < n; i++) {
				int temp = arr[i];
				int j;
				for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
					arr[j] = arr[j - gap];
				}
				arr[j] = temp;
			}
		}

		long endTime = System.nanoTime(); // Bitiş zamanı
		long duration = endTime - startTime;
		PrintArray prt = new PrintArray();
		prt.print(this.arr, "shell sort", duration, Thread.currentThread().getName());
	}
}
