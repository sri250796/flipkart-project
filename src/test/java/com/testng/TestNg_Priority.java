package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNg_Priority {
	@Test
	public void sridhar() {
		System.out.println("sridhar");
	}
	@Test
	public void abhi() {
	System.out.println("abhi");

	}
	@Ignore
	@Test
	public void bala() {
		System.out.println("bala");

	}
	
	@Test(enabled = false)
	public void ethiraj() {
		System.out.println("ethiraj");
	}
	

}
