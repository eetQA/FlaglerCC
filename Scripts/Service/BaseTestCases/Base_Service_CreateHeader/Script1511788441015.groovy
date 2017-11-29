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

'Call a Open Session TC'
WebUI.callTestCase(findTestCase('Common/Base_Common_OpenSession'), [('SessionID') : 'tssoc2100m001'], FailureHandling.CONTINUE_ON_FAILURE)

'Create a new Service Order'
WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderHeader/ServiceOrderHeader.Newbutton'))

WebUI.delay(8)

WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderHeader/ServiceOrderHeader.Customer'))

WebUI.delay(2)

'Add new BP '
WebUI.sendKeys(findTestObject('Service/ServiceOrder/ServiceOrderHeader/ServiceOrderHeader.Customer'), 'BP0009610')

WebUI.sendKeys(findTestObject('Service/ServiceOrder/ServiceOrderHeader/ServiceOrderHeader.Customer'), Keys.chord(Keys.TAB))

WebUI.delay(3)

WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderHeader/ServiceOrderHeader.Unit'))

WebUI.delay(2)

'Add new Unit'
WebUI.sendKeys(findTestObject('Service/ServiceOrder/ServiceOrderHeader/ServiceOrderHeader.Unit'), 'EQ0128249')

WebUI.delay(5)

'Save a Service Order'
WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderHeader/ServiceOrderHeader.Save'))

WebUI.delay(2)

'Skip warning messages'
WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderHeader/ServiceOrderHeader.Warning'))

WebUI.delay(3)

'Select a Payment Mode'
WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderHeader/ServiceOrderHeader.PaymentMode'))

WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderHeader/ServiceOrderHeader.CreditCardoption'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

'Not required to add Credit Card No here'
not_run: WebUI.setText(findTestObject('Service/ServiceOrder/ServiceOrderHeader/ServiceOrderHeader.CCNo'), '6035180003002215')

'Save a Service Order Header'
WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderHeader/ServiceOrderHeader.Save'))

WebUI.delay(5)

'Check generated Service Order No'
SWOOrderNo = WebUI.getAttribute(findTestObject('Service/ServiceOrder/ServiceOrderHeader/ServiceOrderHeader.OrderNo'), 'value')

WebUI.verifyNotEqual(SWOOrderNo, '')

WebUI.delay(5)

'Click on Action for the Segment selection'
WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderHeader/ServiceOrderHeader.Actions'))

WebUI.delay(3)

'Select Segment'
WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderHeader/ServiceOrderHeader.Segments'))

WebUI.delay(3)

