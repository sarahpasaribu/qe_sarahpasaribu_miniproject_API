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


class deleteProduct {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@Given("Set method deleteProduct to GET-001")
	def deleteProduct1() {
		println ("Set method deleteProduct to GET-001")
	}

	@When("Set URL deleteProduct https://alta-shop.herokuapp.com/api/products/10-001")
	def deleteProductURL() {
		println ("Set URL deleteProduct https://alta-shop.herokuapp.com/api/products/10-001")
	}

	@And("Send Request deleteProduct-001")
	def deleteProductsSendRequest() {
		println ("Send Request deleteProduct-001")
	}

	@Then("Show the verify result deleteProduct 200 OK-001 ")
	def showResultCreateProduct() {
		println ("Show the verify result deleteProduct 200 OK-001")
	}

	// Invalid URL

	@Given("Set method deleteProduct to GET-002")
	def deleteProduct2() {
		println ("Set method deleteProduct to GET-002")
	}

	@When("Set URL deleteProduct https://alta-shop.herokuapp.com/api/products/10-002")
	def deleteProductURL2() {
		response = WS.sendRequest(findTestObject('Products/TC.DeleteProduct/DeleteProduct'))
		println ("Set URL deleteProduct https://alta-shop.herokuapp.com/api/products/10-002")
	}

	@And("Send Request deleteProduct-002")
	def deleteProductsSendRequest2() {
		println ("Send Request deleteProduct-002")
	}

	@Then("Show the verify result deleteProduct 500 Internal Server Error-002 ")
	def showResultCreateProduct2() {
		println ("Show the verify result deleteProduct 500 Internal Server Error-002")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode500)
	}
}