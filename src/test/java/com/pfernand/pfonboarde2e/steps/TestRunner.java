package com.pfernand.pfonboarde2e.steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",
        glue = "com.pfernand.pfonboarde2e.steps",
        plugin = { "pretty", "html:target/cucumber-html-report", "json:target/cucumber-json-report.json" })
public class TestRunner {
}
