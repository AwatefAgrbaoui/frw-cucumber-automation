package com.e2etests.automation.page_objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;



public class RegisterPage {
	
	private ConfigFileReader configFileReader;

	/* @FindBy */
	@FindBy(how = How.LINK_TEXT, using = "REGISTER")
	public static WebElement btnRegister;
	@FindBy(how = How.NAME, using = "firstName")
	public static WebElement firstName;
	@FindBy(how = How.NAME, using = "lastName")
	public static WebElement lastName;
	@FindBy(how = How.NAME, using = "phone")
	public static WebElement phone;
	@FindBy(how = How.ID, using = "userName")
	public static WebElement email;
	@FindBy(how = How.NAME, using = "address1")
	public static WebElement adress;
	@FindBy(how = How.NAME, using = "city")
	public static WebElement city;
	@FindBy(how = How.NAME, using = "state")
	public static WebElement state;
	@FindBy(how = How.NAME, using = "postalCode")
	public static WebElement postalCode;
	@FindBy(how = How.NAME, using = "country")
	public static WebElement country;
	@FindBy(how = How.ID, using = "email")
	public static WebElement userName;
	@FindBy(how = How.NAME, using = "password")
	public static WebElement password;
	@FindBy(how = How.NAME, using = "confirmPassword")
	public static WebElement confirmPassword;
	@FindBy(how = How.NAME, using = "submit")
	public static WebElement btnEnvoyer;
	@FindBy(how = How.TAG_NAME, using = "b")
	public static WebElement registringMessage;
	
	public RegisterPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}
	
	/*Create Method*/
	
	public void goToUrl() {
		Setup.driver.get(configFileReader.getProperties("home.url"));
	}
	public void clickOnButtonRegister() {
		btnRegister.click();
	}
	public void fillFirstName(String firstNameText) {
		firstName.sendKeys(firstNameText);
	}
	public void fillLastName(String lastNameText) {
		lastName.sendKeys(lastNameText);
	}
	public void fillPhone(String phoneNumber) {
		phone.sendKeys(phoneNumber);
	}
	public void fillEmail(String emailAdress ) {
		email.sendKeys(emailAdress);
	}
	public void fillAdress(String adressText ) {
		adress.sendKeys(adressText);
	}
	public void fillCity(String cityText ) {
		city.sendKeys(cityText);
	}
	public void fillState(String stateText ) {
		state.sendKeys(stateText);
	}
	public void fillPostalCode(String postalCodeText ) {
		postalCode.sendKeys(postalCodeText);
	}
	public void fillCountry(String countryName) {
	    Select countryDropdown = new Select(country);
	    countryDropdown.selectByVisibleText(countryName);
	}
	public void fillUserName(String userNameText ) {
		userName.sendKeys(userNameText);
	}
	public void fillPassword(String passwordText ) {
		password.sendKeys(passwordText);
	}
	public void fillConfirmPassword(String ConfirmPasswordText ) {
		confirmPassword.sendKeys(ConfirmPasswordText);
	}
	public void clickOnButtonEnvoyer() {
		btnRegister.click();
	}
}
