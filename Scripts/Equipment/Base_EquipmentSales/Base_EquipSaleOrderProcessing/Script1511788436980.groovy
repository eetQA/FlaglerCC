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

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/EquipSalesOrder_Action'))

WebUI.delay(2)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipSalesOrder_Process/EquipSalesOrder_SendForApproval'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Equipment/EquipmentSales/EquipSalesOrder_Process/EquipSalesOrder_Status'), 'Pending for Approval')

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/EquipSalesOrder_Action'))

WebUI.delay(2)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipSalesOrder_Process/EquipSalesOrder_Action_Approve'))

WebUI.delay(2)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/EquipSalesOrder_Action'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Equipment/EquipmentSales/EquipSalesOrder_Process/EquipSalesOrder_Status'), 'Approved')

WebUI.delay(2)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/ESO_Header_Print'))

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/ESO_Header_Print_FinalPrint'))

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/ESO_Header_Print_Print'))

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/ESO_Header_Print_ESOOK'))

WebUI.delay(2)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/ESO_Print_Device'))

WebUI.delay(2)

WebUI.setText(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/ESO_Print_Device'), 'D')

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/ESO_Header_Print_Continue'))

WebUI.delay(3)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/ESO_Tab'))

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/ESO_Print_Close'))

WebUI.delay(3)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/EquipSalesOrder_Action'))

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/ESO_Header_Action_EquipmentDelivery'))

WebUI.waitForElementPresent(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_Delivery_Agreement'), 20)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_Delivery_Agreement'))

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_Delivery_Save'))

WebUI.delay(3)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_Delivery_Action'))

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_Delivery_Action_Line'))

WebUI.waitForElementPresent(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_DeliveryLine_New'), 20)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_DeliveryLine_New'))

WebUI.delay(2)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_DeliveryLine_SelectLine'))

WebUI.delay(2)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_SelectDeliveryLine_SaveNclose'))

WebUI.delay(2)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_DeliveryLine_Action'))

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_Delivery_ActionConfirm'))

WebUI.delay(3)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_Delivery_ConfirmYes'))

not_run: WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_Delivery_ConfirmOk'))

WebUI.setText(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_Delivery_Device'), 'D')

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_Delivery_printContinue'))

WebUI.delay(5)

