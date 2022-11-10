package categories
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



class createCategories {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Set create category method to POST-001")
	def createCateValid() {
		println ("Set create category method to POST-001")
	}

	@When("Set URL create category https://alta-shop.herokuapp.com/api/categories-001")
	def postCreateCateSetURL() {
		println ("Set URL https://alta-shop.herokuapp.com/api/categories-001")
		response = WS.sendRequest(findTestObject('Categories/CreateCategory/CreateCategories'))
	}

	@And("Set body create category using Test Data-001 ")
	def postCreateCateSetBody() {
		println ("Set body create category using Test Data-001")
	}

	@And("Send create category Request-001")
	def postCreateCateSendRequest() {
		println ("Send create category Request-001")
	}
	@Then("Show create category the verify result 200 OK-001 ")
	def showResultCreateCate() {
		println ("Show create category the verify result 200 OK-001")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}


	// Empty Body
	@Given("Set create category method to POST-002")
	def createCateValid2() {
		println ("Set create category method to POST-002")
	}

	@When("Set URL create category https://alta-shop.herokuapp.com/api/categories-002")
	def postCreateCateSetURL2() {
		println ("Set URL https://alta-shop.herokuapp.com/api/categories-002")
		response = WS.sendRequest(findTestObject('Categories/CreateCategory/CreateCategories'))
	}

	@And("Set create category body using Test Data-002")
	def postCreateCateSetBody2() {
		println ("Set create category body using Test Data-002")
	}

	@And("Send create category Request-002")
	def postCreateCateSendRequest2() {
		println ("Send create category Request-002")
	}
	@Then("Show create category the verify result 400 BAD REQUEST-002")
	def showResultCreateCate2() {
		println ("Show create category the verify result 400 BAD REQUEST-002")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)
	}



}