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

'Create header with Credit Card\r\n'
WebUI.callTestCase(findTestCase('Parts/BaseTestCases/Base_Part_CreateHeader_WithCC_Flagler'), [('BP') : BP], FailureHandling.CONTINUE_ON_FAILURE)

'Add a part line\r\n'
WebUI.callTestCase(findTestCase('Parts/BaseTestCases/Base_Part_AddPartLinePos1'), [('PartName') : PartName, ('Qty') : Qty], 
    FailureHandling.CONTINUE_ON_FAILURE)

'Ship line, Invoice the Order using Credit card\r\n'
WebUI.callTestCase(findTestCase('Parts/BaseTestCases/Base_Part_PickPacknInvoiceWithCC'), [('Gateway') : GateWay, ('CardType') : CardType
        , ('CardNumber') : CardNumber], FailureHandling.STOP_ON_FAILURE)

'Get the invoice details like Invoice No. Invoice Amount'
WebUI.callTestCase(findTestCase('Parts/BaseTestCases/Base_Part_GetInvoiceDetails'), [:], FailureHandling.STOP_ON_FAILURE)

'Check Invoices in Open Entries\r\n'
WebUI.callTestCase(findTestCase('Finance/BaseTestCases/Base_Finance_CheckOpenEntriesForCCInvoice1'), [('BP') : BP], FailureHandling.CONTINUE_ON_FAILURE)

