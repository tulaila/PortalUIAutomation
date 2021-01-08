package com.gcdp.test;

import org.testng.annotations.Test;

public class MainTest {

	/*@Test
	public void test_shouldCreate_FullScreeningApplication()
	{
	FullScreening fullScreening = new FullScreening();
	fullScreening.chooseProgram("AgriScience Program - Projects", "RAM Organization");
	fullScreening.exit();  
	} */
	
	@Test
	public void test_shouldCreate_PreScreeningApplication()
	{
		PreScreening preScreening = new PreScreening();
		preScreening.chooseProgram("AgriInnovate Program", "RAM Organization");
		//preScreening.exit();
	} 
	
}
