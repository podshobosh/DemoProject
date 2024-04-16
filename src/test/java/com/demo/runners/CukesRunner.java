package com.demo.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin =  {"html:target/cucumber-reports.html",
                   "rerun:target/rerun.txt",
                   "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",
        glue = {"com/demo/step_definition"},
        dryRun = false,
        tags = "@register",
        publish = true // generates the report with public link




)
public class CukesRunner{
}
