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

WebUI.callTestCase(findTestCase('Common/Base_Common_OpenSession'), [('SessionID') : 'ttaad4500'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Parts/cisli245/cisli245_package'))

WebUI.setText(findTestObject('Parts/cisli245/cisli245_package'), 'ci')

WebUI.doubleClick(findTestObject('Parts/cisli245/cisli245_module'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Parts/cisli245/cisli245_module'), 'sli')

WebUI.doubleClick(findTestObject('Parts/cisli245/cisli245_table'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Parts/cisli245/cisli245_table'), '245')

WebUI.click(findTestObject('Parts/cisli245/cisli245_ok'))

not_run: WebUI.doubleClick(findTestObject('ttaad4500/input_ttaad4500    -0-flno-loo'))

WebUI.click(findTestObject('Parts/cisli245/cisli245_find'))

WebUI.delay(2)

WebUI.click(findTestObject('Parts/cisli245/cisli245_SaleOrder'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Parts/cisli245/cisli245_SaleOrder'), GlobalVariable.G_Part_PSO)

WebUI.delay(2)

WebUI.click(findTestObject('Parts/cisli245/cisli245_oksearch'))

WebUI.delay(3)

order = WebUI.getAttribute(findTestObject('Parts/cisli245/cisli245_OrderNo'), 'value')

for (int i = 0; i = 100; i++) {
    order = WebUI.getAttribute(findTestObject('Parts/cisli245/cisli245_OrderNo'), 'value')

    if (order != GlobalVariable.G_Part_PSO) {
        WebUI.click(findTestObject('Parts/cisli245/cisli245_Previous'))

        WebUI.delay(3)
    } else {
        break
    }
}

GlobalVariable.G_InvoiceTnxType = WebUI.getAttribute(findTestObject('Parts/cisli245/cisli245_invoice1'), 'value')

GlobalVariable.G_InvoiceTnxNo = WebUI.getAttribute(findTestObject('Parts/cisli245/cisli245_invoice2'), 'value')

GlobalVariable.G_InvoiceAmt = WebUI.getAttribute(findTestObject('Parts/cisli245/cisli245_amount'), 'value')

