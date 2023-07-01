package com.javaifelsepractice;

public class JavaDividNumber {
	public static void main (String[]args) {
		String value ="30,25";
		double d = Double.parseDouble(value);
		String salary ="5000";
		int a =Integer.parseInt(salary);
		int c =30;
		String number = String.valueOf(c);
		for (int i=0; i<30;i++) {
		if (String.valueOf(i).contains("c")) {
			System.out.println("Found number with 3="+i);
		}
		}
}
}