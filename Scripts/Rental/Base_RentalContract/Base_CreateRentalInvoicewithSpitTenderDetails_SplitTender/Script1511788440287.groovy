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

WebUI.doubleClick(findTestObject('Rental/Rental_SplitTenderDetails/SplitTenderDetails'))

WebUI.click(findTestObject('Rental/Rental_SplitTenderDetails/SplitTenderDetails.Yes'))

WebUI.delay(3)

WebUI.click(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.LineSession'))

WebUI.delay(2)

GlobalVariable.G_OrderAmt = ((WebUI.getText(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.OrderAmtHeader'), 
        FailureHandling.CONTINUE_ON_FAILURE)) as double)

GlobalVariable.G_SplitOrderAmt2 = ((GlobalVariable.G_OrderAmt - 2) as String)

WebUI.comment('***********************Line1 started***********************')

WebUI.click(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.NewButton'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.ModeofPayment'))

WebUI.click(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.ModeOfPaymentCreditCard1'))

'Select CC No.'
WebUI.click(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.LineCCNo'))

WebUI.delay(2)

'Pass CC No Variable'
WebUI.setText(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.LineCCNo'), CCNo1)

WebUI.delay(5)

'Click on CVV '
WebUI.doubleClick(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.LineCVV'))

WebUI.delay(2)

'Pass CVV variable'
WebUI.setText(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.LineCVV'), CVV1)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.LineOrderAmount1'), 4)

WebUI.delay(5)

WebUI.click(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.LineOrderAmount1'))

WebUI.delay(3)

WebUI.setText(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.LineOrderAmount1'), GlobalVariable.G_SplitOrderAmt1)

WebUI.delay(2)

WebUI.comment('***********************Line2 started***********************')

WebUI.click(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.NewButton'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.ModeofPayment1'))

WebUI.click(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.ModeOfPaymentCreditCard2'))

WebUI.delay(3)

'Select CC No.'
WebUI.click(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.Line2CCNo'))

WebUI.delay(2)

'Pass CC No Variable'
WebUI.setText(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.Line2CCNo'), CCNo2)

WebUI.delay(2)

'Click on CVV '
WebUI.click(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.Line2CVV'))

WebUI.delay(3)

'Pass CVV variable'
WebUI.setText(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.Line2CVV'), CVV2)

WebUI.delay(3)

WebUI.click(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.CardTypeLine2'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.CardTypeLine2'), CardType2)

WebUI.delay(5)

WebUI.click(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.ExpiryMonthLine2'))

WebUI.delay(3)

WebUI.setText(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.ExpiryMonthLine2'), '09')

WebUI.delay(2)

WebUI.click(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.ExpiryYearLine2'))

WebUI.delay(2)

WebUI.setText(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.ExpiryYearLine2'), '99')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.LineOrderAmount2'), 2)

WebUI.delay(2)

WebUI.click(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.LineOrderAmount2'))

WebUI.delay(2)

WebUI.setText(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.LineOrderAmount2'), GlobalVariable.G_SplitOrderAmt1)

WebUI.delay(2)

WebUI.comment('***********************Line3 started***********************')

WebUI.click(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.NewButton'))

WebUI.delay(3)

WebUI.doubleClick(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.ModeofPayment2'))

WebUI.delay(5)

not_run: WebUI.click(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.ModeOfPaymentCash'))

WebUI.click(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.ModeOfPaymentCash'))

WebUI.delay(10)

not_run: WebUI.scrollToElement(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.LineOrderAmount3'), 0)

WebUI.click(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.LineOrderAmount3'))

WebUI.delay(2)

WebUI.setText(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.LineOrderAmount3'), GlobalVariable.G_SplitOrderAmt2)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.Action'))

WebUI.delay(2)

WebUI.click(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.ApplyTax'))

WebUI.delay(2)

GlobalVariable.G_SplitInvoiceAmt1 = WebUI.getText(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.InvoiceAmt1'))

GlobalVariable.G_SplitInvoiceAmt2 = WebUI.getText(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.InvoiceAmt2'))

WebUI.click(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.SaveClose'))

WebUI.delay(2)

'Click on Process button of CC Interface'
WebUI.click(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.CCProcess'))

WebUI.delay(13)

'Click OK of Print Device'
WebUI.click(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.PrintDevice'))

WebUI.delay(10)

'Click Print Button'
WebUI.click(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.PrintOK'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental/Rental_SplitTenderDetails/SplitTender.CloseRentalInvocieSession'))

WebUI.delay(5)

WebUI.closeBrowser()

