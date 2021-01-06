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

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/div_Products'))

WebUI.click(findTestObject('Page_MedznMore - Admin Portal/button_Create'))

WebUI.click(findTestObject('Page_MedznMore - Admin Portal/div_Create'))

WebUI.click(findTestObject('StatusChange'))

WebUI.setText(findTestObject('Object Repository/Page_MedznMore - Admin Portal/input_Product Name_name'), 'Product' + RandomStringUtils.randomNumeric(
        2))

WebUI.click(findTestObject('Page_MedznMore - Admin Portal/input_Category_category-combo'))

WebUI.click(findTestObject('Page_MedznMore - Admin Portal/li_Medicines'))

WebUI.click(findTestObject('Page_MedznMore - Admin Portal/div_Level 1 sub category_MuiAutocomplete-en_4d2f29'))

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/li_Acid Reflux'))

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/div_Manufacturer'))

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/li_Abbott'))

WebUI.setText(findTestObject('Object Repository/Page_MedznMore - Admin Portal/input_SKU_MuiInputBase-input MuiOutlinedInp_19eb49'), 
    'SK' + RandomStringUtils.randomNumeric(2))

WebUI.setText(findTestObject('Object Repository/Page_MedznMore - Admin Portal/Quantity'), '500')

WebUI.setText(findTestObject('Object Repository/Page_MedznMore - Admin Portal/MaxQuantityPurchase'), '10')

WebUI.setText(findTestObject('Object Repository/Page_MedznMore - Admin Portal/ProductPrice'), '300')

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/input_About_jss140 MuiSwitch-input'))

CustomKeywords.'testPackage.testKeyword.uploadFile'(findTestObject('Page_MedznMore - Admin Portal/div_Upload Image 1'), 
    'C:\\Users\\EIY\\Documents\\889578 - Copy.jpg')

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/span_Save Details'))

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/span_Yes'))

WebUI.verifyElementText(findTestObject('Page_MedznMore - Admin Portal/div_Product added successfully'), 'Product added successfully!')

WebUI.closeBrowser()

