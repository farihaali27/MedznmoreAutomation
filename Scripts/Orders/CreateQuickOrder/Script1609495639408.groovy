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

WebUI.callTestCase(findTestCase('Authenticate/CustomerLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Medznmore  Buy Genuine Medicines Onlin_c50446/a_ Order Now'))

WebUI.verifyElementText(findTestObject('Page_Medznmore  Buy Genuine Medicines Online in Pakistan/UploadPrescriptionLabel'), 
    'Upload Prescription')

CustomKeywords.'testPackage.testKeyword.uploadFile'(findTestObject('Page_Medznmore  Buy Genuine Medicines Onlin_c50446/span_browse'), 
    'C:\\Users\\EIY\\Documents\\889578 - Copy.jpg')

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Medznmore  Buy Genuine Medicines Onlin_c50446/button_Next'))

WebUI.click(findTestObject('Page_Medznmore  Buy Genuine Medicines Online in Pakistan/CustomerAddress'))

WebUI.click(findTestObject('Object Repository/Page_Medznmore  Buy Genuine Medicines Onlin_c50446/button_Place your Order'))

WebUI.verifyElementText(findTestObject('Page_Medznmore  Buy Genuine Medicines Online in Pakistan/OrderConfirmationPopup'), 
    'Our Team Will Get In Touch With You Shortly!!')

WebUI.closeBrowser()

