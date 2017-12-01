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

'Service Order>Add Header'
WebUI.callTestCase(findTestCase('Service/BaseTestCases/Base_Service_CreateHeader'), [('BP') : BP, ('Unit') : Unit], FailureHandling.CONTINUE_ON_FAILURE)

'Service Order>Add Segment'
WebUI.callTestCase(findTestCase('Service/BaseTestCases/Base_Service_AddSegment'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Service Order>Add actual for Others'
WebUI.callTestCase(findTestCase('Service/BaseTestCases/Base_Service_Add Others'), [('CostComp') : CostComp], FailureHandling.CONTINUE_ON_FAILURE)

'Service Order>CC Interface details'
WebUI.callTestCase(findTestCase('Service/BaseTestCases/Base_Service_HeaderInvoice'), [('CCNo') : CCNo, ('CVV') : CVV, ('PaymentGate') : PaymentGate_TC1
        , ('CardType') : CardType_TC1], FailureHandling.CONTINUE_ON_FAILURE)

'Service Order>Header Invoice Details ie read invoice series and amount'
WebUI.callTestCase(findTestCase('Service/BaseTestCases/Base_Service_GetInvoice'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Service Order>Check open entries for CC BP and Invoice BP'
WebUI.callTestCase(findTestCase('Finance/BaseTestCases/Base_Finance_CheckOpenEntriesForCCInvoice1'), [('BP') : BP], FailureHandling.CONTINUE_ON_FAILURE)

