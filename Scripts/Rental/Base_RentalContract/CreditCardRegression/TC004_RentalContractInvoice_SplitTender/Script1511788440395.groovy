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

'Purchase Unit using EPO'
WebUI.callTestCase(findTestCase('Equipment/Base_EquipmentPurchase/EPO_CreateNrecieve'), [('BP') : BP, ('Model') : Model], 
    FailureHandling.CONTINUE_ON_FAILURE)

'Create a Rental Header using above Unit'
WebUI.callTestCase(findTestCase('Rental/Base_RentalContract/Base_CreateRentalInvoice_HeaderlineInvoice_SplitTender'), [('PaymentGatwayTC') : PaymentGatwayTC
        , ('CardType1') : CardType1, ('CCNo1') : CCNo1, ('CVV1') : CVVNo1, ('CardType2') : CardType2, ('CCNo2') : CCNo2, ('CVV2') : CVVNo2
        , ('BP') : BP], FailureHandling.CONTINUE_ON_FAILURE)

'Create Rental Invoice using CC _Split Tender'
WebUI.callTestCase(findTestCase('Rental/Base_RentalContract/Base_CreateRentalInvoicewithSpitTenderDetails_SplitTender'), 
    [('PaymentGatwayTC') : PaymentGatwayTC, ('CardType1') : CardType1, ('CCNo1') : CCNo1, ('CVV1') : CVVNo1, ('CardType2') : CardType2
        , ('CCNo2') : CCNo2, ('CVV2') : CVVNo2], FailureHandling.CONTINUE_ON_FAILURE)

