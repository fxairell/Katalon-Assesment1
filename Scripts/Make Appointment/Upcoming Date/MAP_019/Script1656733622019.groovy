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

WebUI.callTestCase(findTestCase('Login/Make Appointment Button/LGN_001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Spy Mode/Page_CURA Healthcare Service (Make Appointment)/select_Facility'), 'Hongkong CURA Healthcare Center', 
    false)

WebUI.click(findTestObject('Spy Mode/Page_CURA Healthcare Service (Make Appointment)/radbtn_Medicare'))

WebUI.setText(findTestObject('Spy Mode/Page_CURA Healthcare Service (Make Appointment)/input_Visit Date'), '05/07/2022')

WebUI.click(findTestObject('Spy Mode/Page_CURA Healthcare Service (Make Appointment)/btn_Book Appointment'))

WebUI.verifyElementPresent(findTestObject('Spy Mode/Page_CURA Healthcare Service (Appointment Confirmation)/btn_Go to Homepage'), 
    0)

WebUI.closeBrowser()

