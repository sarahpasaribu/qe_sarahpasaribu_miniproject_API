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



class createProduct {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@Given("Set method createProduct to POST-001")
	def createProduct1() {
		println ("Set method createProduct to POST-001")
	}

	@When("Set URL createProduct https://alta-shop.herokuapp.com/api/products-001")
	def createProductURL() {
		response = WS.sendRequest(findTestObject('Products/TC.CreateProduct/CreateProduct'))
		println ("Set URL createProduct https://alta-shop.herokuapp.com/api/products-001")
	}

	@And("Set body createProduct using Test Data-001")
	def createProductsSendBody() {
		println ("Set body createProduct using Test Data-001")
	}

	@And("Send Request createProduct-001")
	def createProductsSendRequest() {
		println ("Send Request createProduct-001")
	}

	@Then("Show the verify result createProduct 200 OK-001 ")
	def showResultCreateProduct() {
		println ("Show the verify result createProduct 200 OK-001 ")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}


	// emptyBody

	@Given("Set method createProduct to POST-002")
	def createProduct2() {
		println ("Set method createProduct to POST-002")
	}

	@When("Set URL createProduct https://alta-shop.herokuapp.com/api/products-002")
	def createProductURL2() {
		response = WS.sendRequest(findTestObject('Products/TC.CreateProduct/CreateProduct.002'))
		println ("Set URL createProduct https://alta-shop.herokuapp.com/api/products-002")
	}

	@And("Set body createProduct using Test Data-002")
	def createProductsSendBody2() {
		println ("Set body createProduct using Test Data-002")
	}

	@And("Send Request createProduct-002")
	def createProductsSendRequest2() {
		println ("Send Request createProduct-002")
	}

	@Then("Show the verify result createProduct 400 BAD REQUEST-002")
	def showResultCreateProduct2() {
		println ("Show the verify result createProduct 400 BAD REQUEST-002")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)

	}

}