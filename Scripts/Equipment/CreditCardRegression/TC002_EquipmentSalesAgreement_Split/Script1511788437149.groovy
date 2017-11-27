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

'Create Unit through Purchase Order\r\n'
WebUI.callTestCase(findTestCase('Equipment/Base_EquipmentPurchase/EPO_CreateNrecieve'), [('BP') : BP, ('Model') : Model], 
    FailureHandling.STOP_ON_FAILURE)

'Create Sales Agreement Header'
WebUI.callTestCase(findTestCase('Equipment/Base_EquipmentSales/Base_Equipement_CreateHeader'), [('BP') : BP], FailureHandling.STOP_ON_FAILURE)

'Add Line to Agreement'
WebUI.callTestCase(findTestCase('Equipment/Base_EquipmentSales/Base_EquipmentSalesAddLine'), [('Model') : Model], FailureHandling.STOP_ON_FAILURE)

'Deliver the Unit\r\n'
WebUI.callTestCase(findTestCase('Equipment/Base_EquipmentSales/Base_EquipSaleOrderProcessing'), [:], FailureHandling.STOP_ON_FAILURE)

'Invoice th Agreement with Split Payment: 2 CC\'s and remaining Cash'
WebUI.callTestCase(findTestCase('Equipment/Base_EquipmentSales/Base_EquipSaleOrder_Invoice_Split'), [('Gateway') : Gateway
        , ('CardType1') : Cardtype1, ('CCNo1') : CardNumber1, ('CVV1') : CVV1, ('CardType2') : CardType2, ('CCNo2') : CardNumber2
        , ('CVV2') : CVV2], FailureHandling.STOP_ON_FAILURE)

'Get The Invoice details\r\n'
WebUI.callTestCase(findTestCase('Parts/BaseTestCases/Base_Part_GetInvoiceDetails'), [:], FailureHandling.STOP_ON_FAILURE)

'Check invoices in open Entries'
WebUI.callTestCase(findTestCase('Finance/BaseTestCases/Base_Finance_CheckOpenEntriesForCCSplitPayments'), [('BP') : BP], 
    FailureHandling.STOP_ON_FAILURE)

