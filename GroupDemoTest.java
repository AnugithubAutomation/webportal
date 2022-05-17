package ui;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupDemoTest extends CommonDataSetup {
	
	
		@Test(priority=1, groups="regression")
		public void bTest1()
		{
	 System.out.println("Test1");
	 }
		@Test(priority=2, groups="regression")
		public void aTest2()
		{
			System.out.println("Test2");
		}
		@Test(groups = {"regression", "bvt"})
		public void aTest3()
		{
			System.out.println("Test3");
		}
		@Test(groups="bvt")
		public void bTest4()
		{
			System.out.println("Test4");
		}
		
	}


