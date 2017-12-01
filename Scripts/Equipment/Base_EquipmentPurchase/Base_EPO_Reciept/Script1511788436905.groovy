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

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Header_Action'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Header_Action_SendForApproval'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Header_Action'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Header_Apporve'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Header_Print'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Print_FinalPrint'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Print_PrintOption'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Print_Device'), 20)

WebUI.doubleClick(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Print_Device'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Print_Device'), 'D', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Print_Continue'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Header_EPOtab'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Print_Close'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Header_Action'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Header/EPO_Action_Reciept'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt/EPO_Reciept_Save'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt/EPO_Reciept_Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt/EPO_Receipt_Action'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt/EPO_Receipt_Action_ReceiptLine'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt_Line/EPO_ReceiptLine_New'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt_Line/EPO_ReceiptLine_New'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt_Line/EPO_RecieptLine_Select'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt_Line/EPO_RecieptLine_Select'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt_Line/EPO_ReceiptLine_SavenClose'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt_Line/EPO_RecieptLineAction'), 20, FailureHandling.CONTINUE_ON_FAILURE)

GlobalVariable.G_Unit = WebUI.getText(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt/EPO_Reciept_Unit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt_Line/EPO_RecieptLineAction'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt/EPO_Action_Confirm'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt/EPO_Reciept_MeterOK'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.waitForElementPresent(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt/EPO_RecieptPrint_Device'), 
    20, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt/EPO_RecieptPrint_Device'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt/EPO_RecieptPrint_Device'), 'D', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt/EPO_RecieptPrint_Continue'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentPurchase/EPO_Receipt/EPO_RecieptPrint_ProcessCompleted'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

