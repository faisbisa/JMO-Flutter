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

Mobile.setText(findTestObject('Login/android.widget.EditEmail'), 'bluesafif05@gmail.com', 0)

Mobile.tap(findTestObject('Login/android.widget.EditPassword'), 0)

Mobile.setText(findTestObject('Login/android.widget.EditPassword'), 'Welcome2#', 0)

WebUI.delay(3)

Mobile.tap(findTestObject('ProgramJHT/android.view.ViewMasuk'), 0)

WebUI.delay(10)

Mobile.tap(findTestObject('menu/PembayaranIuranBPU/android.widget.ImageVPembayaranIuranBPU'), 0)

Mobile.tap(findTestObject('menu/PembayaranIuranBPU/android.widget.EditTextKPJ'), 0)

Mobile.setText(findTestObject('menu/PembayaranIuranBPU/android.widget.EditTextKPJ'), '3520040511900001', 0)

Mobile.tap(findTestObject('menu/PembayaranIuranBPU/android.view.VcatatanPembayaran'), 0)

Mobile.tap(findTestObject('menu/PembayaranIuranBPU/android.widget.RadioButton1Bulann'), 0)

WebUI.delay(3)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('menu/PembayaranIuranBPU/android.view.VKLikLanjutkankePertinjau'), 0)

Mobile.tap(findTestObject('menu/PembayaranIuranBPU/android.view.VKLiklanjutkeMetodePembayran'), 0)

Mobile.tap(findTestObject('menu/PembayaranIuranBPU/android.widget.IPilihMetodePembayaran'), 0)

Mobile.tap(findTestObject('menu/PembayaranIuranBPU/android.view.VGeraiRitailKerjasama'), 0)

Mobile.tap(findTestObject('menu/PembayaranIuranBPU/GeraiRetail/android.widget.IIndomaret'), 0)

WebUI.delay(3)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('menu/PembayaranIuranBPU/android.view.VKLikBayar'), 0)

WebUI.delay(3)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('menu/PembayaranIuranBPU/android.widget.IBack1'), 0)

Mobile.tap(findTestObject('menu/PembayaranIuranBPU/android.widget.IBack1'), 0)

Mobile.tap(findTestObject('menu/PembayaranIuranBPU/android.widget.IBack1'), 0)

Mobile.tap(findTestObject('menu/PembayaranIuranBPU/android.widget.IBack1'), 0)

Mobile.tap(findTestObject('Profil-UbahKontak/android.widget.IPilihProfil'), 0)

Mobile.tap(findTestObject('Login/android.view.VKeluar'), 0)

Mobile.tap(findTestObject('Login/android.view.VYaKeluar'), 0)

