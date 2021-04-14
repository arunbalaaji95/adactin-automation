package org.stepdefinition;

import org.baseclass.BaseClass;
import org.junit.Assert;
import org.login.LoginPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	LoginPojo l;
	
	@Given("User is in adactin login page")
	public void user_is_in_adactin_login_page() {
		
		launchUrl("https://adactinhotelapp.com/");	   
	}
	@When("User enter valid username and password")
	public void user_enter_valid_username_and_password() {
		l = new LoginPojo();
		toType(l.getTxtUser(), "arunbalaaji");
		toType(l.getTxtPass(), "Arun123");
	}
	@When("User click login button")
	public void user_click_login_button() {
		toClick(l.getBtnClick());
	}
	@Given("User is in adactin booking details page")
	public void user_is_in_adactin_booking_details_page() {
		Assert.assertTrue(l.getLogoutIcon().isDisplayed());
		
	}
	@When("user select the location in dropdown like wise location and hotel and room type and no of rooms and adult per room and children per room and user click search button")
	public void user_select_the_location_in_dropdown_like_wise_location_and_hotel_and_room_type_and_no_of_rooms_and_adult_per_room_and_children_per_room_and_user_click_search_button() {
		toSelDrpDwn(l.getDndLoc(), 1);
		toSelDrpDwn(l.getDndHotel(), 2);
		l.getCheckIn().clear();
		toType(l.getCheckIn(), "15/04/2021");
		l.getCheckOut().clear();
		toType(l.getCheckOut(), "16/04/2021");
		toSelDrpDwn(l.getDndRoomTyp(), 3);
		toSelDrpDwn(l.getDndRoomNo(), 4);
		toClick(l.getToClickBook());
	}
	@When("user select the required hotel and click continue")
	public void user_select_the_required_hotel_and_click_continue() {
		toClick(l.getToSelectHotel());
		toClick(l.getToContinue());
	}
	@When("user enter the first name last name and card type and expiry date and cvcnumber and click book now")
	public void user_enter_the_first_name_last_name_and_card_type_and_expiry_date_and_cvcnumber_and_click_book_now() {
		toType(l.getTxtFname(), "arun");
		toType(l.getTxtLname(), "ballaaji");
		toType(l.getTxtCc(), "1234567891234567");
		toType(l.getTxtAdd(), "ffawwdwa");
		toType(l.getTxtCvc(), "123");
		toSelDrpDwn(l.getDrpCc(), 3);
		toSelDrpDwn(l.getDrpMon(), 1);
		toSelDrpDwn(l.getDrpYear(), 6);
		toClick(l.getSelBook());
	}
	@Then("user in booking confirmation page")
	public void user_in_booking_confirmation_page() throws InterruptedException {
		Thread.sleep(10000);
		if (driver.getCurrentUrl().contains("BookingConfirm")) {
			System.out.println("the user is in confirm booking page");	
		} else {
			System.out.println("the user is not in confirm page");
		}
	}
	@When("User enter valid {string} and {string}")
	public void user_enter_valid_and(String string, String string2) {
		l = new LoginPojo();
		toType(l.getTxtUser(), string);
		toType(l.getTxtPass(), string2);
	}

	@Then("check it in invalid page")
	public void check_it_in_invalid_page() throws InterruptedException {
		
	    Assert.assertTrue(l.getFindTxt().isDisplayed());
	}
	@When("user select {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_select_and_and_and_and_and(String string, String string2, String string3, String string4, String string5, String string6) {
	    toSelDrpDwnbytxt(l.getDndLoc(), string);
	    toSelDrpDwnbytxt(l.getDndHotel(), string2);
	    l.getCheckIn().clear();
		toType(l.getCheckIn(), "15/04/2021");
		l.getCheckOut().clear();
		toType(l.getCheckOut(), "16/04/2021");
	    toSelDrpDwnbytxt(l.getDndRoomTyp(), string3);
	    toSelDrpDwnbytxt(l.getDndRoomNo(), string4);
	    toSelDrpDwnbytxt(l.getaRoom(), string5);
	    toSelDrpDwnbytxt(l.getcRoom(), string6);
	    toClick(l.getToClickBook());
	}

	
	@When("user enter the {string} and {string} and {string} and {string} select{string} and {string} and {string} and {string} click book now")
	public void user_enter_the_and_and_and_select_and_and_and_click_book_now(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws InterruptedException {
		toType(l.getTxtFname(), string);
		toType(l.getTxtLname(), string2);
		toType(l.getTxtAdd(), string3);
		toType(l.getTxtCc(), string4);
		toSelDrpDwnbytxt(l.getDrpCc(), string5);
	    toSelDrpDwnbytxt(l.getDrpMon(), string6);
	    toSelDrpDwnbytxt(l.getDrpYear(), string7);
	    toType(l.getTxtCvc(), string8);
	    toClick(l.getSelBook());
	    Thread.sleep(3000);
	    WebElement txt = driver.findElement(By.id("order_no"));
	    String attribute = txt.getAttribute("value");
	    System.out.println(attribute);
	}




}






































//driver.findElement(By.id("username")).sendKeys("arunbalaaji");
//driver.findElement(By.id("password")).sendKeys("Arun123"); 
//driver.findElement(By.id("login")).click(); 
//WebElement dDnLoc = driver.findElement(By.name("location"));
//Select s1 = new Select(dDnLoc);
//s1.selectByIndex(2);
//WebElement dDnHotel = driver.findElement(By.name("hotels"));
//Select s2 = new Select(dDnHotel);
//s2.selectByIndex(3);
//WebElement dDnRoom = driver.findElement(By.name("room_type"));
//Select s3 = new Select(dDnRoom);
//s3.selectByIndex(1);
//WebElement dDnNos = driver.findElement(By.name("room_nos"));
//Select s5 = new Select(dDnNos);
//s5.selectByIndex(4);
//driver.findElement(By.id("Submit")).click();
//driver.findElement(By.id("radiobutton_0")).click();
//driver.findElement(By.id("continue")).click();		
//driver.findElement(By.id("first_name")).sendKeys("arun");
//driver.findElement(By.id("last_name")).sendKeys("balaaji");
//driver.findElement(By.id("address")).sendKeys("zdadw");
//driver.findElement(By.id("cc_num")).sendKeys("1234567891234567");
//driver.findElement(By.id("cc_cvv")).sendKeys("025");
//WebElement dDnNos = driver.findElement(By.id("cc_type"));
//Select s1 = new Select(dDnNos);
//s1.selectByIndex(2);
//WebElement month = driver.findElement(By.id("cc_exp_month"));
//Select s2 = new Select(month);
//s2.selectByIndex(2);
//WebElement year = driver.findElement(By.id("cc_exp_year"));
//Select s3 = new Select(year);
//s3.selectByIndex(2);
//driver.findElement(By.id("book_now")).click();
//
































