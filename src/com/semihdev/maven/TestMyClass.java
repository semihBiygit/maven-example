package com.semihdev.maven;

import org.apache.commons.lang3.StringUtils;

public class TestMyClass {
	public static void main(String[] args) {
		MyClass mC = new MyClass("asda", "asdadas", 2, 123,1);
		System.out.println(mC);
		mC.setStr1("aaaasdaaa");
		System.out.println(mC.getStr1());
		
		MyClass mC2 = new MyClass();
		System.out.println(mC2);
	
	
	}
}
