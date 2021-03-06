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

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrderLine1/PartSaleOrderLine1_newpart'))

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrderLine1/PartSaleOrderLine1_PartNumber'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Parts/PartsSalesOrder/PartSalesOrderLine1/PartSaleOrderLine1_PartNumber'), PartName)

WebUI.scrollToElement(findTestObject('Parts/PartsSalesOrder/PartSalesOrderLine1/PartSaleOrderLine1_Quantity'), 10)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrderLine1/PartSaleOrderLine1_Quantity'))

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrderLine1/PartSaleOrderLine1-Qty1'), Qty)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesorder_Save'))

WebUI.delay(10)

not_run: WebUI.scrollToElement(findTestObject('Parts/PartsSalesOrder/PartSalesOrderLine1/PartSaleOrderLine1_firmPrice'), 
    10)

not_run: GlobalVariable.G_InvoiceAmt = ((WebUI.getText(findTestObject('tdtre4101m002/Line1/firmPrice'))) as float)

not_run: Qty1 = ((WebUI.getText(findTestObject('tdtre4101m002/Line1/input_tdtre4101s002-Qty'))) as float)

not_run: GlobalVariable.G_OrderLineAmt = (GlobalVariable.G_FirmPrice * Qty1)

not_run: println('GlobalVariable.G_FirmPrice' + GlobalVariable.G_FirmPrice)

not_run: println('GlobalVariable.G_OrderLineAmt' + GlobalVariable.G_OrderLineAmt)

