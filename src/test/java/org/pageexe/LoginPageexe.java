package org.pageexe;
import java.io.IOException;
import org.baseutils.BaseClass;
import org.pagerepo.LoginRepo;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageexe extends BaseClass {
	@BeforeClass
	public void before() {
		BaseClass.driver.get("https://www.facebook.com/");

}
	@Test
	public void test() throws IOException {
		System.out.println("Test 1");
		LoginRepo repo =new LoginRepo();
		type(repo.getEmail(),"bala");
		
		type(repo.getPassword(), "bala12")	;
}
	@Test
	public void test1() throws IOException {
		System.out.println("Test 1");
		LoginRepo repo =new LoginRepo();
		type(repo.getEmail(),"viji");
		
		type(repo.getPassword(), "bala12");	
}
	@Test
	public void test2() throws IOException {
		System.out.println("Test 1");
		LoginRepo repo =new LoginRepo();
		type(repo.getEmail(),"surya");
		
		type(repo.getPassword(), "bala12");
}
}