package com.nt.main;

/**
 * Hello world!
 */
public class App {
	
	public int add() {
		int a = 0; int b = 0;
		int c;
		c= a+b;
		return c;
	}
    public static void main(String[] args) {
        System.out.println("Hello World!");
        App ap = new App();
        ap.add();
    }
}
