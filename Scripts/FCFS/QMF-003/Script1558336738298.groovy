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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://pmrs.eschost2.com/login')

/*Check username*/
String user = './/input[@formcontrolname=\'username\']'

TestObject username = new TestObject().addProperty('xpath', ConditionType.EQUALS, user)

WebUI.setText(username, 'sec_ace')

/*End*/
/*Check password*/
String pass = './/input[@formcontrolname=\'password\']'

TestObject password = new TestObject().addProperty('xpath', ConditionType.EQUALS, pass)

WebUI.setText(password, 'Password.1')

/*End*/
/*Clicks login*/
String log = './/button/span[text()=\'Login\']'

TestObject login = new TestObject().addProperty('xpath', ConditionType.EQUALS, log)

WebUI.click(login)

/*End*/
//Clicks dropdown
String drop = './/mat-select/div/div[@class=\'mat-select-arrow-wrapper\']'

TestObject dropDown = new TestObject().addProperty('xpath', ConditionType.EQUALS, drop)

WebUI.click(dropDown)

//End
//selects on dropdown menu
String doc2 = './/mat-option[@id=\'mat-option-1\']'

TestObject doctor2 = new TestObject().addProperty('xpath', ConditionType.EQUALS, doc2)

WebUI.click(doctor2)

//End
WebUI.delay(1)

//clicks on add button
String addBut = './/button[@class=\'addapp-button center-image mat-fab mat-accent\']'

TestObject addButton = new TestObject().addProperty('xpath', ConditionType.EQUALS, addBut)

WebUI.click(addButton)

//End
//checks doctor's name
String displayText = '//mat-dialog-container[@id=\'mat-dialog-0\']/esc-add-appointment-dialog/div/div/div/div/p'

TestObject docName = new TestObject().addProperty('xpath', ConditionType.EQUALS, displayText)

//Get text of Doctor's name
String d = "//mat-select[@id='mat-select-0']/div/div/span/span"
TestObject docNameCom = new TestObject().addProperty('xpath', ConditionType.EQUALS, d)
result = WebUI.getText(docNameCom)
result = result.toUpperCase()

//Checks if the doctor's name matches
WebUI.verifyElementText(docName, result)

//End
WebUI.closeBrowser()

