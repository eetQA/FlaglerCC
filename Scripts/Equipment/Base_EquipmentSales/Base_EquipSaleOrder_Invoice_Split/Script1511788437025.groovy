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

WebUI.setText(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_CardType'), CardType1)

WebUI.delay(3)

WebUI.doubleClick(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_CardNo'))

WebUI.setText(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_CardNo'), CCNo1)

WebUI.setText(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_CVV'), CVV1)

WebUI.setText(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_MM'), '09')

WebUI.setText(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_YY'), '99')

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_SplitPayment'))

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_SplitTenderYes'))

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_SplitPaymentPlus'))

WebUI.delay(5)

GlobalVariable.G_OrderAmt = ((WebUI.getText(findTestObject('Object Repository/Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_OrderTotal'))) as double)

GlobalVariable.G_SplitOrderAmt2 = ((GlobalVariable.G_OrderAmt - 2) as String)

println(GlobalVariable.G_SplitOrderAmt1)

println(GlobalVariable.G_SplitOrderAmt2)

WebUI.delay(2)

WebUI.comment('*********Line 1: Credit Card Started***********************')

WebUI.click(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_New'))

WebUI.delay(2)

WebUI.click(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/CC_Interface_Split_CC1_add'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/CC_Interface_Split_CC1_add'), 
    CCNo1)

WebUI.click(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/CC_Interface_Split_CC1_add'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_CVV1_add'), 
    CVV1)

WebUI.click(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Order1_add'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Order1_add'), 
    GlobalVariable.G_SplitOrderAmt1)

WebUI.click(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('*********Line 2: Credit Card Started***********************')

WebUI.click(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_New'))

WebUI.delay(2)

WebUI.click(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_CC2add'))

WebUI.delay(2)

WebUI.setText(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_CC2add'), CCNo2)

WebUI.delay(2)

WebUI.click(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_CVV2add'))

WebUI.delay(2)

WebUI.setText(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_CVV2add'), CVV2)

WebUI.click(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_CardType2'))

WebUI.click(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Name2'))

WebUI.delay(2)

WebUI.setText(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Name2'), 'Robin')

WebUI.click(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Month2'))

WebUI.delay(2)

WebUI.setText(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Month2'), '09')

WebUI.click(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Year2'))

WebUI.delay(2)

WebUI.setText(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Year2'), '99')

WebUI.click(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Order2add'))

WebUI.delay(2)

WebUI.setText(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Order2add'), 
    GlobalVariable.G_SplitOrderAmt1)

WebUI.click(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('*********Line 3: Cash Started***********************')

WebUI.click(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_New'))

WebUI.delay(2)

WebUI.click(findTestObject('Equipment/EquipmentSales/SplitPayment/Line3_Cash/Split_3_ModeOfPayment'))

WebUI.click(findTestObject('Equipment/EquipmentSales/SplitPayment/Line3_Cash/Split_3_Cashoption'))

WebUI.click(findTestObject('Equipment/EquipmentSales/SplitPayment/Line3_Cash/Split_3_OrderAmt'))

WebUI.delay(2)

WebUI.setText(findTestObject('Equipment/EquipmentSales/SplitPayment/Line3_Cash/Split_3_OrderAmt'), GlobalVariable.G_SplitOrderAmt2)

WebUI.click(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/CCInterface_Split_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/SplitPayment/Spilt_Action'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/SplitPayment/Split_ApplyTax'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/Split_Scrollup'))

WebUI.scrollToElement(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/Split_InvoiceAmt1'), 10)

GlobalVariable.G_SplitInvoiceAmt1 = WebUI.getText(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/Split_InvoiceAmt1'))

WebUI.scrollToElement(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/Split_InvoiceAmt2'), 10)

GlobalVariable.G_SplitInvoiceAmt2 = WebUI.getText(findTestObject('Equipment/EquipmentSales/SplitPayment/Page_Infor LN UI (1)/Split_InvoiceAmt2'))

WebUI.delay(5)

WebUI.click(findTestObject('Equipment/EquipmentSales/SplitPayment/Split_SaveNclose'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/CCInterface_Process'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/EPO_SplitInvoice_TextSelection'), 
    20)

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/EPO_SplitInvoice_TextSelection'))

WebUI.setText(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/EPO_SplitInvoice_Device '), 'D')

WebUI.click(findTestObject('Equipment/EquipmentSales/EquipmentSalesInvoiceCC/EPO_SplitInvoice_Continue '))

WebUI.delay(10)

