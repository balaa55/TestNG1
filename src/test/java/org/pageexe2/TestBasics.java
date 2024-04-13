package org.pageexe2;

import org.testng.annotations.Test;

public class TestBasics {
	@Test(priority = 1)
	public void TestA() {
		System.out.println("test A");
	}
	@Test(priority = 3)
	public void Test() {
		System.out.println("test ");
	}
	@Test(priority = 2)
	public void Testa() {
		System.out.println("test a");
	}
}
