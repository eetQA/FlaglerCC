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

WebUI.callTestCase(findTestCase('Common/Base_Common_OpenSession'), [('SessionID') : 'tfacr2520m000'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Finance/BaseTestCases_OpenEntries_Service/OpenEntries_DocumentType'))

WebUI.click(findTestObject('Finance/BaseTestCases_OpenEntries_Service/OpenEntries_DocumentNo'))

WebUI.setText(findTestObject('Finance/BaseTestCases_OpenEntries_Service/OpenEntries_DocumentType'), GlobalVariable.G_InvoiceTnxType)

not_run: WebUI.sendKeys(findTestObject('Finance/BaseTestCases_OpenEntries_Service/OpenEntries_DocumentType'), Keys.chord(
        Keys.TAB))

not_run: WebUI.delay(3)

WebUI.setText(findTestObject('Finance/BaseTestCases_OpenEntries_Service/OpenEntries_DocumentNo'), GlobalVariable.G_InvoiceTnxNo)

not_run: WebUI.delay(3)

not_run: WebUI.sendKeys(findTestObject('Finance/BaseTestCases_OpenEntries_Service/OpenEntries_DocumentNo'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('Finance/BaseTestCases_OpenEntries_Service/OpenEntries_Action'))

WebUI.click(findTestObject('Finance/BaseTestCases_OpenEntries_Service/OpenEntries.FullyPaid'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Finance/BaseTestCases_OpenEntries_Service/OpenEntries.BalanceAmt'), 5)

WebUI.delay(3)

BalanceAmount = WebUI.getText(findTestObject('Finance/BaseTestCases_OpenEntries_Service/OpenEntries.BalanceAmt'))

'Balance amount for invoice against customer should be (OrderAmt-cc1-cc2) i.e. cash'
WebUI.verifyEqual(BalanceAmount, GlobalVariable.G_SplitInvoiceAmt2)

WebUI.click(findTestObject('Finance/BaseTestCases_OpenEntries_Service/OpenEntries.Reference'))

WebUI.setText(findTestObject('Finance/BaseTestCases_OpenEntries_Service/OpenEntries_DocumentType'), '')

WebUI.setText(findTestObject('Finance/BaseTestCases_OpenEntries_Service/OpenEntries_DocumentNo'), '')

WebUI.sendKeys(findTestObject('Finance/BaseTestCases_OpenEntries_Service/OpenEntries_DocumentType'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Finance/BaseTestCases_OpenEntries_Service/OpenEntries_DocumentNo'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Finance/BaseTestCases_OpenEntries_Service/OpenEntries.Reference'), ((((BP + ' (') + GlobalVariable.G_InvoiceTnxType) + 
    '/') + GlobalVariable.G_InvoiceTnxNo) + ')')

WebUI.click(findTestObject('Finance/BaseTestCases_OpenEntries_Service/OpenEntries_DocumentNo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Finance/BaseTestCases_OpenEntries_Service/OpenEntries.BalanceAmt'), 5)

'Check CC1 order amount is equals to balance amt in Line1'
BalanceAmount = WebUI.getText(findTestObject('Finance/BaseTestCases_OpenEntries_Service/OpenEntries.BalanceAmt'))

WebUI.verifyEqual(BalanceAmount, GlobalVariable.G_SplitInvoiceAmt1)

'Check CC1 order amount is equals to balance amt in Line1'
BalanceAmount = WebUI.getText(findTestObject('Finance/BaseTestCases_OpenEntries_Service/OpenEntries_BalanceAmtLine2'))

WebUI.verifyEqual(BalanceAmount, GlobalVariable.G_SplitInvoiceAmt1)

WebUI.delay(3)

WebUI.closeBrowser()

