package org.stepdefinition;

import java.io.IOException;

import org.baseclass.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	
	
	@Before("@sanity")
	public void beforeSanity() {
		System.out.println("sanity starts....");

	}
	@After("@sanity")
	private void afterSanity() {
		System.out.println(".......sanity ends");

	}
	
	
	@Before
	public void beforeScenario() {
		loadUrl();
		toWait();
		toClearCache();

	}
	@After
	public void afterScenario(Scenario s) throws IOException {
		String name = s.getName();
		String filename = name.replace(" ", "_");
		toScreenShot(filename);
		
		toQuit();
		System.out.println("quit");
		
		
		
		
		

	}

}
