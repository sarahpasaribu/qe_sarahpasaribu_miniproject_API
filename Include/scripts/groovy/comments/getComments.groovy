package comments
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



class getComments {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Set get comment method to POST-001")
	def getRegisterCommentsValid() {
		println ("Set comment product method to POST-001")
	}

	@When("Set URL get comment https://alta-shop.herokuapp.com/api/products/2/comments-001")
	def postGetCommentSetURL() {
		println ("Set URL get comment https://alta-shop.herokuapp.com/api/products/2/comments-001")
		response = WS.sendRequest(findTestObject('Comments/TC.ProductComments/GetComment'))
	}

	@And("Send get comment Request-001")
	def postGetCommentsSendRequest() {
		println ("Send get comment Request-001")
	}

	@Then("Show get comment the verify result 200 OK-001")
	def showResultGetProduct() {
		println ("Show get comment the verify result 200 OK-001")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)
	}


	//invalid URL

	@Given("Set get comment method to POST-002")
	def getCommentsValid2() {
		println ("Set comment product method to POST-002")
	}

	@When("Set URL comment product https://alta-shop.herokuapp.com/api/products/2/-001")
	def getCommentSetURL2() {
		println ("Set URL get comment https://alta-shop.herokuapp.com/api/products-002")
		response = WS.sendRequest(findTestObject('Comments/TC.ProductComments/GetComment'))
	}

	@And("Send get comment Request-002")
	def postGetCommentsSendRequest2() {
		println ("Send get comment Request-002")
	}

	@Then("Show get comment the verify result 404 NOT FOUND-002")
	def showResultGetProduct2() {
		println ("Show get comment the verify result 404 NOT FOUND-002")
		WS.verifyResponseStatusCode(response, GlobalVariable.statusCode404)
	}
}