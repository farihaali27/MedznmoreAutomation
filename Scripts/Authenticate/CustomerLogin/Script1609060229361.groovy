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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.click(findTestObject('Object Repository/Page_Medznmore  Buy Genuine Medicines Onlin_c50446/span_Login  Signup'))

WebUI.setText(findTestObject('Page_Medznmore  Buy Genuine Medicines Onlin_c50446/input_Phone Number_bootstrap-input'), GlobalVariable.username)

WebUI.click(findTestObject('Object Repository/Page_Medznmore  Buy Genuine Medicines Onlin_c50446/span_Use Password'))

WebUI.setEncryptedText(findTestObject('Page_Medznmore  Buy Genuine Medicines Onlin_c50446/input_Enter Password_bootstrap-input'), 
    'wJIk7rtVbpZUwd872421tw==')

WebUI.click(findTestObject('Object Repository/Page_Medznmore  Buy Genuine Medicines Onlin_c50446/button_Sign In'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Medznmore  Buy Genuine Medicines Onlin_c50446/span_Hello, Azfar Abbas'), 
    'Hello, Azfar Abbas')

