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
import org.apache.commons.validator.Var as Var
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_Action'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_PickPacknInvoice'), 
    30, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_PickPacknInvoice'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_LocationOption'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: if (WebUI.verifyElementVisible(findTestObject('Object Repository/Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_LocationOption')) == 
true) {
    not_run: WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_LocationOption'))
}

not_run: WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

not_run: if (WebUI.verifyElementVisible(findTestObject('Object Repository/Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSaleOrder_PackingSlipClose')) == 
true) {
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

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_CardType'), CardType1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_CardNo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_CardNo'), CardNumber1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_CVV'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_CVV'), '555', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_MM'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_MM'), '09', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_YY'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_YY'), '99', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_SplitPayment'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_SplitTenderYes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_SplitPaymentPlus'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

GlobalVariable.G_OrderAmt = ((WebUI.getText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_OrderTotal'))) as double)

GlobalVariable.G_SplitOrderAmt2 = ((GlobalVariable.G_OrderAmt - 2) as String)

println(GlobalVariable.G_SplitOrderAmt1)

println(GlobalVariable.G_SplitOrderAmt2)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('*********Line 1: Credit Card Started***********************')

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_New'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CC_Interface_Split_CC1_add'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CC_Interface_Split_CC1_add'), 
    CardNumber1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_CVV1_add'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_CVV1_add'), 
    CVV1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Order1_add'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Order1_add'), 
    GlobalVariable.G_SplitOrderAmt1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Save'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('*********Line 2: Credit Card Started***********************')

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_New'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_CC2add'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_CC2add'), 
    CardNumber2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_CVV2add'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_CVV2add'), 
    CVV2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_CardType2'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_CardType2'), 
    CardType2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_CardType2'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Name2'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Name2'), 
    'Test', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Month2'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Month2'), 
    '09', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Year2'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Year2'), 
    '99', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Order2add'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Order2add'), 
    GlobalVariable.G_SplitOrderAmt1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Save'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('*********Line 3: Cash Started***********************')

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_New'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Line3_Cash/Split_3_ModeOfPayment'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Line3_Cash/Split_3_Cashoption'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Line3_Cash/Split_3_OrderAmt'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Line3_Cash/Split_3_OrderAmt'), 
    GlobalVariable.G_SplitOrderAmt2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Save'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Spilt_Action'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Split_ApplyTax'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/Split_Scrollup'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/Split_InvoiceAmt1'), 
    10, FailureHandling.CONTINUE_ON_FAILURE)

GlobalVariable.G_SplitInvoiceAmt1 = WebUI.getText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/Split_InvoiceAmt1'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/Split_InvoiceAmt2'), 
    10, FailureHandling.CONTINUE_ON_FAILURE)

GlobalVariable.G_SplitInvoiceAmt2 = WebUI.getText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/Split_InvoiceAmt2'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Split_SaveNclose'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_Process'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSaleOrder_InvoiceRptDeviceSplit'), 
    20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSaleOrder_InvoiceRptDeviceSplit'), 'D', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSaleOrder_InvoiceRptContinueSplit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

