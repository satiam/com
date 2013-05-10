package com.java.exercise.test;

import java.util.Map;

/**
 * This method extends MyMap in order to detect how many times put and get method are called in the map used.
 * @author User 1
 *
 */
public class CheckMap {
	private static final long serialVersionUID = 1L;

	public Map<Integer, String> setEmployee(Integer id, String name) {

		MyMap<Integer, String> employeeMap = new MyMap<Integer, String>();

		employeeMap.put(7, "cole");

		if (!employeeMap.containsKey(id)) {

			employeeMap.put(id, name);
		} else {

			String employee = employeeMap.get(id);

		}
		return employeeMap;

	}

	public static void main(String args[]) {

		CheckMap checkMap = new CheckMap();

		checkMap.setEmployee(3, "john");

		checkMap.setEmployee(4, "terry");

		checkMap.setEmployee(5, "sam");

		checkMap.setEmployee(6, "pierce");

		int putCount = checkMap.getPutCount();

		System.out.println("get method in map " + putCount);

		checkMap.setEmployee(7, "cole");

		int getCount = checkMap.getGetCount();

		System.out.println("get method in map " + getCount);

	}
}
