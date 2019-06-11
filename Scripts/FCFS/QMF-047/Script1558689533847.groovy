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

//end

/*Clicks header*/
String head = "(.//*[normalize-space(text()) and normalize-space(.)='doctor ace1'])[2]/following::span[2]"

TestObject header = new TestObject().addProperty('xpath', ConditionType.EQUALS, head)

WebUI.doubleClick(header)

//end

/*
//clicks regular tab
String regTab = '//div[@id=\'mat-tab-label-0-1\']'

TestObject regularTab = new TestObject().addProperty('xpath', ConditionType.EQUALS, regTab)

WebUI.click(regularTab)
//end
 */



String prioLogo = "//div[@id='cdk-drop-list-2']/div/div/mat-card/div/div[2]/div/i"

TestObject priorityLogo = new TestObject().addProperty('xpath', ConditionType.EQUALS, prioLogo)

WebUI.verifyElementNotPresent(priorityLogo, 0)


/*
//checks if appointment was added
if (WebUI.verifyElementNotPresent(priorityLogo, 0)) {
	
	WebUI.comment("No")
	
}
else{
	//checks added appointment when it is not the only appointment present
	for(int i=2;!cName.equals('Ace') && !cNum.equals('09123456789');i++){
		String inputName = "//div[@id='cdk-drop-list-2']/div["+i+"]/div/mat-card/div/div/div[2]/div"
		TestObject objectName = new TestObject().addProperty('xpath', ConditionType.EQUALS, inputName)
		
		String inputNum = "//div[@id='cdk-drop-list-2']/div["+i+"]/div/mat-card/div/div/div[2]/div[2]"
		TestObject objectNumber = new TestObject().addProperty('xpath', ConditionType.EQUALS, inputNum)
		
		cName = WebUI.getText(objectName)
		cNum = WebUI.getText(objectNumber)
		counter = i;
	}
	
	
 WebUI.verifyMatch(cName, 'Ace', false)
 WebUI.verifyMatch(cNum, '09123456789', false)
 WebUI.comment("Queue #: " + Integer.toString(counter))
}
//end


//verifies if there is a priority logo
String prioLogo = "//div[@id='cdk-drop-list-2']/div[2]/div/mat-card/div/div[2]/div/i"

TestObject priorityLogo = new TestObject().addProperty('xpath', ConditionType.EQUALS, prioLogo)

WebUI.verifyElementNotPresent(priorityLogo, 0)
//end
 */

WebUI.closeBrowser()

