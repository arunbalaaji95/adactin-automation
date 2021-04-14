package org.login;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement txtUser;
	
	@FindBy(id="password")
	private WebElement txtPass;
	
	@FindBy(id="login")
	private WebElement btnClick;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutIcon;
	
	@FindBy(name="location")
	private WebElement dndLoc;
	
	@FindBy(name="hotels")
	private WebElement dndHotel;
	
	@FindBy(name="room_type")
	private WebElement dndRoomTyp;
	
	@FindBy(name="room_nos")
	private WebElement dndRoomNo;
	
	
	@FindBy(id="Submit")
	private WebElement toClickBook;
	
	@FindBy(id="radiobutton_0")
	private WebElement toSelectHotel;
	
	@FindBy(id="continue")
	private WebElement toContinue;
	
	@FindBy(id="first_name")
	private WebElement txtFname;
	
	@FindBy(id="last_name")
	private WebElement txtLname;
	
	@FindBy(id="adult_room")
	private WebElement aRoom;
	
	@FindBy(id="child_room")
	private WebElement cRoom;
	
	public WebElement getaRoom() {
		return aRoom;
	}

	public WebElement getcRoom() {
		return cRoom;
	}

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}

	public WebElement getLogoutIcon() {
		return logoutIcon;
	}

	public WebElement getDndLoc() {
		return dndLoc;
	}

	public WebElement getDndHotel() {
		return dndHotel;
	}

	public WebElement getDndRoomTyp() {
		return dndRoomTyp;
	}

	public WebElement getDndRoomNo() {
		return dndRoomNo;
	}

	public WebElement getToClickBook() {
		return toClickBook;
	}

	public WebElement getToSelectHotel() {
		return toSelectHotel;
	}

	public WebElement getToContinue() {
		return toContinue;
	}

	public WebElement getTxtFname() {
		return txtFname;
	}

	public WebElement getTxtLname() {
		return txtLname;
	}

	public WebElement getTxtAdd() {
		return txtAdd;
	}

	public WebElement getTxtCc() {
		return txtCc;
	}

	public WebElement getTxtCvc() {
		return txtCvc;
	}

	public WebElement getDrpCc() {
		return drpCc;
	}

	public WebElement getDrpMon() {
		return drpMon;
	}

	public WebElement getDrpYear() {
		return drpYear;
	}

	public WebElement getSelBook() {
		return selBook;
	}
	@FindBy(id="address")
	private WebElement txtAdd;
	
	@FindBy(id="cc_num")
	private WebElement txtCc;
	
	@FindBy(id="cc_cvv")
	private WebElement txtCvc;
	
	@FindBy(id="cc_type")
	private WebElement drpCc;
	
	@FindBy(id="cc_exp_month")
	private WebElement drpMon;
	
	@FindBy(id="cc_exp_year")
	private WebElement drpYear;
	
	@FindBy(id="book_now")
	private WebElement selBook;
	
	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}
	@FindBy(xpath="//a[text()='Click here']")
	private WebElement findTxt;

	public WebElement getFindTxt() {
		return findTxt;
	}
	
	@FindBy(id="datepick_in")
	private WebElement checkIn;
	
	@FindBy(id="datepick_out")
	private WebElement checkOut;
	
	
	

	
}
