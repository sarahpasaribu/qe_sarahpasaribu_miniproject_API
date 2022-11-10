package products
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



class getAllProducts {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Set method getAllProducts to GET-001")
	def getAllProduct() {
		println ("Set method getAllProducts to GET-001")
	}

	@When("Set URL getAllProducts https://alta-shop.herokuapp.com/api/products-001")
	def getAllProductURL() {
		response = WS.sendRequest(findTestObject('Products/TC.GetAllProduct/GetAllProduct'))
		println ("Set URL getAllProducts https://alta-shop.herokuapp.com/api/products-001")
	}

	@And("Send Request getAllProducts-001")
	def getAllProductsSendRequest()  {
		println ("Send Request getAllProducts-001")
	}

	@Then("Show the verify giveRating result 200 OK-001 ")
	def showResultGiveRating() {
		println ("Show the verify result 200 OK-001")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}

	// invalidMethod

	@Given("Set method getAllProducts to POST-002")
	def getAllProduct2() {
		println ("Set method getAllProducts to POST-002")
	}

	@When("Set URL getAllProducts https://alta-shop.herokuapp.com/api/products-002")
	def getAllProductURL2() {
		response = WS.sendRequest(findTestObject('Products/TC.GetAllProduct/GetAllProduct.002'))
		println ("Set URL getAllProducts https://alta-shop.herokuapp.com/api/products-002")
	}

	@And("Send Request getAllProducts-002")
	def getAllProductsSendRequest2()  {
		println ("Send Request getAllProducts-002")
	}

	@Then("Show the verify getAllProducts result 405 METHOD NOT ALLOWED-002")
	def showResultGiveRating2() {
		println ("Show the verify getAllProducts result 405 METHOD NOT ALLOWED-002")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)
	}

}