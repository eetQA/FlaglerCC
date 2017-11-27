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

WebUI.delay(5)

'Click Header Action button'
WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderHeader/ServiceOrderHeader.Actions'))

WebUI.delay(3)

'Click on Costing'
WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderHeader/ServiceOrderHeader.Costing'))

WebUI.delay(5)

'Skip Re-price message'
WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderHeader/ServiceOrderHeader.RepriceWarning'))

WebUI.delay(3)

'Click Yes on Cost Process to be Continue'
WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderHeader/ServiceOrderHeader.CostingProcessCont'))

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

'Click Yes on Invoice Process to be Continue'
WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderHeader/ServiceOrderHeader.InvoiceCont'))

WebUI.delay(5)

'Wait for  to open a Payment Gateway'
not_run: WebUI.waitForElementPresent(findTestObject('Service/ServiceOrder/ServiceCreditCard/ServiceCreditCard.PaymentGateway'), 
    20)

not_run: WebUI.doubleClick(findTestObject('Service/ServiceOrder/ServiceCreditCard/ServiceCreditCard.PaymentGateway'))

not_run: WebUI.delay(5)

'Click on Payment Gateway'
not_run: WebUI.click(findTestObject('Service/ServiceOrder/ServiceCreditCard/ServiceCreditCard.PaymentGateway'))

WebUI.delay(2)

'Pass Payment Gateway variable'
WebUI.setText(findTestObject('Service/ServiceOrder/ServiceCreditCard/ServiceCreditCard.PaymentGateway'), PaymentGate)

not_run: WebUI.sendKeys(findTestObject('Service/ServiceOrder/ServiceCreditCard/ServiceCreditCard.PaymentGateway'), Keys.chord(
        Keys.TAB))

'Click on Card Type'
WebUI.doubleClick(findTestObject('Service/ServiceOrder/ServiceCreditCard/ServiceCreditCard.CardType'))

'Pass Card Type variable '
WebUI.setText(findTestObject('Service/ServiceOrder/ServiceCreditCard/ServiceCreditCard.CardType'), CardType)

WebUI.delay(2)

'Select CC No.'
WebUI.doubleClick(findTestObject('Service/ServiceOrder/ServiceCreditCard/ServiceCreditCard.Enter CC No'))

'Pass CC No Variable'
WebUI.sendKeys(findTestObject('Service/ServiceOrder/ServiceCreditCard/ServiceCreditCard.Enter CC No'), CCNo)

WebUI.delay(2)

'Click on CVV '
WebUI.click(findTestObject('Service/ServiceOrder/ServiceCreditCard/ServiceCreditCard.CVV2'))

'Pass CVV variable'
WebUI.sendKeys(findTestObject('Service/ServiceOrder/ServiceCreditCard/ServiceCreditCard.CVV2'), CVV)

not_run: WebUI.sendKeys(findTestObject('Service/ServiceOrder/ServiceCreditCard/ServiceCreditCard.Enter CC No'), Keys.chord(
        Keys.TAB))

not_run: WebUI.delay(3)

WebUI.delay(3)

'Enter Expiry Month 09'
WebUI.setText(findTestObject('Service/ServiceOrder/ServiceCreditCard/ServiceCreditCard.ExpiryMonth'), '09')

'Enter Expiry Year 99'
WebUI.setText(findTestObject('Service/ServiceOrder/ServiceCreditCard/ServiceCreditCard.ExpiryYear'), '99')

'Click on Process button of CC Interface'
WebUI.click(findTestObject('Service/ServiceOrder/ServiceCreditCard/ServiceCreditCard.Process'))

WebUI.delay(13)

'Click Print Button'
WebUI.click(findTestObject('Service/ServiceOrder/ServiceCreditCard/ServiceCreditCard.PrintOK'))

WebUI.delay(10)

'Click OK of Print Device'
WebUI.click(findTestObject('Service/ServiceOrder/ServiceCreditCard/ServiceCreditCard.PrintDevice'))

WebUI.delay(5)

