package com.gcdp.test;

import org.testng.annotations.Test;

public class MainTest {
	
	//QA
	/*@Test
	public void test_shouldCreate_PreScreeningApplication()
	{
		PreScreening preScreening = new PreScreening();
		preScreening.chooseProgram("AgriInnovate Program", "RAM Organization");
		preScreening.exit();
	} 
	
	@Test
	public void test_shouldCreate_FullScreeningApplication()
	{
	FullScreening fullScreening = new FullScreening();
	fullScreening.chooseProgram("AgriScience Program - Projects", "RAM Organization");
	fullScreening.exit();  
	} */
	

	@Test(priority = 0)
	public void test_shouldCreate_PreScreeningApplication()
	{
		PreScreening preScreening = new PreScreening();
		preScreening.chooseProgram("Canadian Agricultural Strategic Priorities Program", "RAM Organization");
		preScreening.exit();
	} 
		
	@Test(priority = 1)
	public void test_shouldCreate_FullScreeningApplication()
	{
	FullScreening fullScreening = new FullScreening();
	fullScreening.chooseProgram("AgriAssurance Program: Small and Medium-sized Enterprise", "RAM Organization"); 
	fullScreening.exit();  
	} 
	
}
