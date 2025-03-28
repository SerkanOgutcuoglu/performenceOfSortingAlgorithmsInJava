package com.printArray;

import java.util.concurrent.locks.ReentrantLock;

public class PrintArray {
	private static final ReentrantLock lock = new ReentrantLock(); // Tek bir thread içeri girebilir

	public void print(int[] arr, String st, long sure, String thName) {
		lock.lock(); // Thread'in içeri girmesini kontrol et
		try {
			System.out.println(thName + "  bu kadar sure calisti: " + sure);
			for (int num : arr) {
				System.out.print(num + " ");
			}
			System.out.println(st);
		} finally {
			lock.unlock(); // Thread işini bitirince kilidi aç
		}
	}
}
