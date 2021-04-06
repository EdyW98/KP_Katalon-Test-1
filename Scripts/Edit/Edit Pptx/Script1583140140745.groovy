import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Object Create Presentation/Selected_Ppt'))

WebUI.switchToWindowIndex(1)

WebUI.maximizeWindow()

'Menunggu kesiapan file'
WebUI.delay(60)

WebUI.click(findTestObject('Object Create Presentation/OnlyOffice Ppt Controller/button_OK'))

WebUI.click(findTestObject('Object Create Presentation/OnlyOffice Ppt Controller/sideButton_file'))

'Menunggu elemen web'
WebUI.waitForElementPresent(findTestObject('Object Create Presentation/OnlyOffice Ppt Controller/notes_overlay'), 10)

WebUI.click(findTestObject('Object Create Presentation/OnlyOffice Ppt Controller/notes_overlay'))

WebUI.sendKeys(findTestObject('Object Create Presentation/OnlyOffice Ppt Controller/Active_Textarea'), Keys.chord(Keys.LEFT_CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Object Create Presentation/OnlyOffice Ppt Controller/Active_Textarea'), 'Percobaan Edit File')

WebUI.delay(10)

WebUI.clickOffset(findTestObject('Object Create Presentation/OnlyOffice Ppt Controller/viewer_overlay'), 0, -18)

WebUI.sendKeys(findTestObject('Object Create Presentation/OnlyOffice Ppt Controller/Active_Textarea'), 'Ku Telah Mati, Dan Tinggalkan')

'Menunggu prosess auto save'
WebUI.delay(10)

WebUI.closeWindowIndex(1)

WebUI.switchToDefaultContent()

