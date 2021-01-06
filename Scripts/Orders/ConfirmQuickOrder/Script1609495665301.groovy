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

WebUI.callTestCase(findTestCase('Authenticate/SuperAdminLogin'), [('loginURL') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/div_Orders'))

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/div_All Orders'))

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/span_Status'))

WebUI.click(findTestObject('Page_Medznmore_Order/AllStatus'))

WebUI.click(findTestObject('Page_Medznmore_Order/PendingStatus'))

WebUI.click(findTestObject('Page_Medznmore_Order/Apply'))

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/span_Type'))

WebUI.click(findTestObject('Page_Medznmore_Order/AllType'))

WebUI.click(findTestObject('Page_Medznmore_Order/Type_Quick'))

WebUI.click(findTestObject('Page_Medznmore_Order/Apply'))

WebUI.setText(findTestObject('Page_Medznmore_Order/SearchField'), '+923462733181')

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/span_Search'))

WebUI.click(findTestObject('Page_Medznmore_Order/Row'))

WebUI.verifyElementText(findTestObject('Page_Medznmore_Order/OrderStatus'), 'Pending')

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/span_Edit Order'))

WebUI.setText(findTestObject('Object Repository/Page_MedznMore - Admin Portal/input_Search Product_MuiInputBase-input Mui_2de256'), 
    'cran')

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/div_Cran Max Sachet 1.0 (Rs. 272.36)'))

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/span_GET INVOICE'))

WebUI.click(findTestObject('Page_Medznmore_Order/SaveChanges'))

WebUI.click(findTestObject('Page_Medznmore_Order/Yes_Popup'))

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/span_Mark order'))

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/div_Confirmed'))

WebUI.click(findTestObject('Page_Medznmore_Order/Confirm_Yes'))

WebUI.verifyElementText(findTestObject('Page_Medznmore_Order/OrderConfirmStatus'), 'Confirmed')

WebUI.closeBrowser()

