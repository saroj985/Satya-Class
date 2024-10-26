package com.interfaceExample;

public interface Client {
	void webDesign();
	void webDevelopment();
}

abstract class Designer implements Client{
	public void webDesign() {
		System.out.println("Design is done.");
	}
}

class Dev extends Designer{
	public void webDevelopment() {
		System.out.println("Development is done.");
	}
}

class check {
	public static void main(String[] args) {
		Dev d = new Dev();
		d.webDesign();
		d.webDevelopment();
	}
}
