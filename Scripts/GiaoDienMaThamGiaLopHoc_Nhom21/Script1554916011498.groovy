import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hoclieu.sachmem.vn/folder/0')

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_ng nhp'))

WebUI.setText(findTestObject('Page_ng nhp  Sch Mm/input_a ch email_useremail'), 'taipham1803@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_ng nhp  Sch Mm/input_Mt khu_userpassword'), '5Ed5CIkj9UQfaMZXAkDVaQ==')

WebUI.click(findTestObject('Page_ng nhp  Sch Mm/input_Qun mt khu_commit'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Lp hc ca ti'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Lp Test 01'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_M tham gia lp hc'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Page_Hc liu - Sch Mm/div_M tham gia lp hc_1'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_M tham gia lp hc_1'))

WebUI.verifyElementVisible(findTestObject('Page_Hc liu - Sch Mm/p_Ngi hc s dng m  tham gia lp bng cch'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/p_Ngi hc s dng m  tham gia lp bng cch'))

WebUI.verifyElementVisible(findTestObject('Page_Hc liu - Sch Mm/div_ickvwew               i m'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_ickvwew               i m'))

WebUI.verifyElementVisible(findTestObject('Page_Hc liu - Sch Mm/span_Hot ng_slider'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/span_Hot ng_slider'))

WebUI.verifyElementVisible(findTestObject('Page_Hc liu - Sch Mm/div_M tham gia lm bi tp'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_M tham gia lm bi tp'))

WebUI.closeBrowser()

