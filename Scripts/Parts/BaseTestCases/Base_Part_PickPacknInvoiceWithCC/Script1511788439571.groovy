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

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_Action'))

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_PickPacknInvoice'), 
    30)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_PickPacknInvoice'))

WebUI.delay(5)

not_run: WebUI.verifyElementPresent(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_LocationOption'), 
    10)

not_run: if (WebUI.verifyElementPresent(findTestObject('Object Repository/Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_LocationOption'), 
    30, FailureHandling.CONTINUE_ON_FAILURE) == true) {
    not_run: WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_LocationOption'))
}

WebUI.delay(3)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSaleOrder_PackingSlipClose'), 
    10, FailureHandling.CONTINUE_ON_FAILURE) == true) {
    WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSaleOrder_PackingSlipClose'))
}

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_ContinueInvoiceOption'))

WebUI.delay(3)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_PaymentGateway'), Gateway)

WebUI.doubleClick(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_CardType'))

WebUI.delay(2)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_CardType'), CardType)

WebUI.delay(3)

WebUI.doubleClick(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_CardNo'))

WebUI.delay(2)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_CardNo'), CardNumber)

WebUI.doubleClick(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_CVV'))

WebUI.delay(2)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_CVV'), '555')

WebUI.doubleClick(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_MM'))

WebUI.delay(2)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_MM'), '09')

WebUI.doubleClick(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_YY'))

WebUI.delay(2)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_YY'), '99')

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_Process'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSaleOrder_InvoiceRptDevice'), 
    40)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSaleOrder_InvoiceRptDevice'), 'D')

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSaleOrder_InvoiceRptContinue'))

WebUI.delay(10)

