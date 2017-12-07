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

not_run: WebUI.callTestCase(findTestCase('Rental/Base_RentalContract/Base_CreateRentalHeader'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Rental/RentalHeader/RentalInvoice/RentalInvoice.InvoicingscheduleTab'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Rental/RentalHeader/RentalInvoice/RentalInvoice.Action'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Rental/RentalHeader/RentalInvoice/RentalInvoice.ProcessInvoice'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Rental/RentalHeader/RentalInvoice/RentalInvoice.ProcessInvoice2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Rental/RentalHeader/RentalInvoice/RentalInvoice.InvoiceProcessYES'), FailureHandling.CONTINUE_ON_FAILURE)

'CC Inteface_Please check IDs'
WebUI.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

'Pass Payment Gateway variable'
WebUI.sendKeys(findTestObject('Rental/RentalHeader/RentalInvoice/ServiceCreditCard.PaymentGateway'), PaymentGatwayTC, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.sendKeys(findTestObject('Rental/RentalHeader/RentalInvoice/ServiceCreditCard.PaymentGateway'), Keys.chord(
        Keys.TAB), FailureHandling.CONTINUE_ON_FAILURE)

'Click on Card Type'
WebUI.doubleClick(findTestObject('Rental/RentalHeader/RentalInvoice/ServiceCreditCard.CardType'), FailureHandling.CONTINUE_ON_FAILURE)

'CC Inteface_Please check IDs'
WebUI.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

'Pass Card Type variable '
WebUI.setText(findTestObject('Rental/RentalHeader/RentalInvoice/ServiceCreditCard.CardType'), CardTypeTC, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Select CC No.'
WebUI.doubleClick(findTestObject('Rental/RentalHeader/RentalInvoice/ServiceCreditCard.Enter CC No'), FailureHandling.CONTINUE_ON_FAILURE)

'CC Inteface_Please check IDs'
WebUI.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

'Pass CC No Variable'
WebUI.sendKeys(findTestObject('Rental/RentalHeader/RentalInvoice/ServiceCreditCard.Enter CC No'), CCNOTC, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Click on CVV '
WebUI.click(findTestObject('Rental/RentalHeader/RentalInvoice/ServiceCreditCard.CVV2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Pass CVV variable'
WebUI.sendKeys(findTestObject('Rental/RentalHeader/RentalInvoice/ServiceCreditCard.CVV2'), CVVTC, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.sendKeys(findTestObject('Rental/RentalHeader/RentalInvoice/ServiceCreditCard.Enter CC No'), Keys.chord(Keys.TAB), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

'Enter Expiry Month 09'
WebUI.setText(findTestObject('Rental/RentalHeader/RentalInvoice/ServiceCreditCard.ExpiryMonth'), '09', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

'Enter Expiry Year 99'
WebUI.setText(findTestObject('Rental/RentalHeader/RentalInvoice/ServiceCreditCard.ExpiryYear'), '99', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

'Click on Process button of CC Interface'
WebUI.click(findTestObject('Rental/RentalHeader/RentalInvoice/ServiceCreditCard.Process'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(13, FailureHandling.CONTINUE_ON_FAILURE)

'Click OK of Print Device'
WebUI.click(findTestObject('Rental/RentalHeader/RentalInvoice/ServiceCreditCard.PrintDevice'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

'Click Print Button'
WebUI.click(findTestObject('Rental/RentalHeader/RentalInvoice/ServiceCreditCard.PrintOK'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Rental/RentalHeader/RentalInvoice/RentalInvoice.CloseRentalInvoicesession'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

