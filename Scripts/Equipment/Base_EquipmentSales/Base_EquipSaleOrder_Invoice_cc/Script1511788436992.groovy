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

WebUI.delay(5)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_EquipDeliveryTab'))

WebUI.delay(3)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_Delivery_Action'))

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_Delivery_Action_SaleInvoice'))

WebUI.delay(3)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/ESO_CC_ContinueInvoice'))

WebUI.delay(3)

WebUI.setText(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_PaymentGateway'), Gateway)

WebUI.doubleClick(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_CardType'))

WebUI.setText(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_CardType'), CardType)

WebUI.delay(3)

WebUI.doubleClick(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_CardNo'))

WebUI.setText(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_CardNo'), CCNo)

WebUI.setText(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_CVV'), CVV)

WebUI.setText(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_MM'), '09')

WebUI.setText(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_YY'), '99')

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_Process'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/EPO_Invoice_TextSelection'), 
    20)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/EPO_Invoice_TextSelection'))

WebUI.setText(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/EPO_Invoice_Device'), 'D')

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/EPO_Invoice_Continue'))

WebUI.delay(10)

