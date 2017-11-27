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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Common/Base_Common_OpenSession'), [('SessionID') : 'tdext8570m000'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/EquipmentSalesOrder_MMT_New'), 
    15)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/EquipmentSalesOrder_MMT_New'))

WebUI.setText(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/EquipmentSalesOrder_Customer'), BP)

WebUI.doubleClick(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/EquipmentSalesOrder_DeliveryDate'))

WebUI.setText(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/EquipmentSalesOrder_DeliveryDate'), 
    '+10')

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/ESO_Header_Tax'))

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/EquipmentSalesOrder_OtherDetailsTab'))

WebUI.delay(3)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/EquipmentSalesOrder_PaymentMethod'))

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/EquimentSalesOrder_CreditCardOption'))

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/EquipmentSaleOrder_Save'))

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/EquipmentSalesOrder_DetailsTab'))

WebUI.delay(5)

GlobalVariable.G_Part_PSO = WebUI.getAttribute(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/EquipmentSaleOrder_OrderNo'), 
    'value')

