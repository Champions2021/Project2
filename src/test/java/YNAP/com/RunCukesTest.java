package YNAP.com;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", tags = "@Superbrands",
        plugin = { "html:target/cucumber-html-report",
                "json:target/cucumber-json-report.json",
                "junit:target/cucumber-junit-report.xml",
                "pretty:target/cucumber-pretty-report.txt"}

) //feature brecket ends

public class RunCukesTest {
}


