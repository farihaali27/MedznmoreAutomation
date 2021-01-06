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

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/div_Promos'))

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/span_Create'))

WebUI.verifyElementText(findTestObject('Page_MedznMore - Admin Portal/CreateTitle'), 'Create')

WebUI.setText(findTestObject('Page_MedznMore - Admin Portal/PromoTitle'), 'Free Del' + RandomStringUtils.randomNumeric(2))

WebUI.setText(findTestObject('Page_MedznMore - Admin Portal/PromoDescription'), 'Test Promo')

WebUI.setText(findTestObject('Page_MedznMore - Admin Portal/AmountValue'), '200')

WebUI.setText(findTestObject('Page_MedznMore - Admin Portal/PromoCode'), 'FRIoff20' + RandomStringUtils.randomNumeric(2))

WebUI.setText(findTestObject('Page_MedznMore - Admin Portal/MinAmoutOrder'), '500')

WebUI.setText(findTestObject('Page_MedznMore - Admin Portal/MaxDiscount'), '300')

WebUI.click(findTestObject('Page_MedznMore - Admin Portal/FromDate'))

WebUI.click(findTestObject('Page_MedznMore - Admin Portal/DateSlider'))

WebUI.click(findTestObject('Page_MedznMore - Admin Portal/FromDateSelector'))

WebUI.click(findTestObject('Page_MedznMore - Admin Portal/DatePickerOK'))

WebUI.click(findTestObject('Page_MedznMore - Admin Portal/ValidTill'))

WebUI.click(findTestObject('Page_MedznMore - Admin Portal/DateSlider'))

WebUI.click(findTestObject('Page_MedznMore - Admin Portal/ToDatePicker'))

WebUI.click(findTestObject('Page_MedznMore - Admin Portal/DatePickerOK'))

WebUI.click(findTestObject('Page_MedznMore - Admin Portal/CreatePromo'))

WebUI.verifyElementText(findTestObject('Page_MedznMore - Admin Portal/div_Promo created successfully'), 'Promo created successfully!')

WebUI.closeBrowser()

