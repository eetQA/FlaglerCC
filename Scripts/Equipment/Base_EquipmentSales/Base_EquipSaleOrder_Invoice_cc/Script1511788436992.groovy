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

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_EquipDeliveryTab'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_Delivery_Action'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentDelivery/ESO_Delivery_Action_SaleInvoice'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/ESO_CC_ContinueInvoice'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_PaymentGateway'), Gateway, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_CardType'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_CardType'), CardType, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_CardNo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_CardNo'), CCNo, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_CVV'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_CVV'), '514', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_MM'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_MM'), '09', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_YY'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_YY'), '99', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_Process'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(100, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/EPO_Invoice_TextSelection'), 
    20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/EPO_Invoice_TextSelection'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/EPO_Invoice_Device'), 'D', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/EPO_Invoice_Continue'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

