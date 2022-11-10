package rating
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



class giveRating {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

//	@Given("Set getRating product method to POST-001")
//	def giveRating() {
//		println ("Set getRating product method to POST-001")
//	}
//
//	@When("Set URL giveRating https://alta-shop.herokuapp.com/api/products/2/comments-001")
//	def  giveRatingSetURL() {
//		println ("Set URL giveRating https://alta-shop.herokuapp.com/api/products/2/comments-001")
//	}
//
//	@And("Set body giveRating using Test Data-001")
//	def giveRatingSetBody() {
//		println ("Set body giveRating using Test Data-001")
//	}
//
//	@And("Send Request giveRating-001")
//	def giveRatingSendRequest() {
//		println ("Send Request-001")
//	}
//	@Then("Show the verify giveRating result 200 OK-001 ")
//	def showResultGiveRating() {
//		println ("Show the verify result 200 OK-001")
//		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
//	}
//

	@Given("Set method giveRating to POST-002")
	def giveRating2() {
		println ("Set method giveRating to POST-002")
	}

	@When("Set URL giveRating https://alta-shop.herokuapp.com/api/products/2/comments-002")
	def  giveRatingSetURL2() {
		println ("Set URL giveRating https://alta-shop.herokuapp.com/api/products/2/comments-002")
	}

	@And("Set body giveRating using Test Data-002")
	def giveRatingSetBody2() {
		println ("Set body giveRating using Test Data-002")
	}

	@And("Send Request giveRating-002")
	def giveRatingSendRequest2() {
		println ("Send Request-002")
	}
	@Then("Show the verify giveRating result 401 anauthorized-002 ")
	def showResultGiveRating2() {
		println ("Show the verify result 401 anauthorized-002")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode401)
	}
}