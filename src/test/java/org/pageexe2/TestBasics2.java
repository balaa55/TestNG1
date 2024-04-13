package org.pageexe2;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestBasics2 {
	@Test(description = "this code will run fortesting")
	public void Testp() {
		System.out.println("test p");
	}
	@Ignore
	@Test
	public void Testy() {
		System.out.println("test y");
	}
	@Test(enabled = true)
	public void Testz() {
		System.out.println("test z");
	}
	

}
