import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Common/Base_Common_OpenSession'), [('SessionID') : 'tdext8150s000'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Header_New'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Header_New'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Header_Customer'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Header_Customer'), 'BP0009523', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Header_Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Header_Action'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Header_Action_OrderLines'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Equipment/EquipmentPurchase/EPO_Line/EPO_MultiLine_New'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Line/EPO_MultiLine_New'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Equipment/EquipmentPurchase/EPO_Line/EPO_Line_Model'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Line/EPO_Line_Model'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Equipment/EquipmentPurchase/EPO_Line/EPO_Line_Model'), Model, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Line/EPO_Line_NeworUsed'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Line/EPO_Line_NewEquipOption'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Line/EPO_Line_PlannedDate'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Equipment/EquipmentPurchase/EPO_Line/EPO_Line_PlannedDate'), '+10', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Line/EPO_Line_Price'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Equipment/EquipmentPurchase/EPO_Line/EPO_Line_Price'), '100', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Line/EPO_Line_Save'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Line/EPO_Line_importNO'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Line/EPO_Line_SaveNclose'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Line/EPO_MultiLine_SavenClose'), FailureHandling.CONTINUE_ON_FAILURE)

