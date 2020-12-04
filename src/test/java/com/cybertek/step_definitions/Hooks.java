package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

// coming from cucumber
public class Hooks {

    @Before(order = 2)// this will run second, by default it runs alphabetical order,if the letters are the same it will run top ti bottom
    public void setUpScenario(){
        System.out.println("----> Before annotation: Setting up browser");
    }


    @After(order = 1)
    public void tearDownScenario(Scenario scenario){
      // System.out.println("scenario.getName() = " + scenario.getName());
       // System.out.println("scenario.getSourceTagNames() = " + scenario.getSourceTagNames());
       // System.out.println("scenario.isFailed() = " + scenario.isFailed());

        // we need to take scree shot using selenium
        if(scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
    }

    @Before(value = "@db", order = 1)  // this will run first
    public void setUpDatabaseConnection(){
        System.out.println("-------> BEFORE ANNOTATION: BD CONNECTION CREATED");
    }

    @After
    public void tearDownDatabaseConnection(){
        System.out.println("--------------> AFTER ANNOTATION: DB CONNECTION CLOSED<-----------");
    }

    @BeforeStep
    public void setUpStep(){
        System.out.println("==============> BEFORE STEP: TAKING SCREENSHOT <===================");
    }

    @AfterStep
    public void tearDownStep(){
        System.out.println("==============> AFTER STEP: TAKING SCREENSHOT <===================");
    }
}
