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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://castest.cardmri.com:8269/NGOFSReport/index.jsp')

WebUI.click(findTestObject('Object Repository/User Management/Page_CARD, Inc. Computerized Accounting System/html_CARD, Inc. Computerized Accounting Sys_31b5bb'))

WebUI.click(findTestObject('Object Repository/User Management/Page_CARD, Inc. Computerized Accounting System/div_Please Sign In'))

WebUI.setText(findTestObject('Object Repository/User Management/Page_CARD, Inc. Computerized Accounting System/input_Please Sign In_userName'), 
    'admanlangit')

WebUI.setEncryptedText(findTestObject('Object Repository/User Management/Page_CARD, Inc. Computerized Accounting System/input_Please Sign In_passWord'),
	'MHSUC33hkPnBWRnjFBNCPA==')

WebUI.click(findTestObject('Object Repository/User Management/Page_CARD, Inc. Computerized Accounting System/input_Please Sign In_loginButton'))

WebUI.click(findTestObject('Object Repository/User Management/Page_CARD, Inc. Computerized Accounting System/a_Utilities'))

WebUI.click(findTestObject('Object Repository/User Management/Page_CARD, Inc. Computerized Accounting System/a_User Management'))

WebUI.click(findTestObject('Object Repository/User Management/Page_CARD, Inc. Computerized Accounting System/span_Active_fa fa-edit fa-2x'))

WebUI.selectOptionByValue(findTestObject('Object Repository/User Management/Page_CARD, Inc. Computerized Accounting System/select_---Select Item--Cebu 5Cebu 6Cebu 7Ce_aa1df1'), 
    'O5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/User Management/Page_CARD, Inc. Computerized Accounting System/select_---Select Item--Cebu 5Cebu 6Cebu 7Ce_aa1df1'), 
    'O5', true)

WebUI.click(findTestObject('Object Repository/User Management/Page_CARD, Inc. Computerized Accounting System/button_Update'))

WebUI.click(findTestObject('Object Repository/User Management/Page_CARD, Inc. Computerized Accounting System/button_Update'))

WebUI.click(findTestObject('Object Repository/User Management/Page_CARD, Inc. Computerized Accounting System/button_Update'))

WebUI.click(findTestObject('Object Repository/User Management/Page_CARD, Inc. Computerized Accounting System/body_Toggle navigation                     _f81852'))

WebUI.click(findTestObject('Object Repository/User Management/Page_CARD, Inc. Computerized Accounting System/button_Close'))

WebUI.click(findTestObject('Object Repository/User Management/Page_CARD, Inc. Computerized Accounting System/span_Active_userStatus1000'))

WebUI.click(findTestObject('Object Repository/User Management/Page_CARD, Inc. Computerized Accounting System/td'))

WebUI.click(findTestObject('Object Repository/User Management/Page_CARD, Inc. Computerized Accounting System/span_Inactive_userStatus1002'))

WebUI.click(findTestObject('Object Repository/User Management/Page_CARD, Inc. Computerized Accounting System/div_Search'))

WebUI.setText(findTestObject('Object Repository/User Management/Page_CARD, Inc. Computerized Accounting System/input_Search_form-control input-sm'), 
    '')

WebUI.click(findTestObject('Object Repository/User Management/Page_CARD, Inc. Computerized Accounting System/a_Welcome  MANLANGIT                       _04e7c0'))

WebUI.click(findTestObject('Object Repository/User Management/Page_CARD, Inc. Computerized Accounting System/a_Logout'))

