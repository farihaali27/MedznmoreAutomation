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

WebUI.callTestCase(findTestCase('Authenticate/CustomerLogin'), [('variable') : '', ('variable_0') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Medznmore_Order/MedicineImage'))

WebUI.click(findTestObject('Object Repository/Page_Medznmore  Buy Genuine Medicines Onlin_c50446/button_Add'))

WebUI.verifyElementText(findTestObject('Page_Medznmore_Order/AddScheduledProduct'), 'Product added to cart successfully')

WebUI.delay(10)

WebUI.click(findTestObject('Page_Medznmore_Order/Orderpath'))

WebUI.verifyElementText(findTestObject('Page_Medznmore_Order/ShoppingCartLabel'), 'Shopping Cart')

WebUI.click(findTestObject('Page_Medznmore_Order/ProceedToCheckoutButton'))

WebUI.click(findTestObject('Page_Medznmore_Order/HomeAddress'))

WebUI.click(findTestObject('Object Repository/Page_Medznmore  Buy Genuine Medicines Onlin_c50446/button_Place Order'))

WebUI.verifyElementText(findTestObject('Page_Medznmore_Order/OrderPlacedLabel'), 'Your order has been placed!')

WebUI.closeBrowser()

