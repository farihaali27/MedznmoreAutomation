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

WebUI.navigateToUrl('https://dev-admin.medznmore.com/')

WebUI.setText(findTestObject('Object Repository/Page_MedznMore - Admin Portal/input_E-mail Address_email'), 'admin@ephamacy.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_MedznMore - Admin Portal/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/span_SIGN IN'))

WebUI.setText(findTestObject('Object Repository/Page_MedznMore - Admin Portal/input_E-mail Address_email'), 'admin@epharmacy.com')

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/span_SIGN IN'))

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/div_Orders'))

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/div_Bulk Order Assignment'))

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/input_Shipping Address_jss21'))

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/input_Available Riders_MuiInputBase-input M_8cfec2'))

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/input_Availability_radio-button-demo'))

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/span_Assign Order'))

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/span_Yes'))

