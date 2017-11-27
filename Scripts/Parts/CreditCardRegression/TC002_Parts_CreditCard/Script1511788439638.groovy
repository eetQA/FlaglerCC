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

'Create Part Sales Order header with cc'
WebUI.callTestCase(findTestCase('Parts/BaseTestCases/Base_Part_CreateHeader_WithCC'), [('BP') : BP], FailureHandling.CONTINUE_ON_FAILURE)

'Add Line\r\n'
WebUI.callTestCase(findTestCase('Parts/BaseTestCases/Base_Part_AddPartLinePos1'), [('PartName') : Part, ('Qty') : Qty], 
    FailureHandling.CONTINUE_ON_FAILURE)

'Invoice through Split Payment two cc and one cash\r\n'
WebUI.callTestCase(findTestCase('Parts/BaseTestCases/Base_Part_PickPacknInvoiceWithCCSplitPayment'), [('Gateway') : Gateway
        , ('CardType1') : cctype1, ('CardNumber1') : cc1, ('CVV1') : cvv1, ('CardType2') : ctype2, ('CVV2') : cvv2, ('CardNumber2') : cc2], 
    FailureHandling.STOP_ON_FAILURE)

'Get Invoice Details\r\n'
WebUI.callTestCase(findTestCase('Parts/BaseTestCases/Base_Part_GetInvoiceDetails'), [:], FailureHandling.STOP_ON_FAILURE)

'Check invoices in Open Entries'
WebUI.callTestCase(findTestCase('Finance/BaseTestCases/Base_Finance_CheckOpenEntriesForCCSplitPayments'), [('BP') : 'M00000182'], 
    FailureHandling.STOP_ON_FAILURE)

