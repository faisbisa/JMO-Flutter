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

Mobile.tap(findTestObject('menu/Sertakan/HalmanPertama/android.widget.IKlikMenuSertakan'), 0)

Mobile.tap(findTestObject('menu/Sertakan/HalmanPertama/android.widget.CheckBoxSayaSetuju'), 0)

Mobile.tap(findTestObject('menu/Sertakan/HalmanPertama/android.view.VKlikLanjutkan'), 0)

Mobile.tap(findTestObject('menu/Sertakan/HalmanPertama/android.widget.IPilihJKK JKM JHT'), 0)

Mobile.scrollToText('IPilihRataRataPendapatanPerbulan', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('menu/Sertakan/HalmanPertama/android.widget.IPilihRata-rataPendapatanPerBulan'), 0)

Mobile.tap(findTestObject('menu/Sertakan/HalmanPertama/android.view.VPilih19'), 0)

Mobile.tap(findTestObject('menu/Sertakan/HalmanPertama/android.widget.IPilihPeriodePembayaran'), 0)

Mobile.tap(findTestObject('menu/Sertakan/HalmanPertama/android.view.V6bulan'), 0)

Mobile.tap(findTestObject('menu/Sertakan/HalmanPertama/android.widget.IPilihLokasiBekerja'), 0)

Mobile.tap(findTestObject('menu/Sertakan/HalmanPertama/android.widget.IBali'), 0)

Mobile.tap(findTestObject('menu/Sertakan/HalmanPertama/android.widget.IGianyar'), 0)

Mobile.tap(findTestObject('menu/Sertakan/HalmanPertama/android.widget.CheckBoxSayaSetujudiPilihProgram'), 0)

WebUI.delay(3)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('menu/Sertakan/HalmanPertama/android.view.VKonfirmasi'), 0)

Mobile.tap(findTestObject('menu/Sertakan/LengkapiDataDiri/android.widget.EInputNIK'), 0)

Mobile.setText(findTestObject('menu/Sertakan/LengkapiDataDiri/android.widget.EInputNIK'), '3520040511900001', 0)

Mobile.tap(findTestObject('menu/Sertakan/LengkapiDataDiri/android.widget.EInputNamaLengkap'), 0)

Mobile.setText(findTestObject('menu/Sertakan/LengkapiDataDiri/android.widget.EInputNamaLengkap'), 'Fais Alkurnis', 0)

Mobile.tap(findTestObject('menu/Sertakan/LengkapiDataDiri/android.widget.IPilihTanggal'), 0)

Mobile.tap(findTestObject('menu/Sertakan/LengkapiDataDiri/khususTglLahir/android.widget.ButtonPilihBulanFebruari'), 0)

Mobile.tap(findTestObject('menu/Sertakan/LengkapiDataDiri/khususTglLahir/android.widget.Button2011'), 0)

Mobile.tap(findTestObject('menu/Sertakan/LengkapiDataDiri/khususTglLahir/android.widget.ButtonPilihBulanFebruari'), 0)

Mobile.tap(findTestObject('menu/Sertakan/LengkapiDataDiri/khususTglLahir/android.widget.Button2005'), 0)

Mobile.tap(findTestObject('menu/Sertakan/LengkapiDataDiri/khususTglLahir/android.widget.ButtonPilihBulanFebruari'), 0)

Mobile.tap(findTestObject('menu/Sertakan/LengkapiDataDiri/khususTglLahir/android.widget.Button1999'), 0)

Mobile.tap(findTestObject('menu/Sertakan/LengkapiDataDiri/khususTglLahir/android.widget.ButtonPilihBulanFebruari'), 0)

Mobile.tap(findTestObject('menu/Sertakan/LengkapiDataDiri/khususTglLahir/android.widget.Button1993'), 0)

Mobile.tap(findTestObject('menu/Sertakan/LengkapiDataDiri/khususTglLahir/android.widget.ButtonNext'), 0)

Mobile.tap(findTestObject('menu/Sertakan/LengkapiDataDiri/khususTglLahir/android.widget.ButtonNext'), 0)

Mobile.tap(findTestObject('menu/Sertakan/LengkapiDataDiri/khususTglLahir/android.widget.ButtonNext'), 0)

Mobile.tap(findTestObject('menu/Sertakan/LengkapiDataDiri/khususTglLahir/android.widget.ButtonNext'), 0)

