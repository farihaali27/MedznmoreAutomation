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


WebUI.callTestCase(findTestCase('Authenticate/CustomerLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Medznmore  Buy Genuine Medicines Online in Pakistan/TestLocator'))

WebUI.click(findTestObject('Object Repository/Page_Medznmore  Buy Genuine Medicines Onlin_c50446/li_My Account'))

WebUI.click(findTestObject('Object Repository/Page_Medznmore  Buy Genuine Medicines Onlin_c50446/span_Address management'))

WebUI.verifyElementText(findTestObject('Page_Medznmore  Buy Genuine Medicines Online in Pakistan/div_Address management'), 
    'Address management')

WebUI.click(findTestObject('Object Repository/Page_Medznmore  Buy Genuine Medicines Onlin_c50446/span_Add Address'))

WebUI.setText(findTestObject('Object Repository/Page_Medznmore  Buy Genuine Medicines Onlin_c50446/input_Location Name_bootstrap-input-other'), 
    'Test location' + RandomStringUtils.randomNumeric(
        2))

WebUI.click(findTestObject('Page_Medznmore  Buy Genuine Medicines Online in Pakistan/OtherAddressLocator'))

WebUI.click(findTestObject('Page_Medznmore  Buy Genuine Medicines Onlin_c50446/span_Add Address_1'))

WebUI.closeBrowser()

