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

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Header_Action'))

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Header_Action_SendForApproval'))

WebUI.delay(5)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Header_Action'))

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Header_Apporve'))

WebUI.delay(5)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Header_Print'))

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Print_FinalPrint'))

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Print_PrintOption'))

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Print_Device'))

WebUI.setText(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Print_Device'), 'D')

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Print_Continue'))

WebUI.delay(5)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Header_EPOtab'))

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Print_Close'))

WebUI.delay(3)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Header_Action'))

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Action_Reciept'))

WebUI.waitForElementPresent(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt/EPO_Reciept_Save'), 20)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt/EPO_Reciept_Save'))

WebUI.delay(3)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt/EPO_Receipt_Action'))

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt/EPO_Receipt_Action_ReceiptLine'))

WebUI.waitForElementPresent(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt_Line/EPO_ReceiptLine_New'), 20)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt_Line/EPO_ReceiptLine_New'))

WebUI.waitForElementPresent(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt_Line/EPO_RecieptLine_Select'), 20)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt_Line/EPO_RecieptLine_Select'))

WebUI.delay(3)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt_Line/EPO_ReceiptLine_SavenClose'))

WebUI.waitForElementPresent(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt_Line/EPO_RecieptLineAction'), 20)

GlobalVariable.G_Unit = WebUI.getText(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt/EPO_Reciept_Unit'))

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt_Line/EPO_RecieptLineAction'))

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt/EPO_Action_Confirm'))

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt/EPO_Reciept_MeterOK'))

WebUI.waitForElementPresent(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt/EPO_RecieptPrint_Device'), 20)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt/EPO_RecieptPrint_Device'))

WebUI.setText(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt/EPO_RecieptPrint_Device'), 'D')

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt/EPO_RecieptPrint_Continue'))

WebUI.delay(3)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt/EPO_RecieptPrint_ProcessCompleted'))

WebUI.delay(10)

