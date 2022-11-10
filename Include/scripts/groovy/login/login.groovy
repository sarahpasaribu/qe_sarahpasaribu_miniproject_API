package login;
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Set method to POST-001")
	def loginValid() {
		println ("Set method to POST-001")
	}

	@When("Set URL https://alta-shop.herokuapp.com/api/auth/login-001")
	def postLoginSetURL() {
		println ("Set URL https://alta-shop.herokuapp.com/api/auth/login-001")
		response = WS.sendRequest(findTestObject('Authentication/TC.Login/Login.001'))
	}

	@And("Set body using Test Data-001")
	def postLoginSetBody() {
		println ("Set body using Test Data-001")
	}

	@And("Send Request-001")
	def postLoginSendRequest() {
		println ("Send Request-001")
	}
	@Then("Show the verify result 200 OK-001 ")
	def showResult() {
		println ("Show the verify result 200 OK-001")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}


	//WrongURL

	@Given("Set method to POST-002")
	def loginInvalid2() {
		println ("Set method to POST-002")
	}

	@When("Set URL https://alta-shop.herokuapp.com/api/auth/login/01")
	def postLoginSetURL2() {
		println ("Set URL https://alta-shop.herokuapp.com/api/auth/login/01")
		response = WS.sendRequest(findTestObject('Authentication/TC.Login/Login.002'))
	}

	@And ("Set body using Test Data-002")
	def postLoginSetBody2() {
		println ("Set body using Test Data-002")
	}

	@And ("Send Request-002")
	def postLoginSendRequest2() {
		println ("Send Request-002")
	}

	@Then("Show the verify result 404 NOT FOUND-002 ")
	def showResult2() {
		println ("Show the verify result 200 OK-002")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode404)
	}

	//invalidMethod
	@Given("Set method to GET-003")
	def loginInvalid3() {
		println ("Set method to GET-003")
	}

	@When("Set URL https://alta-shop.herokuapp.com/api/auth/login-003")
	def postLoginSetURL3() {
		println ("Set URL https://alta-shop.herokuapp.com/api/auth/login-003")
		response = WS.sendRequest(findTestObject('Authentication/TC.Login/Login.003'))
	}

	@And ("Set body using Test Data-003")
	def postLoginSetBody3() {
		println ("Set body using Test Data-003")
	}

	@And ("Send Request-003")
	def postLoginSendRequest3() {
		println ("Send Request-003")
	}

	@Then("Show the verify result 400 BAD REQUEST-003")
	def showResult3() {
		println ("Show the verify result 400 BAD REQUEST-003")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	//invalidEmail
	@Given("Set method to POST-004")
	def loginInvalid4() {
		println ("Set method to POST-004")
	}

	@When("Set URL https://alta-shop.herokuapp.com/api/auth/login-004")
	def postLoginSetURL4() {
		println ("Set URL https://alta-shop.herokuapp.com/api/auth/login-004")
		response = WS.sendRequest(findTestObject('Authentication/TC.Login/Login.004'))
	}

	@And ("Set body using Test Data-004")
	def postLoginSetBody4() {
		println ("Set body using Test Data-004")
	}

	@And ("Send Request-004")
	def postLoginSendRequest4() {
		println ("Send Request-004")
	}

	@Then("Show the verify result 400 BAD REQUEST-004 ")
	def showResult4() {
		println ("Show the verify result 400 BAD REQUEST")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}


	//invalidPass
	@Given("Set method to POST-005")
	def loginInvalid5() {
		println ("Set method to POST-005")
	}

	@When("Set URL https://alta-shop.herokuapp.com/api/auth/login-005")
	def postLoginSetURL5() {
		println ("Set URL https://alta-shop.herokuapp.com/api/auth/login-005")
		response = WS.sendRequest(findTestObject('Authentication/TC.Login/Login.005'))
	}

	@And ("Set body using Test Data-005")
	def postLoginSetBody5() {
		println ("Set body using Test Data-005")
	}

	@And ("Send Request-005")
	def postLoginSendRequest5() {
		println ("Send Request-005")
	}

	@Then("Show the verify result 400 BAD REQUEST-005 ")
	def showResult5() {
		println ("Show the verify result 400 BAD REQUEST-005")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}

	//invalidEmailandPass

	@Given("Set method to POST-006")
	def loginInvalid6() {
		println ("Set method to POST-006")
	}

	@When("Set URL https://alta-shop.herokuapp.com/api/auth/login-006")
	def postLoginSetURL6() {
		println ("Set URL https://alta-shop.herokuapp.com/api/auth/login-006")
		response = WS.sendRequest(findTestObject('Authentication/TC.Login/Login.006'))
	}

	@And ("Set body using Test Data-006")
	def postLoginSetBody6() {
		println ("Set body using Test Data-006")
	}

	@And ("Send Request-006")
	def postLoginSendRequest6() {
		println ("Send Request-006")
	}

	@Then("Show the verify result 400 BAD REQUEST-006 ")
	def showResult6() {
		println ("Show the verify result 400 BAD REQUEST-006")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}
}

