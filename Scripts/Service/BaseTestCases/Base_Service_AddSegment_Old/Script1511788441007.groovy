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

WebUI.callTestCase(findTestCase('Service/BaseTestCases/Base_Service_CreateHeader_Old'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.ServiceType'))

WebUI.setText(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.ServiceType'), 'ABC')

not_run: WebUI.sendKeys(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.ServiceType'), Keys.chord(
        Keys.TAB))

WebUI.delay(3)

WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.Save'))

WebUI.delay(10)

WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.Action'))

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.Release'))

WebUI.delay(5)

not_run: WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.FlatRateAll'))

not_run: WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.FlatRateAllValue'))

not_run: WebUI.delay(3)

not_run: WebUI.setText(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.FlatRateAllValue'), 
    '500')

not_run: WebUI.sendKeys(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.FlatRateAllValue'), 
    Keys.chord(Keys.TAB))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.Save'))

not_run: WebUI.delay(3)

WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.Action'))

WebUI.delay(3)

WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.Others'))

WebUI.delay(10)

WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.OthersNew'))

WebUI.delay(5)

WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.OthersCostComp'))

WebUI.delay(2)

WebUI.setText(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.OthersCostComp'), 'APP')

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.Actual Qty'), 5)

WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.Actual Qty'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.Actual Qty'), '2')

WebUI.delay(5)

not_run: WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.OthersSave '))

WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegmentOthers.SaveClose'))

WebUI.delay(5)

WebUI.click(findTestObject('Service/ServiceOrder/ServiceOrderSegment/ServiceOrderSegment.SaveClose'))

