package com.cybertek.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
// this class is central class to run all the classes from one cass
// features and step definitions we chek against each other
//Cucumber options also from jUnit
@RunWith(Cucumber.class) //we using Junit to test, just by itself not enough
@CucumberOptions (

        plugin = {"html:target/cucumber-report.html",
                   "json:target/cucumber.json",
                    "rerun:target/rerun.txt"
        },// everytime it will override reports
        features = "src/test/resources/features", // root path of "features" file
        glue = "com/cybertek/step_definitions",    // source path of "step def" package
        dryRun=false, //will not run the actual implementation of our code
        tags="@wiki"//it runs all the matching scenarios
)
public class CukesRunner {
}
