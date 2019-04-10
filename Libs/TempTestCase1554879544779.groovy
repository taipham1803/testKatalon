import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/45/x_q7dlqn08jf6t5xwpbwcnm80000gn/T/Katalon/20190410_135851/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'https://hoclieu.sachmem.vn/folder/0\')\n\nWebUI.click(findTestObject(\'Page_Hc liu - Sch Mm/a_ng nhp\'))\n\nWebUI.delay(1)\n\nWebUI.setText(findTestObject(\'Page_ng nhp  Sch Mm/input_a ch email_useremail\'), \'vmhieu17@gmail.com\')\n\nWebUI.delay(1)\n\nWebUI.setEncryptedText(findTestObject(\'Page_ng nhp  Sch Mm/input_Mt khu_userpassword\'), \'RigbBhfdqOBGNlJIWM1ClA==\')\n\nWebUI.delay(1)\n\nWebUI.click(findTestObject(\'Page_ng nhp  Sch Mm/input_Qun mt khu_commit\'))\n\nWebUI.delay(1)\n\nWebUI.click(findTestObject(\'Page_Hc liu - Sch Mm/a_Lp hc ca ti\'))\n\nWebUI.delay(1)\n\nWebUI.click(findTestObject(\'Page_Hc liu - Sch Mm/a_Tham gia lp\'))\n\nWebUI.delay(1)\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Hc liu - Sch Mm/input_M tham gia lp hc_form-control ng-touched ng-dirty ng-valid\'), \n    \'axjcnlbcc\')\n\nWebUI.delay(1)\n\nWebUI.click(findTestObject(\'Page_Hc liu - Sch Mm/input_M tham gia lp hc_btn btn-primary\'))\n\nWebUI.delay(1)\n\nWebUI.click(findTestObject(\'Object Repository/Page_Hc liu - Sch Mm/div_Thnh cng\'))\n\n', FailureHandling.STOP_ON_FAILURE, true)

