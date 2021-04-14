package org.baseclass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void generateJvmReport(String jsonpath) {
		
		File f = new File(System.getProperty("user.dir")+"\\target\\report\\Jvmreport");
		Configuration con= new Configuration(f, "adactin");
		con.addClassifications("platform name", "windows10");
		con.addClassifications("browser name", "chrome");
		con.addClassifications("browser version ", "89.21256");
		con.addClassifications("sprint number", "154");
		
		List<String> li =new ArrayList<String>();
		li.add(jsonpath);
		ReportBuilder r = new ReportBuilder(li, con);
		r.generateReports();
		
		
		
		

	}

}
