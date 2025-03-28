package com.sortRunner;

import com.sortAlgorithm.BubbleSort;
import com.sortAlgorithm.InsertionSort;
import com.sortAlgorithm.QuickSort;
import com.sortAlgorithm.ShellSort;

public class sortRunner {

	public static void main(String[] args) throws InterruptedException {

		int[] arr = { 15, 2, 3, 4, 5, 5, 4, 15, 47, 65, 12 };

		InsertionSort insertionSort = new InsertionSort(arr);
		BubbleSort bubbleSort = new BubbleSort(arr);
		QuickSort quickSort = new QuickSort(arr, 0, arr.length - 1);
		ShellSort shellSort = new ShellSort(arr);

		quickSort.start();
		insertionSort.start();
		bubbleSort.start();
		shellSort.start();

		insertionSort.join();
		bubbleSort.join();
		quickSort.join();
		shellSort.join();

	}

}
