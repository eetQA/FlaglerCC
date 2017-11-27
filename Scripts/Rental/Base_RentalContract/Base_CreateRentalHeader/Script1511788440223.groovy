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

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.Customer'))

WebUI.setText(findTestObject('Rental/RentalHeader/RentalContract.Customer'), BP)

WebUI.delay(2)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.CustPO'))

WebUI.delay(3)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.OtherDetailsTab'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental/RentalHeader/Rental Contract.ModeOfPayment'))

WebUI.delay(2)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.CreditCardoption'))

WebUI.delay(3)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.GeneralTab'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.Newbuttonline'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.SetLine'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Rental/RentalHeader/RentalContract.Unit'), 5)

WebUI.delay(3)

not_run: WebUI.getText(findTestObject('Rental/RentalHeader/RentalContract.Unit'))

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.Unit'))

WebUI.delay(5)

WebUI.setText(findTestObject('Rental/RentalHeader/RentalContract.Unit'), GlobalVariable.G_Unit)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Rental/RentalHeader/RentalContract.MultipleInsurence'), 5)

WebUI.delay(5)

WebUI.doubleClick(findTestObject('Rental/RentalHeader/RentalContract.MultipleInsurence'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.MultipleInsurence'))

not_run: WebUI.doubleClick(findTestObject('Rental/RentalHeader/RentalContract.MultiInsNO'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.MultiInsNO'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Rental/RentalHeader/RentalContract.GrossRateline'), 10)

not_run: WebUI.delay(2)

WebUI.doubleClick(findTestObject('Rental/RentalHeader/RentalContract.GrossRateline'))

WebUI.delay(2)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.GrossRateline'))

WebUI.delay(2)

WebUI.setText(findTestObject('Rental/RentalHeader/RentalContract.GrossRateline'), '100')

WebUI.delay(4)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.SaveHeader'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.Action'))

WebUI.delay(8)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.Release'))

WebUI.delay(12)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.ActionDelivery'))

WebUI.delay(6)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.ConfirmDelivery'))

WebUI.delay(8)

not_run: WebUI.waitForElementPresent(findTestObject('Rental/RentalHeader/RentalContract.DeliveryProceed'), 20)

not_run: WebUI.delay(2)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.DeliveryProceed'))

WebUI.delay(12)

not_run: WebUI.waitForElementPresent(findTestObject('Rental/RentalHeader/RentalContract.ActionDelivery'), 20)

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.SelectDeviceD'))

WebUI.delay(8)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.InspetionReportClose'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.BillofLaddingClosed'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.EqipRentalMemoclosed'))

WebUI.delay(5)

WebUI.click(findTestObject('Rental/RentalHeader/RentalContract.InspectionOrdergnerated'))

