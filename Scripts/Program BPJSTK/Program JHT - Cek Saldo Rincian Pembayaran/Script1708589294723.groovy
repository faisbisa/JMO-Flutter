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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\admin\\AppData\\Roaming\\npm\\node_modules\\appium\\app.apk', true)

Mobile.tap(findTestObject('Object Repository/Login/android.view.View (1)'), 0)

Mobile.tap(findTestObject('Login/android.widget.EditEmail'), 0)

Mobile.setText(findTestObject('Login/android.widget.EditEmail'), 'faisalkurnis12@gmail.com', 0)

Mobile.tap(findTestObject('Login/android.widget.EditPassword'), 0)

Mobile.setText(findTestObject('Login/android.widget.EditPassword'), 'Faisbisa@14', 0)

WebUI.delay(3)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Profil-UbahKontak/android.view.VKlikMasuk'), 0)

WebUI.delay(10)

Mobile.tap(findTestObject('ProgramJHT/android.widget.ImageVJaminanHariTua'), 0)

Mobile.tap(findTestObject('ProgramJHT/JHT-CekSAldo/android.widget.ButtonCekSaldo'), 0)

Mobile.tap(findTestObject('ProgramJHT/JHT-CekSAldo/android.view.VRincianPembayaran'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('ProgramJHT/JHT-CekSAldo/android.widget.IBackDataPesertaTidakSesuai'), 0)

WebUI.delay(3)

Mobile.tap(findTestObject('ProgramJKK/android.widget.IKlikBack2'), 0)

Mobile.tap(findTestObject('Login/android.widget.IProfil'), 0)

Mobile.tap(findTestObject('Login/android.view.VKeluar'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Login/android.view.VYaKeluar'), 0)



