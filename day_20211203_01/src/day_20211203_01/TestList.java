package day_20211203_01;

import java.util.ArrayList;
import java.util.Iterator;

public class TestList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("¾ÆÀÌÀ¯");
		list.add("¹ÚÈ¿½Å");
		list.add("¿Á»ó´Şºû");
		System.out.println(list);
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(5);
		intList.add(7);
		intList.add(9);
		int sum = 0;
		for (int j : intList) {
			sum += j;
		}
		System.out.println(sum);
	}

}
