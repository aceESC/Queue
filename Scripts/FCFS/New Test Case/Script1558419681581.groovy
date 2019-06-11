import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.openBrowser('https://pmrsqa.eschost2.com')

/*Check username*/
String user = ".//input[@formcontrolname='username']"
TestObject username = new TestObject().addProperty('xpath', ConditionType.EQUALS, user)
WebUI.setText(username, "gerly.c@electronicscience.com")
/*End*/

/*Check password*/
String pass = ".//input[@formcontrolname='password']"
TestObject password = new TestObject().addProperty('xpath', ConditionType.EQUALS, pass)
WebUI.setText(password, "@gerlyJoy31")
/*End*/

/*Check login*/
String log = ".//button/span[text()='Login']"
TestObject login = new TestObject().addProperty('xpath', ConditionType.EQUALS, log)
WebUI.click(login)
/*End*/

WebUI.waitForPageLoad(0)

/*Logout*/
WebUI.callTestCase(findTestCase('LOG IN/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

/*End*/

//WebUI.closeBrowser()

//Testcase Description
//Verify that user is able to login with valid username