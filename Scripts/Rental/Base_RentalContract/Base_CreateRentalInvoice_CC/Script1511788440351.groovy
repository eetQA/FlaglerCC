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

WebUI.delay(4)

WebUI.click(findTestObject('Rental/RentalHeader/RentalInvoice/RentalInvoice.InvoicingscheduleTab'))

WebUI.delay(4)

WebUI.click(findTestObject('Rental/RentalHeader/RentalInvoice/RentalInvoice.Action'))

WebUI.delay(4)

WebUI.click(findTestObject('Rental/RentalHeader/RentalInvoice/RentalInvoice.ProcessInvoice'))

WebUI.delay(4)

WebUI.click(findTestObject('Rental/RentalHeader/RentalInvoice/RentalInvoice.ProcessInvoice2'))

WebUI.delay(0)

WebUI.click(findTestObject('Rental/RentalHeader/RentalInvoice/RentalInvoice.InvoiceProcessYES'))

'CC Inteface_Please check IDs'
WebUI.delay(0)

'Pass Payment Gateway variable'
WebUI.setText(findTestObject('Rental/RentalHeader/RentalInvoice/ServiceCreditCard.PaymentGateway'), PaymentGatwayTC)

not_run: WebUI.sendKeys(findTestObject('Rental/RentalHeader/RentalInvoice/ServiceCreditCard.PaymentGateway'), Keys.chord(
        Keys.TAB))

'Click on Card Type'
WebUI.doubleClick(findTestObject('Rental/RentalHeader/RentalInvoice/ServiceCreditCard.CardType'))

'Pass Card Type variable '
WebUI.setText(findTestObject('Rental/RentalHeader/RentalInvoice/ServiceCreditCard.CardType'), CardTypeTC)

WebUI.delay(2)

'Select CC No.'
WebUI.doubleClick(findTestObject('Rental/RentalHeader/RentalInvoice/ServiceCreditCard.Enter CC No'))

'Pass CC No Variable'
WebUI.sendKeys(findTestObject('Rental/RentalHeader/RentalInvoice/ServiceCreditCard.Enter CC No'), CCNOTC)

WebUI.delay(2)

'Click on CVV '
WebUI.click(findTestObject('Rental/RentalHeader/RentalInvoice/ServiceCreditCard.CVV2'))

'Pass CVV variable'
WebUI.sendKeys(findTestObject('Rental/RentalHeader/RentalInvoice/ServiceCreditCard.CVV2'), CVVTC)

not_run: WebUI.sendKeys(findTestObject('Rental/RentalHeader/RentalInvoice/ServiceCreditCard.Enter CC No'), Keys.chord(Keys.TAB))

not_run: WebUI.delay(3)

WebUI.delay(3)

'Enter Expiry Month 09'
WebUI.setText(findTestObject('Rental/RentalHeader/RentalInvoice/ServiceCreditCard.ExpiryMonth'), '09')

'Enter Expiry Year 99'
WebUI.setText(findTestObject('Rental/RentalHeader/RentalInvoice/ServiceCreditCard.ExpiryYear'), '99')

'Click on Process button of CC Interface'
WebUI.click(findTestObject('Rental/RentalHeader/RentalInvoice/ServiceCreditCard.Process'))

WebUI.delay(13)

'Click OK of Print Device'
WebUI.click(findTestObject('Rental/RentalHeader/RentalInvoice/ServiceCreditCard.PrintDevice'))

WebUI.delay(10)

'Click Print Button'
WebUI.click(findTestObject('Rental/RentalHeader/RentalInvoice/ServiceCreditCard.PrintOK'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental/RentalHeader/RentalInvoice/RentalInvoice.CloseRentalInvoicesession'))

WebUI.delay(3)

WebUI.closeBrowser()

