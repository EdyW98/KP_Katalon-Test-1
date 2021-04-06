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

WebUI.click(findTestObject('Object Create Document/Selected_Docs'))

WebUI.switchToWindowIndex(1)

'Untuk menunggu kesiapan file'
WebUI.delay(40)

WebUI.click(findTestObject('Object Create Document/OnlyOffice Doc Controller/button_OK'))

WebUI.click(findTestObject('Object Create Document/OnlyOffice Doc Controller/SideButton_file'))

WebUI.sendKeys(findTestObject('Object Create Document/OnlyOffice Doc Controller/Canvas_Textarea'), Keys.chord(Keys.LEFT_CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Object Create Document/OnlyOffice Doc Controller/Canvas_Textarea'), 'uji coba edit document')

'Untuk mensave file'
WebUI.delay(10)

WebUI.closeWindowIndex(1)

WebUI.switchToDefaultContent()

