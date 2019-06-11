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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://pmrs.eschost2.com/login')

WebUI.setText(findTestObject('Object Repository/QMF-033/Page_QUEUEPH/input_Username_mat-input-0'), 'sec_ace')

WebUI.setEncryptedText(findTestObject('Object Repository/QMF-033/Page_QUEUEPH/input_Username_mat-input-1'), 'p4y+y39Ir5NE6dRTsSPpaw==')

WebUI.click(findTestObject('Object Repository/QMF-033/Page_QUEUEPH/button_Login'))

WebUI.doubleClick(findTestObject('QMF-033/Page_QUEUEPH/span'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/QMF-033/Page_QUEUEPH/button_doctor ace1_addapp-button center-image mat-fab mat-accent cdk-focused cdk-mouse-focused'))

WebUI.setText(findTestObject('Object Repository/QMF-033/Page_QUEUEPH/input_MOBILE_mat-input-2'), '09122222222')

WebUI.setText(findTestObject('Object Repository/QMF-033/Page_QUEUEPH/input_NICKNAME_mat-input-3'), 'Aa')

WebUI.click(findTestObject('QMF-033/Page_QUEUEPH/div_NICKNAME_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/QMF-033/Page_QUEUEPH/span_CONFIRM'))

WebUI.verifyElementPresent(findTestObject('QMF-033/Page_QUEUEPH/div_Auto-prioritize client'), 0)

WebUI.verifyElementPresent(findTestObject('QMF-033/Page_QUEUEPH/button_NO'), 0)

WebUI.verifyElementPresent(findTestObject('QMF-033/Page_QUEUEPH/button_YES'), 0)

WebUI.closeBrowser()

