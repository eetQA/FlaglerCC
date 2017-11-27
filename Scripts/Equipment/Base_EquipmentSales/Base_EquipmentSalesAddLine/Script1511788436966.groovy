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

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/EquipSalesOrder_SalesOrderLine'))

WebUI.waitForElementPresent(findTestObject('Equipment/EquipmentSales/EquipSalesOrderLines/EquipSaleOrderLine_New'), 20)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipSalesOrderLines/EquipSaleOrderLine_New'))

WebUI.waitForElementPresent(findTestObject('Equipment/EquipmentSales/EquipSalesOrderLines/EquipSalesOrder_Model'), 20)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipSalesOrderLines/EquipSalesOrder_Model'))

WebUI.setText(findTestObject('Equipment/EquipmentSales/EquipSalesOrderLines/EquipSalesOrder_Model'), Model)

WebUI.doubleClick(findTestObject('Equipment/EquipmentSales/EquipSalesOrderLines/ESO_Line_Unit'))

WebUI.delay(2)

WebUI.setText(findTestObject('Equipment/EquipmentSales/EquipSalesOrderLines/ESO_Line_Unit'), GlobalVariable.G_Unit)

WebUI.doubleClick(findTestObject('Equipment/EquipmentSales/EquipSalesOrderLines/EquipSalesOrder_Price'))

WebUI.delay(2)

WebUI.setText(findTestObject('Equipment/EquipmentSales/EquipSalesOrderLines/EquipSalesOrder_Price'), '10')

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipSalesOrderLines/EquipSaleOrder_Save'))

WebUI.waitForElementPresent(findTestObject('Equipment/EquipmentSales/EquipSalesOrderLines/EquipSalesOrder_taxok'), 20)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipSalesOrderLines/EquipSalesOrder_taxok'))

not_run: WebUI.click(findTestObject('Equipment/EquipmentSales/EquipSalesOrderLines/EquipSalesOrder_ImportNOoption'))

WebUI.delay(2)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipSalesOrderLines/EquipSaleOrder_SavenClose'))

WebUI.delay(2)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesAgreementHeader/EquipSalesOrder_MMTsavenClose'))

