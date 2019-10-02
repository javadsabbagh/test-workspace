import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(null)

WebUI.navigateToUrl('http://192.168.100.111')

WebUI.delay(1)

WebUI.setText(findTestObject('keycloak/input_username'), '286661')

WebUI.setEncryptedText(findTestObject('keycloak/input_password'), 'eFl1iyAb2pw=')

WebUI.click(findTestObject('keycloak/btn_login'))

WebUI.delay(2)

WebUI.click(findTestObject('systems/btn_chq_systems'))

WebUI.delay(2)

WebUI.click(findTestObject('systems/btn_clear_system'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('main_menu/menu_main_operation'))

WebUI.delay(1)

WebUI.click(findTestObject('main_menu/manager_dashboard_item'))

WebUI.delay(3)

WebUI.closeBrowser()

