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

'Create a Unit For Sale through Purchase Order'
WebUI.callTestCase(findTestCase('Equipment/Base_EquipmentPurchase/EPO_CreateNrecieve'), [('BP') : BP, ('Model') : Model], 
    FailureHandling.STOP_ON_FAILURE)

'Create Equipment Agreement Header\r\n'
WebUI.callTestCase(findTestCase('Equipment/Base_EquipmentSales/Base_Equipement_CreateHeader'), [('BP') : BP], FailureHandling.STOP_ON_FAILURE)

'Add Line to Agreement'
WebUI.callTestCase(findTestCase('Equipment/Base_EquipmentSales/Base_EquipmentSalesAddLine'), [('Model') : Model], FailureHandling.STOP_ON_FAILURE)

'Deliver the Unit'
WebUI.callTestCase(findTestCase('Equipment/Base_EquipmentSales/Base_EquipSaleOrderProcessing'), [:], FailureHandling.STOP_ON_FAILURE)

'Invoice the Agreement through CC Interface'
WebUI.callTestCase(findTestCase('Equipment/Base_EquipmentSales/Base_EquipSaleOrder_Invoice_cc'), [('Gateway') : Gateway, ('CardType') : CCType
        , ('CCNo') : CC, ('CVV') : CVV], FailureHandling.STOP_ON_FAILURE)

'Get Invoice Details'
WebUI.callTestCase(findTestCase('Parts/BaseTestCases/Base_Part_GetInvoiceDetails'), [:], FailureHandling.STOP_ON_FAILURE)

'Check the invoices in Open Entries\r\n'
WebUI.callTestCase(findTestCase('Finance/BaseTestCases/Base_Finance_CheckOpenEntriesForCCInvoice1'), [('BP') : BP], FailureHandling.STOP_ON_FAILURE)

