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

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_Action'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_PickPacknInvoice'), 
    30, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_PickPacknInvoice'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.verifyElementPresent(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_LocationOption'), 
    10, FailureHandling.CONTINUE_ON_FAILURE)

not_run: if (WebUI.verifyElementPresent(findTestObject('Object Repository/Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_LocationOption'), 
    30, FailureHandling.CONTINUE_ON_FAILURE) == true) {
    not_run: WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_LocationOption'))
}

not_run: WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

not_run: if (WebUI.verifyElementPresent(findTestObject('Object Repository/Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSaleOrder_PackingSlipClose'), 
    10, FailureHandling.CONTINUE_ON_FAILURE) == true) {
    not_run: WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSaleOrder_PackingSlipClose'))
}

WebUI.waitForElementPresent(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PSO_PackingSlip_Device'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PSO_PackingSlip_Device'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PSO_PackingSlip_Device'), 'D', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PSO_PackingSlip_Continue'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_ContinueInvoiceOption'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_PaymentGateway'), Gateway, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_CardType'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_CardType'), CardType, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_CardNo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_CardNo'), CardNumber, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_CVV'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_CVV'), '555', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_MM'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_MM'), '09', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_YY'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_YY'), '99', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_Process'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSaleOrder_InvoiceRptDevice'), 
    40, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSaleOrder_InvoiceRptDevice'), 'D', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSaleOrder_InvoiceRptContinue'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

