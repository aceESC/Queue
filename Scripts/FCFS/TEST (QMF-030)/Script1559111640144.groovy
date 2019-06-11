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

WebUI.click(findTestObject('QMF-030/Page_QUEUEPH/span'))

/*End*/
//WebUI.doubleClick(findTestObject('QMF-030/Page_QUEUEPH/span'))
WebUI.delay(1)

//clicks on add button
String addBut = './/button[@class=\'addapp-button center-image mat-fab mat-accent\']'

TestObject addButton = new TestObject().addProperty('xpath', ConditionType.EQUALS, addBut)

WebUI.click(addButton)

/*End*/
/*inputs mobile #*/
String moNum = '//input[@formcontrolname=\'patCode\']'

TestObject mobileNumber = new TestObject().addProperty('xpath', ConditionType.EQUALS, moNum)

WebUI.setText(mobileNumber, '09123456789')

/*End*/
/*inputs nickname*/
String nname = '//input[@formcontrolname=\'patNick\']'

TestObject nickname = new TestObject().addProperty('xpath', ConditionType.EQUALS, nname)

WebUI.setText(nickname, 'Ace')

/*End*/
//clicks on header
String h = '//esc-add-appointment-dialog/div/div/div/div[2]'

TestObject header = new TestObject().addProperty('xpath', ConditionType.EQUALS, h)

WebUI.doubleClick(header)

/*End*/
//clicks on confirm button
String conBut = '//span[text()=\'CONFIRM\']'

TestObject confirmButton = new TestObject().addProperty('xpath', ConditionType.EQUALS, conBut)

WebUI.click(confirmButton)

WebUI.delay(2)

/*End*/
//Patient's name
String pName = '//div/div/mat-card/div/div/div[2]/div'

TestObject patientName = new TestObject().addProperty('xpath', ConditionType.EQUALS, pName)

//end
//Patient's mobile number
String pNum = '//div/div/mat-card/div/div/div[2]/div[2]'

TestObject patientNumber = new TestObject().addProperty('xpath', ConditionType.EQUALS, pNum)

//end
//gets text from object patientName & patientNumber
cName = WebUI.getText(patientName)

cNum = WebUI.getText(patientNumber)

//end
//declaration for counter
int counter = 0

//checks if appointment was added
if (cName.equals('Ace') && cNum.equals('09123456789')) {
    //checks if the added appointment matches the entered details earlier.
    //first appointment card
    WebUI.verifyMatch(cName, 'Ace', false)

    WebUI.verifyMatch(cNum, '09123456789', false //end
        //checks added appointment when it is not the only appointment present
        )
} else {
    for (int i = 2; !(cName.equals('Ace')) && !(cNum.equals('09123456789')); i++) {
        String inputName = ('//div[' + i) + ']/div/mat-card/div/div/div[2]/div'

        TestObject objectName = new TestObject().addProperty('xpath', ConditionType.EQUALS, inputName)

        String inputNum = ('//div[' + i) + ']/div/mat-card/div/div/div[2]/div[2]'

        TestObject objectNumber = new TestObject().addProperty('xpath', ConditionType.EQUALS, inputNum)

        cName = WebUI.getText(objectName)

        cNum = WebUI.getText(objectNumber)

        counter = i
    }
    
    WebUI.verifyMatch(cName, 'Ace', false)

    WebUI.verifyMatch(cNum, '09123456789', false)

    WebUI.comment('Queue #: ' + Integer.toString(counter))
}

//end
not_run: WebUI.closeBrowser(FailureHandling.OPTIONAL)



//div[@fxflex='33'][contains(.,'Ace')]

