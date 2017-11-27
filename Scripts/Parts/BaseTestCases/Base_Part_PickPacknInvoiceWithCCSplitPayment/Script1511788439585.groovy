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

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_Action'))

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_PickPacknInvoice'), 
    30)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_PickPacknInvoice'))

WebUI.delay(5)

not_run: WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_LocationOption'))

if (WebUI.verifyElementVisible(findTestObject('Object Repository/Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_LocationOption')) == 
true) {
    WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_LocationOption'))
}

WebUI.delay(3)

not_run: if (WebUI.verifyElementVisible(findTestObject('Object Repository/Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSaleOrder_PackingSlipClose')) == 
true) {
    WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSaleOrder_PackingSlipClose'))
}

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSalesOrder_ContinueInvoiceOption'))

WebUI.delay(3)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_PaymentGateway'), Gateway)

WebUI.doubleClick(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_CardType'))

WebUI.delay(2)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_CardType'), CardType1)

WebUI.delay(3)

WebUI.doubleClick(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_CardNo'))

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_CardNo'), CardNumber1)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_CVV'), CVV1)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_MM'), '09')

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_YY'), '99')

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_SplitPayment'))

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_SplitTenderYes'))

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_SplitPaymentPlus'))

WebUI.delay(5)

GlobalVariable.G_OrderAmt = ((WebUI.getText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_OrderTotal'))) as double)

GlobalVariable.G_SplitOrderAmt2 = ((GlobalVariable.G_OrderAmt - 2) as String)

println(GlobalVariable.G_SplitOrderAmt1)

println(GlobalVariable.G_SplitOrderAmt2)

WebUI.delay(2)

WebUI.comment('*********Line 1: Credit Card Started***********************')

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_New'))

WebUI.delay(2)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CC_Interface_Split_CC1_add'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CC_Interface_Split_CC1_add'), 
    CardNumber1)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_CVV1_add'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_CVV1_add'), 
    CVV1)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Order1_add'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Order1_add'), 
    GlobalVariable.G_SplitOrderAmt1)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Save'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.comment('*********Line 2: Credit Card Started***********************')

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_New'))

WebUI.delay(2)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_CC2add'))

WebUI.delay(2)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_CC2add'), 
    CardNumber2)

WebUI.delay(2)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_CVV2add'))

WebUI.delay(2)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_CVV2add'), 
    CVV2)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_CardType2'))

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Name2'))

WebUI.delay(2)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Name2'), 
    'Test')

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Month2'))

WebUI.delay(2)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Month2'), 
    '09')

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Year2'))

WebUI.delay(2)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Year2'), 
    '99')

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Order2add'))

WebUI.delay(2)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Order2add'), 
    GlobalVariable.G_SplitOrderAmt1)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Save'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.comment('*********Line 3: Cash Started***********************')

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_New'))

WebUI.delay(2)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Line3_Cash/Split_3_ModeOfPayment'))

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Line3_Cash/Split_3_Cashoption'))

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Line3_Cash/Split_3_OrderAmt'))

WebUI.delay(2)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Line3_Cash/Split_3_OrderAmt'), 
    GlobalVariable.G_SplitOrderAmt2)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Save'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Spilt_Action'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Split_ApplyTax'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/Split_Scrollup'))

WebUI.scrollToElement(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/Split_InvoiceAmt1'), 
    10)

GlobalVariable.G_SplitInvoiceAmt1 = WebUI.getText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/Split_InvoiceAmt1'))

WebUI.scrollToElement(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/Split_InvoiceAmt2'), 
    10)

GlobalVariable.G_SplitInvoiceAmt2 = WebUI.getText(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Page_Infor LN UI (1)/Split_InvoiceAmt2'))

WebUI.delay(5)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/SplitPayment/Split_SaveNclose'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartSalesOrder_CCInterface/CCInterface_Process'))

WebUI.waitForElementPresent(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSaleOrder_InvoiceRptDeviceSplit'), 
    20)

WebUI.setText(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSaleOrder_InvoiceRptDeviceSplit'), 'D')

WebUI.click(findTestObject('Parts/PartsSalesOrder/PartsSaleOrderHeader/PartSaleOrder_InvoiceRptContinueSplit'))

WebUI.delay(10)

