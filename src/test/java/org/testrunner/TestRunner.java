package org.testrunner;

import org.baseclass.JvmReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.stepdefinition",dryRun=false,monochrome=true,strict=false,tags="@sanity",plugin={"pretty","html:target","json:target\\report\\output.json","junit:target\\report\\adac.xml"})

public class TestRunner {
	
	@AfterClass
	public static void jvmReportGeneration() {
		JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\target\\report\\output.json");
		

	}

}
