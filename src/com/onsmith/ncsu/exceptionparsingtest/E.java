package com.onsmith.ncsu.exceptionparsingtest;

public class E extends D {
	public void catchThis() {
		try {
			exceptionTest();
		}
		catch (RuntimeException e) {
			
		}
	}
}