Mobile.tap(findTestObject('menu/Sertakan/LengkapiDataDiri/khususTglLahir/android.widget.ButtonNext'), 0)

Mobile.tap(findTestObject('menu/Sertakan/LengkapiDataDiri/khususTglLahir/android.widget.ButtonNext'), 0)

Mobile.tap(findTestObject('menu/Sertakan/LengkapiDataDiri/khususTglLahir/android.view.VKlik14'), 0)

Mobile.tap(findTestObject('menu/Sertakan/LengkapiDataDiri/khususTglLahir/android.widget.ButtonOK'), 0)

Mobile.tap(findTestObject('menu/Sertakan/LengkapiDataDiri/android.widget.EInputAlamat'), 0)

Mobile.setText(findTestObject('menu/Sertakan/LengkapiDataDiri/android.widget.EInputAlamat'), 'Gang Senggol Dong', 0)

Mobile.tap(findTestObject('menu/Sertakan/LengkapiDataDiri/android.widget.IPilihKotadanKecamatan'), 0)

Mobile.tap(findTestObject('menu/Sertakan/LengkapiDataDiri/android.view.VPilihUbud1'), 0)

WebUI.delay(3)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('menu/Sertakan/LengkapiDataDiri/android.view.VKlikLanjutkankeDetailPekerjaan'), 0)

Mobile.tap(findTestObject('menu/Sertakan/DetailPekerjaan/android.widget.IPilihJenisPekerjaanPertama'), 0)

Mobile.setText(findTestObject('menu/Sertakan/DetailPekerjaan/android.widget.IPilihJenisPekerjaanPertama'), 'Pengaca', 0)

Mobile.tap(findTestObject('menu/Sertakan/DetailPekerjaan/android.view.VPengacara'), 0)

Mobile.tap(findTestObject('menu/Sertakan/DetailPekerjaan/android.widget.IJenisPekerjaanKedua'), 0)

Mobile.tap(findTestObject('menu/Sertakan/DetailPekerjaan/android.view.VSiswaKerjaPraktik'), 0)

WebUI.delay(3)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('menu/PembayaranIuranBPU/android.view.VKLikLanjutkankePertinjau'), 0)

Mobile.tap(findTestObject('menu/Sertakan/PertinjaudanVerifNoHP/android.widget.CheckBoxSayaSetuju'), 0)

WebUI.delay(3)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('menu/Sertakan/PertinjaudanVerifNoHP/android.view.VKLikKonfirmasi'), 0)

Mobile.tap(findTestObject('menu/Sertakan/PertinjaudanVerifNoHP/android.widget.EditTextNoHP'), 0)

Mobile.setText(findTestObject('menu/Sertakan/PertinjaudanVerifNoHP/android.widget.EditTextNoHP'), '087882040290', 0)

WebUI.delay(3)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('menu/Sertakan/PertinjaudanVerifNoHP/android.view.VKlikSelanjutnya'), 0)

Mobile.tap(findTestObject('menu/Sertakan/PertinjaudanVerifNoHP/android.widget.IKlikBack1'), 0)

Mobile.tap(findTestObject('menu/Sertakan/PertinjaudanVerifNoHP/android.widget.IKlikBack1'), 0)

Mobile.tap(findTestObject('menu/Sertakan/PertinjaudanVerifNoHP/android.widget.IKlikBack1'), 0)

Mobile.tap(findTestObject('menu/Sertakan/PertinjaudanVerifNoHP/android.widget.IKlikBack1'), 0)

Mobile.tap(findTestObject('menu/Sertakan/PertinjaudanVerifNoHP/android.widget.IKlikBack1'), 0)

Mobile.tap(findTestObject('menu/Sertakan/PertinjaudanVerifNoHP/android.widget.IKlikBack1'), 0)

Mobile.tap(findTestObject('Profil-UbahKontak/android.widget.IPilihProfil'), 0)

Mobile.tap(findTestObject('Login/android.view.VKeluar'), 0)

Mobile.tap(findTestObject('Login/android.view.VYaKeluar'), 0)

Mobile.tap(findTestObject('menu/Sertakan/LengkapiDataDiri/khususTglLahir/android.widget.ButtonNext'), 0)

Mobile.tap(findTestObject('menu/Sertakan/PertinjaudanVerifNoHP/android.widget.IKlikBack1'), 0)

