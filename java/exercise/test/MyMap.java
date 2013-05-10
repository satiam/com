package com.java.exercise.test;

import java.util.HashMap;

/**
 * This class extends HasMap and override the put and get method so as to get
 * the count for these method are called.
 * 
 * @author v497sff
 * 
 * @param <K>
 * @param <V>
 */
public class MyMap<K, V> extends HashMap<K, V>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int putCount = 0;
	private static int getCount = 0;

	@Override
	public V put(K key, V value) {
		putCount++;
		return super.put(key, value);
	}

	@Override
	public V get(Object key) {
		getCount++;
		return super.get(key);
	}

	public int getPutCount() {
		return putCount;
	}

	public int getGetCount() {
		return getCount;
	}

}
