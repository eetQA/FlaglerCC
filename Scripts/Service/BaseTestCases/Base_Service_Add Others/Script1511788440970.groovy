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

'Open Other session'
WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.Others'))

WebUI.delay(10)

'Click new button'
WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.OthersNew'))

WebUI.delay(5)

'Add cost component'
WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.OthersCostComp'))

WebUI.delay(2)

WebUI.setText(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.OthersCostComp'), CostComp)

WebUI.delay(5)

'right scroll to Actual Qty'
WebUI.scrollToElement(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.Actual Qty'), 5)

WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.Actual Qty'))

WebUI.delay(2)

'Add Actual Qty'
WebUI.sendKeys(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.Actual Qty'), '2')

WebUI.delay(5)

'Click save button'
not_run: WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.OthersSave '))

'Click save & Close button of Other'
WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegmentOthers.SaveClose'))

WebUI.delay(5)

'Click save & Close button of Segment'
WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.SaveClose'))

