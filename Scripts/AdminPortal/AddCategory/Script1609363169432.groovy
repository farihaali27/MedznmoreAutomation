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

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/div_Categories'))

WebUI.click(findTestObject('Page_MedznMore - Admin Portal/CreateCategory'))

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/input_Status_jss20 MuiSwitch-input'))

WebUI.setText(findTestObject('Object Repository/Page_MedznMore - Admin Portal/input_Category Name_MuiInputBase-input MuiO_767709'), 
    'Test' + RandomStringUtils.randomNumeric(3))

WebUI.click(findTestObject('Page_MedznMore - Admin Portal/CategoryParent'))

WebUI.click(findTestObject('Page_MedznMore - Admin Portal/MedicinesDropdownObject'))


CustomKeywords.'testPackage.testKeyword.uploadFile'(findTestObject('Object Repository/Page_MedznMore - Admin Portal/div_Upload Image'),
	'C:\\Users\\EIY\\Documents\\889578 - Copy.jpg')

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/span_Save Details'))

WebUI.click(findTestObject('Object Repository/Page_MedznMore - Admin Portal/span_Yes'))

WebUI.verifyElementText(findTestObject('Page_MedznMore - Admin Portal/span_Category created successfully'), 'Category created successfully')

WebUI.closeBrowser()

