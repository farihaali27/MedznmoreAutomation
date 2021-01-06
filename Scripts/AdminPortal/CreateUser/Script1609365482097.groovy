import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.callTestCase(findTestCase('Authenticate/SuperAdminLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/span_Users'))

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/span_Create'))

WebUI.setText(findTestObject('Page_MedznMore - Admin Portal/UserName'), 'Test User' + RandomStringUtils.randomNumeric(2))

WebUI.setEncryptedText(findTestObject('Page_MedznMore - Admin Portal/UserPassword'), 'p4y+y39Ir5PJb2ispxT0Ew==')

WebUI.setText(findTestObject('Page_MedznMore - Admin Portal/UserEmail'), ('test' + RandomStringUtils.randomNumeric(2)) + 
    '@testng.com')

WebUI.setText(findTestObject('Page_MedznMore - Admin Portal/UserPhoneNo'), '+9234400000' + RandomStringUtils.randomNumeric(
        2))

WebUI.click(findTestObject('Page_MedznMore - Admin Portal/UserRole'))

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/li_Admin'))

WebUI.click(findTestObject('Page_MedznMore - Admin Portal/SaveUserDetails'))

WebUI.click(findTestObject('User_Yes'))

WebUI.verifyElementText(findTestObject('User_Confirmation'), 'User have been created successfully')

WebUI.closeBrowser()

