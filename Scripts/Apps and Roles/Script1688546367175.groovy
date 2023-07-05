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

WebUI.setText(findTestObject('Object Repository/Application and Roles/Page_CARD, Inc. Computerized Accounting System/input_Please Sign In_userName'), 
    'admanlangit')

WebUI.setEncryptedText(findTestObject('Object Repository/Application and Roles/Page_CARD, Inc. Computerized Accounting System/input_Please Sign In_passWord'), 
    'MHSUC33hkPnBWRnjFBNCPA==')

WebUI.sendKeys(findTestObject('Object Repository/Application and Roles/Page_CARD, Inc. Computerized Accounting System/input_Please Sign In_passWord'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Application and Roles/Page_CARD, Inc. Computerized Accounting System/a_Utilities'))

WebUI.click(findTestObject('Object Repository/Application and Roles/Page_CARD, Inc. Computerized Accounting System/a_Manage Application'))

WebUI.click(findTestObject('Object Repository/Application and Roles/Page_CARD, Inc. Computerized Accounting System/a_Manage Roles'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Application and Roles/Page_CARD, Inc. Computerized Accounting System/select_---Select Item--General ClerkBookkee_48559c'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application and Roles/Page_CARD, Inc. Computerized Accounting System/select_---Select Item--General ClerkBookkee_48559c'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application and Roles/Page_CARD, Inc. Computerized Accounting System/select_---Select Item--General ClerkBookkee_48559c'), 
    '11', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application and Roles/Page_CARD, Inc. Computerized Accounting System/select_---Select Item--General ClerkBookkee_48559c'), 
    '19', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application and Roles/Page_CARD, Inc. Computerized Accounting System/select_---Select Item--General ClerkBookkee_48559c'), 
    '20', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application and Roles/Page_CARD, Inc. Computerized Accounting System/select_---Select Item--General ClerkBookkee_48559c'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application and Roles/Page_CARD, Inc. Computerized Accounting System/select_---Select Item--General ClerkBookkee_48559c'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application and Roles/Page_CARD, Inc. Computerized Accounting System/select_---Select Item--General ClerkBookkee_48559c'), 
    '18', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application and Roles/Page_CARD, Inc. Computerized Accounting System/select_---Select Item--General ClerkBookkee_48559c'), 
    '17', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application and Roles/Page_CARD, Inc. Computerized Accounting System/select_---Select Item--General ClerkBookkee_48559c'), 
    '25', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application and Roles/Page_CARD, Inc. Computerized Accounting System/select_---Select Item--General ClerkBookkee_48559c'), 
    '13', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application and Roles/Page_CARD, Inc. Computerized Accounting System/select_---Select Item--General ClerkBookkee_48559c'), 
    '14', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application and Roles/Page_CARD, Inc. Computerized Accounting System/select_---Select Item--General ClerkBookkee_48559c'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application and Roles/Page_CARD, Inc. Computerized Accounting System/select_---Select Item--General ClerkBookkee_48559c'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application and Roles/Page_CARD, Inc. Computerized Accounting System/select_---Select Item--General ClerkBookkee_48559c'), 
    '9', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application and Roles/Page_CARD, Inc. Computerized Accounting System/select_---Select Item--General ClerkBookkee_48559c'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application and Roles/Page_CARD, Inc. Computerized Accounting System/select_---Select Item--General ClerkBookkee_48559c'), 
    '15', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application and Roles/Page_CARD, Inc. Computerized Accounting System/select_---Select Item--General ClerkBookkee_48559c'), 
    '21', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application and Roles/Page_CARD, Inc. Computerized Accounting System/select_---Select Item--General ClerkBookkee_48559c'), 
    '24', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Application and Roles/Page_CARD, Inc. Computerized Accounting System/select_---Select Item--General ClerkBookkee_48559c'), 
    '6', true)

WebUI.click(findTestObject('Object Repository/Application and Roles/Page_CARD, Inc. Computerized Accounting System/b_MANLANGIT                        Admin'))

WebUI.click(findTestObject('Object Repository/Application and Roles/Page_CARD, Inc. Computerized Accounting System/a_Logout'))

WebUI.closeBrowser()

