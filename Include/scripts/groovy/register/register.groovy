package register
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



class register {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Set method register to POST-001")
	def registerValid() {
		println ("Set method register to POST-001")
	}

	@When("Set URL https://alta-shop.herokuapp.com/api/auth/register-001")
	def postRegisterSetURL() {
		println ("Set URL https://alta-shop.herokuapp.com/api/auth/register-001")
		response = WS.sendRequest(findTestObject('Authentication/TC.Regis/Reg.001'))
	}

	@And("Set body register using Test Data-001")
	def postRegisterSetBody() {
		println ("Set body register using Test Data-001")
	}

	@And("Send register Request-001")
	def postRegisterSendRequest() {
		println ("Send register Request-001")
	}
	@Then("Show register the verify result 200 OK-001 ")
	def showResult() {
		println ("Show register the verify result 200 OK-001")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}


	//invalidMethod

	@Given("Set register method to POST-002")
	def loginInvalid2() {
		println ("Set register method to POST-002")
	}

	@When("Set URL https://alta-shop.herokuapp.com/api/auth/register-002")
	def postLoginSetURL2() {
		println ("Set URL https://alta-shop.herokuapp.com/api/auth/register-002")
		response = WS.sendRequest(findTestObject('Authentication/TC.Regis/Reg.002'))
	}

	@And ("Set register body using Test Data-002")
	def postLoginSetBody2() {
		println ("Set register body using Test Data-002")
	}

	@And ("Send register Request-002")
	def postLoginSendRequest2() {
		println ("Send regsiter Request-002")
	}

	@Then("Show register the verify result 405 METHOD NOT ALLOWED-002 ")
	def showResult2() {
		println ("Show register the verify result 405 METHOD NOT ALLOWED-002")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}

	//invalidSyntax

	@Given("Set register method to GET-003")
	def loginInvalid3() {
		println ("Set method to GET-003")
	}

	@When("Set URL https://alta-shop.herokuapp.com/api/auth/register-003")
	def postLoginSetURL3() {
		println ("Set URL https://alta-shop.herokuapp.com/api/auth/register-003")
		response = WS.sendRequest(findTestObject('Authentication/TC.Regis/Reg.003'))
	}

	@And ("Set register body using Test Data-003")
	def postLoginSetBody3() {
		println ("Set register body using Test Data-003")
	}

	@And ("Send register Request-003")
	def postLoginSendRequest3() {
		println ("Send register Request-003")
	}

	@Then("Show register the verify result 400 BAD REQUEST-003")
	def showResult3() {
		println ("Show register the verify result 400 BAD REQUEST-003")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}
}