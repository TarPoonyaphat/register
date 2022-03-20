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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://alumni2.cyberlifecafe.com/index.php/register?fbclid=IwAR2ZeFoAn4pRL44gAy63FCZcXnVhZQpZ_t6ps3HTwOAb9tJqlZLYLrXtr0k')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_------------------------------'), 'คณะวิทยาศาสตร์และเทคโนโลยี', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_Register/input__major'), 'วิศวกรรมซอฟต์แวร์')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__section'), '63/50')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__first_year'), '2563')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__stu_id'), '634259011')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input__password'), 'VEmn5ejdGauBjttVaPSiHg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input__confpassword'), 'VEmn5ejdGauBjttVaPSiHg==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_-------'), 'นาย', true)

WebUI.setText(findTestObject('Object Repository/Page_Register/input__FName'), 'ปุญญะพัฒน์')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__LName'), 'ใจชน')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_()_FName_eng'), 'POONYAPHAT')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_()_LName_eng'), 'JHAICHON')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__id_cardnumber'), '1718800023004')

WebUI.click(findTestObject('Object Repository/Page_Register/input__sex'))

WebUI.setText(findTestObject('Object Repository/Page_Register/input__province_birth'), 'กาญจนบุรี')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__nationality'), 'ไทย')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__religion'), 'พุทธ')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register/select_aria-labelDefault select example    _b43a68'), 
    'B', true)

WebUI.setText(findTestObject('Object Repository/Page_Register/input__phone_number'), '0989142951')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__Address'), '49หมู่1')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__SubDistrict'), 'ท่ามะกา')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__District'), 'ท่ามะกา')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__Province'), 'กาญจนบุรี')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__Zipcode'), '71120')

WebUI.click(findTestObject('Object Repository/Page_Register/button_'))

