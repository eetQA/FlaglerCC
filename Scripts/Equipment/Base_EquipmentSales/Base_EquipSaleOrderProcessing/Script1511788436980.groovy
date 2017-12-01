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

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/EquipSalesOrder_Action'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipSalesOrder_Process/EquipSalesOrder_SendForApproval'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Equipment/EquipmentSales/EquipSalesOrder_Process/EquipSalesOrder_Status'), 'Pending for Approval', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/EquipSalesOrder_Action'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipSalesOrder_Process/EquipSalesOrder_Action_Approve'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/EquipSalesOrder_Action'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Equipment/EquipmentSales/EquipSalesOrder_Process/EquipSalesOrder_Status'), 'Approved', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/ESO_Header_Print'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/ESO_Header_Print_FinalPrint'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/ESO_Header_Print_Print'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/ESO_Header_Print_ESOOK'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/ESO_Print_Device'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/ESO_Print_Device'), 'D', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/ESO_Header_Print_Continue'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/ESO_Tab'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/ESO_Print_Close'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/EquipSalesOrder_Action'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/ESO_Header_Action_EquipmentDelivery'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_Delivery_Agreement'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_Delivery_Agreement'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_Delivery_Save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_Delivery_Action'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_Delivery_Action_Line'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_DeliveryLine_New'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_DeliveryLine_New'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_DeliveryLine_SelectLine'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_SelectDeliveryLine_SaveNclose'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_DeliveryLine_Action'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_Delivery_ActionConfirm'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_Delivery_ConfirmYes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_DeliveryLine_Action'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_DeliveryLine_PrintMemo'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_Delivery_ConfirmOk'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.sendKeys(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_Delivery_Device'), 'D', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(100000, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_Delivery_Device'), 'D', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_Delivery_printContinue'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

