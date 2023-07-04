package com.testrun;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		plugin = {"json:./target/Cucumber.json" }, 
		features ="./src/test/resources/Online Banking LoginTest.feature", 
		glue ="com.generic", 
		tags ="@Smoke"

)

public class CucumberRunner extends AbstractTestNGCucumberTests {

	@BeforeTest
	public void setup() {

	}

	@Test
	public void test1() {

	}

	@AfterTest
	public void tearDown() {

	}
}
