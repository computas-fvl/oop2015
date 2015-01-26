package com.computas.oop2015;

public class Example {

	int max(int[] array) {
		int m = array[0];
		for (int i : array) {
			if (larger(i, m)) {
				m = i;
			}
		}
		return m;
	}

	private boolean larger(int i, int j) {
		return i > j;
	}

}
