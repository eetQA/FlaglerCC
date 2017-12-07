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

WebUI.callTestCase(findTestCase('Common/Base_Common_OpenSession'), [('SessionID') : 'erext4100s004'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.Customer'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Rental/RentalHeader/RentalContract.Customer'), BP, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.CustPO'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.OtherDetailsTab'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Rental/RentalHeader/Rental Contract.ModeOfPayment'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.CreditCardoption'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.GeneralTab'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.Newbuttonline'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.SetLine'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Rental/RentalHeader/RentalContract.Unit'), 5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.getText(findTestObject('Rental/RentalHeader/RentalContract.Unit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.Unit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Rental/RentalHeader/RentalContract.Unit'), GlobalVariable.G_Unit, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Rental/RentalHeader/RentalContract.MultipleInsurence'), 8, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Rental/RentalHeader/RentalContract.MultipleInsurence'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(7, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.MultipleInsurence'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.doubleClick(findTestObject('Rental/RentalHeader/RentalContract.MultiInsNO'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.MultiInsNO'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Rental/RentalHeader/RentalContract.GrossRateline'), 10, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Rental/RentalHeader/RentalContract.GrossRateline'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.GrossRateline'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Rental/RentalHeader/RentalContract.GrossRateline'), '100', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.SaveHeader'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.insuranceNo'))

not_run: WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.TextClose'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.Action'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.Release'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.ActionDelivery'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(6, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.ConfirmDelivery'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.waitForElementPresent(findTestObject('Rental/RentalHeader/RentalContract.DeliveryProceed'), 20, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.DeliveryProceed'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(12, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.waitForElementPresent(findTestObject('Rental/RentalHeader/RentalContract.ActionDelivery'), 20, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.SelectDeviceD'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(8, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.InspetionReportClose'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.BillofLaddingClosed'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.EqipRentalMemoclosed'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.InspectionOrdergnerated'), FailureHandling.CONTINUE_ON_FAILURE)

