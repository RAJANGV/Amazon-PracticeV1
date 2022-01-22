package Apphooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.qa.factory.DriverFactory;
import com.qa.util.Configreader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.messages.internal.com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;

public class Applicationhooks {

	private DriverFactory driverfactory;
private WebDriver Driver;
private Configreader configreader;
Properties prop; 

@Before(order=0)

public void getProperty()
{
	configreader = new Configreader();
	prop = configreader.init_prop();
	
}

@Before(order=1)

public void launchbrowser()	
{
	
	String browserName = prop.getProperty("browser");
	driverfactory = new DriverFactory();
Driver  = driverfactory.init_Driver(browserName);

}


//@After(order =0)
//public void quitbrowser()
//{
//Driver.quit();	
//}

@After(order=1)
public void teardown(Scenario scenario)
{
	
	if(scenario.isFailed())
	{
		String screenshotName = scenario.getName().replaceAll(" ", "_");
	byte[] sourcePath = ((TakesScreenshot) Driver).getScreenshotAs(OutputType.BYTES);
	scenario.attach(sourcePath, "image/png", screenshotName);
	}
	}
	}

