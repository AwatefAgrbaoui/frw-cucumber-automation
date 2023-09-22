package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.RegisterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {
	
	private RegisterPage registerPage;
	
	public RegisterStepDefinition() {
		this.registerPage= new RegisterPage();
	}

	@Given("Je me connecte sur l application Mercury1")
	public void jeMeConnecteSurLApplicationMercury1() {
		registerPage.goToUrl();
	}

	@When("Je clique sur le bouton Register")
	public void jeCliqueSurLeBoutonRegister() {
		registerPage.clickOnButtonRegister();
	}
	@When("Je saisie  first name {string}")
	public void jeSaisieFirstName(String firstName) {
		registerPage.fillFirstName(firstName);
	}
	@When("Je saisie  last name {string}")
	public void jeSaisieLastName(String lastName) {
		registerPage.fillLastName(lastName);
	}
	@When("Je saisie  phone {string}")
	public void jeSaisiePhone(String phone) {
		registerPage.fillPhone(phone);
	}
	@When("Je saisie  email {string}")
	public void jeSaisieEmail(String email) {
		registerPage.fillEmail(email);
	}
	@When("Je saisie  address {string}")
	public void jeSaisieAddress(String adress) {
		registerPage.fillAdress(adress);
	}
	@When("Je saisie  city {string}")
	public void jeSaisieCity(String city) {
		registerPage.fillCity(city);
	}
	@When("Je saisie  state\\/province {string}")
	public void jeSaisieStateProvince(String state) {
		registerPage.fillState(state);
	}
	@When("Je saisie  postal code {string}")
	public void jeSaisiePostalCode(String postalCode) {
		registerPage.fillPostalCode(postalCode); 
	}
	@When("Je selectionne  country {string}")
	public void jeSelectionneCountry(String country) {
		registerPage.fillCountry(country);
	}
	
	@When("Je saisie username1 {string}")
	public void jeSaisieUsername1(String UserName) {
		registerPage.fillUserName(UserName);
	}
	@When("Je saisie password1 {string}")
	public void jeSaisiePassword1(String password) {
		registerPage.fillPassword(password);
	}
	@When("Je confirme password1 {string}")
	public void jeConfirmePassword1(String password) {
		registerPage.fillConfirmPassword(password);
	}
	@When("Je clique sur le bouton Envoyer")
	public void jeCliqueSurLeBoutonEnvoyer() {
		registerPage.clickOnButtonEnvoyer();
	}
	@Then("Je me redirige vers la page welcome {string}")
	public void jeMeRedirigeVersLaPageWelcome(String text) {
		String message = RegisterPage.registringMessage.getText();
		//Assert.assertEquals(text, message);
		Assert.assertTrue(text.contains(message));
	 
	}



}
